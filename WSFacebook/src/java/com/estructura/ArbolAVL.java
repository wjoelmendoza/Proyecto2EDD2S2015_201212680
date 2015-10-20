/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estructura;

import com.estructura.generica.NodoA;
import com.estructura.interfaces.Comparar;
import graphViz.GraphViz;
import java.io.File;

/**
 *
 * @author walter
 */
public class ArbolAVL {
    private NodoA raiz;
    private String datos;
    private boolean adherido;
    private GraphViz gv;
    private String nombreGra;
    
    public ArbolAVL(){
        raiz = null;
        datos ="";
        adherido = false;
    }
    
    boolean vacio(){
        return raiz == null;
    }
    
    /**
     * Método que permite realizar la rotación simple izquierda izquierda
     * @param nodo es el nodo que presenta el desequilibrio
     * @param nodo1 es el nodo hijo del primer parámetro que pasara a ser la nueva
     * raíz del subárbol
     * @return el subárbol equilibrado
     */
    private NodoA rotacionII(NodoA nodo, NodoA nodo1 ){
        nodo.setNIzq(nodo1.getNDer());
        nodo1.setNDer(nodo);
        if(nodo1.getFactor() == -1){
            nodo.setFactor(0);
            nodo1.setFactor(0);
        }else{
            nodo.setFactor(-1);
            nodo1.setFactor(1);
        }
        
        return nodo1;
    }
    
    /**
     * Método que permite realizar la rotación simple Derecha - Derecha
     * @param nodo es el nodo que presenta el desequilibrio
     * @param nodo1 es el nodo hijo del parámetro uno, y que pasara a ser la nueva
     * raíz
     * @return  el subárbol equilibrado
     */
    private NodoA rotacionDD(NodoA nodo, NodoA nodo1){
        nodo.setNDer(nodo1.getNIzq());
        nodo1.setNIzq(nodo);
        
        if (nodo1.getFactor() == 1){
            nodo.setFactor(0);
            nodo1.setFactor(0);
        }else{
            nodo.setFactor(1);
            nodo1.setFactor(-1);
        }
        
        
        return nodo1;
    }
    
    /**
     * Este método permite realizar la rotación doble Izquierda-Derecha
     * @param nodo que presenta el desequilibrio
     * @param nodo1 hijo del primer nodo de parámetro
     * @return  el subárbol equilibrado
     */
    private NodoA rotacionID(NodoA nodo, NodoA nodo1){
        NodoA nodo2 = nodo1.getNDer();
        nodo.setNIzq(nodo2.getNDer());
        nodo2.setNDer(nodo);
        nodo1.setNDer(nodo2.getNIzq());
        nodo2.setNIzq(nodo1);
        
        if(nodo2.getFactor()==1)
            nodo1.setFactor(-1);
        else
            nodo1.setFactor(0);
        
        if( nodo2.getFactor() == -1)
            nodo.setFactor(1);
        else
            nodo.setFactor(0);
        
        nodo2.setFactor(0);
        
        return nodo2;
    }
    
    private NodoA rotacionDI(NodoA nodo, NodoA nodo1){
        NodoA nodo2 = nodo1.getNIzq();
        
        nodo.setNDer(nodo2.getNIzq());
        nodo2.setNIzq(nodo);
        nodo1.setNIzq(nodo2.getNDer());
        nodo2.setNDer(nodo1);
        
        if( nodo2.getFactor() == 1)
            nodo.setFactor(-1);
        else
            nodo.setFactor(0);
        
        if(nodo2.getFactor() == -1)
            nodo1.setFactor(1);
        else
            nodo1.setFactor(0);
        
        nodo2.setFactor(0);
        
        return nodo2;
    }
    
    void insertar(Comparar clave){
        Logical l = new Logical(false);
        raiz = insertarNodo(raiz, clave, l);
    }
    
