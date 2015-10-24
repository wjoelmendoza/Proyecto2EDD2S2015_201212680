/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estructura;

import com.estructura.generica.NodoLD;
import graphViz.GraphViz;
import java.io.File;

/**
 *
 * @author walter
 */
public class ListaPublicaciones {
    private NodoLD<Publicacion> origen,fin;
    private int size;
    private String nomGraf;
    private GraphViz gv;
    
    public ListaPublicaciones(){
        origen = fin = null;
        size =0;
    }
    
    public boolean vacia(){
        return origen==null;
    }
    
    public void insertar(Publicacion pu){
        NodoLD<Publicacion> aux = new NodoLD<>(pu);
        size ++;
        if(!vacia()){
            fin.setSiguiente(aux);
            aux.setAnterior(fin);
            fin = aux;
        }else{
            origen = fin = aux;
        }
    }
    
    public int tamaño(){
        return size;
    }
    
    /**
     * pendiente de implementar
     * @param index
     */
    public void eliminarPublicacion(int index){
        int i =0;
        size--;
        NodoLD<Publicacion> aux = origen,aux1;
        while(index != i){
            i++;
            aux = aux.getSiguiente();
        }
        
        if(aux.getSiguiente()!=null && aux.getAnterior()!=null){
        
            aux1 = aux.getSiguiente();
            aux.getAnterior().setSiguiente(aux1);
            aux1.setAnterior(aux.getAnterior());
            
        }else if(aux.getAnterior()== null && aux.getSiguiente()!=null){
            
            aux1 = aux.getSiguiente();
            aux1.setAnterior(null);
            aux.setSiguiente(null);
            origen = aux1;
            
        }else if(aux.getSiguiente() == null && aux.getAnterior()!=null){
            
            aux1 = aux.getAnterior();
            aux1.setSiguiente(null);
            aux.setAnterior(null);
            fin = aux1;
            
        } else if (aux.getAnterior()== null && aux.getSiguiente()==null)
            fin = origen = null;
    }
    
    public void graficar(String nombre){
        if(!vacia()){
            nomGraf = nombre + System.currentTimeMillis()+".png";
            int i =0;
            gv = new GraphViz();
            gv.addln(gv.start_graph());
            gv.addln("rankdir = LR");
            NodoLD<Publicacion> aux = origen;
            
            while(aux!=null){
                gv.addln("n" +i +"[label=\"" + aux.getDato().getTitulo() + "\"];");
                aux = aux.getSiguiente();
                i++;
            }
            
            for(i =0; i< size;i++){
                if(i<size-1)
                    gv.add("n"+i+"->");
                else
                    gv.add("n" + i+";\n");
            }
            
            for( i = size-1; i >=0; i--){
                if(i<0)
                    gv.addln("n" + i + "->");
                else
                    gv.add("n" + i + ";\n");
            }
            
            gv.addln(gv.end_graph());
            
            File ext = new File(nomGraf);
            gv.writeGraphToFile(gv.getGraph(gv.getDotSource(), "png"), ext);
        }
    }
    
    public Publicacion[] getPublicaciones(){
        Publicacion[] aux = new Publicacion[size];
        NodoLD<Publicacion> auxiliar = origen;
        int i=0;
        System.out.println("tamaño del vector: "+aux.length);
        while(auxiliar!=null){
            aux[i] = auxiliar.getDato();
            System.out.println(i);
            i++;
            auxiliar= auxiliar.getSiguiente();
        }
        
        return aux;
    }
    
}
