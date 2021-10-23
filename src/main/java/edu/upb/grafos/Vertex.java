/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.grafos;
import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class Vertex {
    
    private String data;
    private ArrayList<Edge> edges;

    public Vertex(String InputData) {
        this.data = InputData;
        this.edges = new ArrayList<>();
    }
    
    public void addEdge(Vertex endVertex, Integer weight){
        this.edges.add(new Edge(this, endVertex, weight));
    }
    
    public void removeEdge(Vertex endVertex){
        this.edges.removeIf(edge -> edge.getEnd().equals(endVertex));
    }
    
    public ArrayList<Edge> getEdges(){
        
        return this.edges;
        
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "\n \tVertex [city=" + data + ", edges=" + edges + "]";
    }
}