    private NodoA insertarNodo(NodoA raiz, Comparar clave, Logical l){
        NodoA nodo1;
        
        if(raiz == null){
            raiz = new NodoA(clave);
            l.setLogical(true);
            adherido = true;
        }else if(clave.menorQue(raiz.getValor())){
            NodoA iz = insertarNodo(raiz.getNIzq(),clave,l);
            raiz.setNIzq(iz);
            
            if(l.getLogical()){
                if(raiz.getFactor() == 1){
                    raiz.setFactor(0);
                    l.setLogical(false);
                }else if(raiz.getFactor()==-1){
                    nodo1 = raiz.getNIzq();
                    if (nodo1.getFactor() == -1)
                        raiz = rotacionII(raiz, nodo1);
                    else
                        raiz = rotacionID(raiz, nodo1);
                    
                    l.setLogical(false);
                }else if(raiz.getFactor() == 0)
                    raiz.setFactor(-1);
            }
        }else if(clave.mayorQue(raiz.getValor())){
            NodoA dr = insertarNodo(raiz.getNDer(), clave, l);
            raiz.setNDer(dr);
            
            if(l.getLogical()){
                
                if(raiz.getFactor()==1){
                    nodo1 = raiz.getNDer();
                    
                    if (nodo1.getFactor() == 1)
                        raiz = rotacionDD(raiz,nodo1);
                    else
                        raiz = rotacionDI(raiz,nodo1);
                    
                    l.setLogical(false);
                }else if (raiz.getFactor() == 0)
                    raiz.setFactor(1);
                else if (raiz.getFactor() == -1){
                    raiz.setFactor(0);
                    l.setLogical(false);
                }
            }
        }else{
            adherido = false;
            System.out.println("Clave repetida");
            l.setLogical(false);
        }
        
        return raiz;
    }
    
    void eliminar(Comparar clave){
        Logical flag = new Logical(false);
        raiz = borrarAVL(raiz, clave, flag);
    }
    
    private NodoA borrarAVL(NodoA raiz, Comparar clave, Logical flag){
        
        if(raiz == null)
            System.out.println("No existe la llave");
        else if (clave.menorQue(raiz.getValor())){
            NodoA iz = borrarAVL(raiz.getNIzq(), clave, flag);
            raiz.setNIzq(iz);
            if(flag.getLogical())
                raiz = equilibrar1(raiz,flag);
        }else if(clave.mayorQue(raiz.getValor())){
            NodoA dr = borrarAVL(raiz.getNDer(),clave,flag);
            raiz.setNDer(dr);
            
            if(flag.getLogical())
                raiz = equilibrar2(raiz,flag);
        }else{
            NodoA q = raiz;
            if(q.getNIzq() == null){
                raiz = q.getNDer();
                flag.setLogical(true);
            }else if(q.getNDer() == null){
                raiz = q.getNIzq();
                flag.setLogical(true);
            }else{
                NodoA iz = reemplazar(raiz, raiz.getNIzq(), flag);
                raiz.setNIzq(iz);
                if (flag.getLogical())
                    raiz = equilibrar1(raiz,flag);
            }
            q=null;
        }
        
        return raiz;
    }

    private NodoA equilibrar1(NodoA n, Logical flag) {
        NodoA n1;
        
        switch(n.getFactor()){
            case -1:
                n.setFactor(0);
                break;
            case 0:
                n.setFactor(1);
                flag.setLogical(false);
                break;
            case 1:
                n1 = n.getNDer();
                if (n1.getFactor() >=0){
                    if(n1.getFactor()==0)
                        flag.setLogical(false);
                    
                    n = rotacionDD(n,n1);
                }else
                    n = rotacionDI(n,n1);
                break;
        }
        
        return n;
    }

    private NodoA equilibrar2(NodoA n, Logical flag) {
        NodoA n1;
        
        switch(n.getFactor()){
            case -1:
                n1 = n.getNIzq();
                if(n1.getFactor() <= 0 ){
                    if(n1.getFactor() == 0)
                        flag.setLogical(false);
                     n = rotacionII(n,n1);
                }else
                    n = rotacionID(n,n1);
                break;
            case 0:
                n.setFactor(-1);
                flag.setLogical(false);
                break;
            case 1:
                n.setFactor(0);
                break;
        }
        
        return n;
    }

