/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.grafos;

/**
 *
 * @author santi
 */
public class Edge {
    
    private Vertex start;
    private Vertex end;
    private Integer weight;

    public Edge(Vertex startV, Vertex endV, Integer InputWeight) {
        this.start = startV;
        this.end = endV;
        this.weight = InputWeight;
    }

    public Vertex getStart() {
        return start;
    }

    public void setStart(Vertex start) {
        this.start = start;
    }

    public Vertex getEnd() {
        return end;
    }

    public void setEnd(Vertex end) {
        this.end = end;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    
    
    
    
}
