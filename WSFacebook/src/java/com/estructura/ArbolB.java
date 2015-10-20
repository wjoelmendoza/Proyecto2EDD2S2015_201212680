/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estructura;

import graphViz.GraphViz;
import java.io.File;


/**
 *
 * @author walter
 */
public class ArbolB {
    private GraphViz gv;
    private Pagina raiz;
    private Pagina aux;
    private PilaInsercion auxi;
    private PilaPaginas auxP;
    int n;
    StringBuilder datos;
    
    public ArbolB(){
        auxi =new PilaInsercion();
        auxP = new PilaPaginas();
        n=0;
       // raiz= new Pagina();
    }
    
    
    private boolean buscarNodo(Pagina act, Perfil clave, Localizar k){
        boolean encontrado=false;
      //  System.out.println(k.getIndex());
        if(clave.menorQue(act.claves[1])){
            k.setIndex(0);
            return false;
        }else{
            k.setIndex(act.getCuentas());
            
            while (clave.menorQue(act.claves[k.getIndex()])&& k.getIndex()>1){
            //    System.out.println(k);
                k.setIndex(k.getIndex()-1);
            }
            encontrado = clave.igualA(act.claves[k.getIndex()]);
            return encontrado;
        }
        
    }
    
    public Perfil buscarElemento(Perfil clave){
        Localizar indice = new Localizar();
        indice.setIndex(0);
        Pagina pagina; 
        pagina = buscar(raiz, clave, indice);
      //  System.out.println(indice);
        if(pagina != null)
            return pagina.claves[indice.getIndex()];
        else
            return null;
    }
    
    private Pagina buscar(Pagina act, Perfil clave,Localizar indice){
        
        if(act == null){
            return null;
        }else{
            boolean encontrado = buscarNodo(act, clave,indice);
            if(encontrado){
                return act;
            }else{
                return buscar(act.ramas[indice.getIndex()], clave, indice);
            }
        }
        
    }
    
    public void insertarClave(Perfil clave){
        raiz = insertar(raiz, clave);
    }
    
    private Pagina insertar(Pagina act, Perfil clave){
        Mover subeArriba= new Mover(false);
        Perfil mediana= new Perfil();
        Pagina nd = null;
        nd =empujar(act,clave,subeArriba, mediana, nd);
                
        if(subeArriba.getValor()){
            Pagina p = new Pagina();
            p.setCuentas(1);
            p.claves[1] =auxi.pop();
            p.ramas[0] = act;
            p.ramas[1] = aux;
            act = p;
            aux=null;
            return act;
        }else
            return act;
    }
    
    private Pagina empujar(Pagina act, Perfil clave,Mover subeArriba, Perfil mediana, Pagina nuevo){
        Localizar k= new Localizar();
        k.setIndex(1);

        if (act == null){
            aux = null;
            nuevo = null;
            auxi.push(clave);
            subeArriba.setValor(true);
            return nuevo;
        }else{
            boolean esta = buscarNodo(act, clave, k);
            if (esta){
                subeArriba.setValor(false);
                nuevo = null;
                mediana =null;
                System.err.println("clave repetida");
                return null;
            }else
               nuevo= empujar(act.ramas[k.getIndex()], clave,subeArriba, mediana, nuevo);
            
            
            if(subeArriba.getValor()){
                if(act.nodoLLeno())
                    nuevo = dividirNodo(act, clave, nuevo, k,mediana,nuevo);
                else{
                    subeArriba.setValor(false);
                    meterHoja(act, mediana, aux, k);
                }
            }
            return nuevo;
        }
    }
    
    private void meterHoja(Pagina act, Perfil clave, Pagina nuevo, Localizar k){
        int i = act.getCuentas();
        while(i >= k.getIndex() +1){
            act.claves[i+1] = act.claves[i];
            act.ramas[i+1] = act.ramas[i];
            i--;
        }
        act.claves[k.getIndex()+1] = auxi.pop();
        act.ramas[i+1] = nuevo;
        act.setCuentas(1);
    }
    
    private Pagina dividirNodo(Pagina act, Perfil clave,Pagina nd,Localizar k, Perfil mediana, Pagina nuevo){
        int i;
        int posMdna;
        
        if (k.getIndex() <= 5/2){
            posMdna = 5/2;
        }else
            posMdna = 5/2 + 1;
        
        nuevo = new Pagina();
        i = posMdna+1;
        
        while(i<5){
            nuevo.claves[i-posMdna] = act.claves[i];
            nuevo.ramas[i-posMdna] = act.ramas[i];
            i++;
        }
        
        nuevo.actCuentas(4-posMdna);
        act.actCuentas(posMdna);
        auxP.push(nuevo);
        
        if(k.getIndex() <= 5/2){
            //System.out.println(k.getIndex());
            meterHoja(act,clave,nd,k);
        }else{
            k.setIndex(k.getIndex() -posMdna);
            meterHoja(nuevo,clave,nd,k);
        }
        Perfil aux2 = act.claves[act.getCuentas()];
        auxi.push(aux2);
        mediana= act.claves[act.getCuentas()];
        aux = auxP.pop();
        //mediana = act.claves[act.getCuentas()];
        //aux = auxP.pop();
        aux.ramas[0] = act.ramas[act.getCuentas()];
        act.setCuentas(-1);
        //auxi.push(mediana);
        //nuevo = aux;
        return nuevo;
    }
    
    public void eliminar(Perfil clave){
        Mover encontrado= new Mover(false) ;
        eliminarRegistro(raiz, clave, encontrado);
        
        if(encontrado.getValor()){
            System.out.println("se elimino " + clave.getCorreo());
            if(raiz.getCuentas() == 0){
                Pagina p =raiz;
                raiz = p.ramas[0];
               // p = null;
            }
        }else{
            System.err.println("No se encontro la clave");
        }
    }
    
