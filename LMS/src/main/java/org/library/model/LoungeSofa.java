package org.library.model;

public class LoungeSofa extends Chair{
    private int capacity;
    public LoungeSofa(int chairId, Color color, Material material, int capacity) {
        super(chairId, color, material);
        this.capacity=capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity=capacity;
    }
}