    private NodoA reemplazar(NodoA n, NodoA act, Logical flag) {
        NodoA d;
        
        if (act.getNDer() != null){
            d = reemplazar(n, act.getNDer(), flag);
            act.setNDer(d);
            if(flag.getLogical())
                act = equilibrar2(act,flag);
        }else{
            n.setValor(act.getValor());
            n = act;
            act = act.getNIzq();
            n = null;
            flag.setLogical(true);
        }
        
        return act;
    }
    
    Comparar buscar(Comparar clave){
        if(vacio()){
            return null;
        }else{
            NodoA aux = localizar(raiz, clave);
            if(aux!=null)
                return aux.getValor();
            else
                return null;
        }
    }
    
    private NodoA localizar(NodoA n,Comparar clave){
        if(n == null){
            return null;
        }else if(n.getValor().igualA(clave)){
            return n;
        }else if( clave.menorQue(n.getValor())){
            return localizar(n.getNIzq(), clave);
        }else if(clave.mayorQue(n.getValor())){
            return localizar(n.getNDer(), clave);
        }else{
            return null;
        }
    }
    
    NodoA getRaiz(){
        return raiz;
    }
    
    void preorden(NodoA n){
        if(n != null){
            System.out.println(n.getValor());
            preorden(n.getNIzq());
            preorden(n.getNDer());
        }
    }
    
    void inorden(NodoA n){
        if(n!=null){
            inorden(n.getNIzq());
            System.out.print(n.getValor());
            inorden(n.getNDer());
        }
    }
    
    void postorden(NodoA n){
        if(n!=null){
            postorden(n.getNIzq());
            postorden(n.getNDer());
            System.out.println(n.getValor());
        }
    }
    /**
     * 
     * @param nombre es el nombre de la imagen
     * se generara una imagen con el nombre recibido con extensión .png
     */
    public void graficarArbol(String nombre){
        nombreGra = nombre + System.currentTimeMillis() +".png";
        gv = new GraphViz();
        gv.addln("graph {");
        auxGraph(gv, raiz);
        gv.addln( gv.end_graph() );
        /*
        * revisar como cargar las imagenes a memoria ram
        */
        File ext = new File(nombreGra);
        gv.writeGraphToFile(gv.getGraph(gv.getDotSource(), "png"), ext);
    }
    
    /**
     * 
     * @return La URL donde se podrá acceder la imagen generada
     */
    public String getImage(){
        /**
         * revisar como manejar las imagenes
        */
        return nombreGra;
    }
    
    private void auxGraph(GraphViz gv, NodoA nodo){
        if(nodo!=null){
            String aux = "n" + nodo.hashCode();
            gv.add(aux);
            gv.add("[label=\"" + nodo.getValor().toString()+"\"];\n");
            
            if(nodo.getNIzq()!=null){
                gv.add(aux + " -- " +"n" + nodo.getNIzq().hashCode() +";\n");
            }
            if(nodo.getNDer()!=null){
                gv.add(aux + " -- " + "n" + nodo.getNDer().hashCode()+";\n");
            }
            
            auxGraph(gv, nodo.getNIzq());
            auxGraph(gv, nodo.getNDer());
        }
    }
}

/**
 * 
 * @author walter
 * esta clase es utilizada como auxiliar al momento de realizar las diferentes
 * operaciones del árbol AVL conteniendo valores que permitirán realizar cambios a los nodos 
 * del árbol;
 */
class Logical{
    private boolean valor;
    
    public Logical(boolean valor){
        this.valor = valor;
    }
    
    public boolean getLogical(){
        return valor;
    }
    
    public void setLogical(boolean valor){
        this.valor = valor;
    }
}