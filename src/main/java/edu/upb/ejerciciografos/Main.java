/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.ejerciciografos;

import edu.upb.grafos.Graph;
import edu.upb.grafos.Vertex;

/**
 *
 * @author santi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph miGrafo = new Graph(true,false);
        
        miGrafo.addVertex("Bogotá");
        miGrafo.addVertex("Bucarmanga");
        miGrafo.addVertex("Medellín");

        Vertex bog = miGrafo.getVertexByValue("Bogotá");
        Vertex buc = miGrafo.getVertexByValue("Bucaramanga");
        Vertex med = miGrafo.getVertexByValue("Medellín");

        miGrafo.addEdge(bog,buc,397);
        miGrafo.addEdge(bog,med,416);
        miGrafo.addEdge(med,buc,392);
        
        //miGrafo.print();
        System.out.println(miGrafo);

    }
    
}
