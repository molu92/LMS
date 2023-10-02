package org.library.model;

public class Almirah {
    //{material(plastic,iron,wooden),
    //color-string,
    //lock-boolean,
    //handle-boolean,
    //capacity-int}

    private int id;
    private int capacity;
    private Color color;

    public Almirah(int id, int capacity, Color color) {
        this.id =id;
        this.capacity=capacity;
        this.color=color;
    }

    public int getId() {
        return id;
    }
    public int getCapacity() {
        return capacity;
    }
    public Color getColor() {
        return color;
    }

    public void setId(int id) {
        this.id=id;
    }
    public void setCapacity(int capacity) {
        this.capacity=capacity;
    }
    public void setColor(Color color) {
        this.color=color;
    }

}