    private void eliminarRegistro(Pagina act, Perfil clave, Mover encontrado){
        Localizar k= new Localizar();
        k.setIndex(0);
        if(act != null){
            encontrado.setValor( buscarNodo(act,clave,k));
            if(encontrado.getValor()){
                if(act.ramas[k.getIndex()-1] == null)
                    quitar(act,k.getIndex());
                else{
                    sucesor(act,k);
                    eliminarRegistro(act.ramas[k.getIndex()], act.claves[k.getIndex()], encontrado);
                }
            }else
                eliminarRegistro(act.ramas[k.getIndex()], clave,encontrado);
            
            if (act.ramas[k.getIndex()] != null){
                if(act.ramas[k.getIndex()].getCuentas()< 5/2)
                    restablecer(act,k.getIndex());
            }
        }else
            encontrado.setValor(false);
    }
    
    public void quitar(Pagina act, int k){
        int j = k+1;
        
        while(j<= act.getCuentas()){
            act.claves[j-1]= act.claves[j];
            act.ramas[j-1] = act.ramas[j];
            j++;
        }
        
        act.setCuentas(-1);
    }
    
    private void sucesor(Pagina act, Localizar k){
        Pagina q;
        System.out.println(act);
        q = act.ramas[k.getIndex()];
        System.out.println(q);
        while(q.ramas[0] != null){
            q = q.ramas[0];
        }
        
        act.claves[k.getIndex()] = q.claves[1];
    }

    private void restablecer(Pagina act, int k) {
        if(k>0){
            if(act.ramas[k-1].getCuentas() > 5/2)
                moverDrcha(act,k);
            else
                combina(act,k);
        }else{
            if(act.ramas[1].getCuentas()> 5/2)
                moverIzqda(act,1);
            else
                combina(act,1);
        }
    }

    private void moverDrcha(Pagina act, int k) {
        int i;
        Pagina nodoP = act.ramas[k];
        Pagina nodoI = act.ramas[k-1];
        int j = nodoP.getCuentas();
        
        while(j>=1){
            nodoP.claves[j+1] = nodoP.claves[j];
            nodoP.ramas[j+1] = nodoP.ramas[j];
            j--;
        }
        
        nodoP.setCuentas(1);
        nodoP.ramas[1] = nodoP.ramas[0];
        nodoP.claves[1] = act.claves[k];
        act.claves[k] = nodoI.claves[nodoI.getCuentas()];
        nodoP.ramas[0] = nodoI.ramas[nodoI.getCuentas()];
        nodoI.setCuentas(-1);
        
    }

    private void combina(Pagina act, int k) {
        int j =1;
        Pagina q = act.ramas[k];
        Pagina nodoI = act.ramas[k-1];
        
        nodoI.setCuentas(1);
        nodoI.claves[nodoI.getCuentas()] = act.claves[k];
        nodoI.ramas[nodoI.getCuentas()] = q.ramas[0];
        
        while(j <= q.getCuentas()){
            nodoI.setCuentas(1);
            nodoI.claves[nodoI.getCuentas()] = q.claves[j];
            nodoI.ramas[nodoI.getCuentas()] = q.ramas[j];
            j++;
        }
        
        j=k;
        
        while(j<= act.getCuentas() -1){
            act.claves[j] = act.claves[j+1];
            act.ramas[j] = act.ramas[j+1];
            j++;
        }
        act.setCuentas(-1);
    }

    private void moverIzqda(Pagina act, int k) {
        int j=1;
        Pagina nodoP= act.ramas[k-1];
        Pagina nodoD = act.ramas[k];
        
        nodoP.setCuentas(1);
        nodoP.claves[nodoP.getCuentas()] = act.claves[k];
        nodoP.ramas[nodoP.getCuentas()] = nodoD.ramas[0];
        
        act.claves[k] = nodoD.claves[1];
        nodoD.ramas[1] = nodoD.ramas[0];
        nodoD.setCuentas(-1);
        
        while(j <= nodoD.getCuentas()){
            nodoD.claves[j] = nodoD.claves[j+1];
            nodoD.ramas[j] = nodoD.ramas[j+1];
            j++;
        }
    }
    
    public void listarCreciente(){
        datos = new StringBuilder("");
        listarCreciente(raiz);
        System.out.println(datos.toString());
    }
    
    private void listarCreciente(Pagina act){
        if (act != null){
            int j=1;
            this.listarCreciente(act.ramas[0]);
            while(j <= act.getCuentas()){
                n ++;
                datos.append("n").append(n).append(": correo->").append(act.claves[j].getCorreo()).append("\n");
                listarCreciente(act.ramas[j]);
                j++;
            }
        }
    }

    public String graficar(){
        return raiz.graficar();
    }
    
    public void graficar1(){
        String nombre = "arbolb"+System.currentTimeMillis()+"." ;
        String tipo = "png";
        gv = new GraphViz();
        gv.addln("digraph{");
        gv.addln("node[shape=record];");
        gv.addln(raiz.graficar());
        gv.addln(gv.end_graph());
        
        File ext = new File(nombre +tipo);
        gv.writeGraphToFile(gv.getGraph(gv.getDotSource(),tipo), ext);
    }
}

class Mover {
    private boolean valor;
    
    public Mover(boolean valor){
        this.valor = valor;
    }
    
    public void setValor(boolean valor){
        this.valor = valor;
    }
    
    public boolean getValor(){
        return valor;
    }
}

class Localizar{
    private int index;
    
    public void setIndex(int index){
        this.index = index;
    }
    
    public int getIndex(){return index;}
}