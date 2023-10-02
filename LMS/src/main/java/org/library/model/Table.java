package org.library.model;

public class Table {
    //{material(plastic,iron,wooden),
    //color-string,
    //capacity-int,
    //tableId-int,
    //hasDror-Boolean,
    //hasBoxes-Boolean}

    private int tableId;
    private int capacity;
    private Color color;
    private boolean hasBoxes;
    private boolean hasDoor;
    private Material material;

    public Table(int tableId, int capacity, Color color, Material material, boolean hasBoxes,
                 boolean hasDoor) {
        this.tableId=tableId;
        this.capacity=capacity;
        this.color=color;
        this.hasBoxes=hasBoxes;
        this.hasDoor=hasDoor;
        this.material=material;
    }

    public int getTableId() {
        return tableId;
    }
    public int getCapacity() {
        return capacity;
    }
    public Color getColor() {
        return color;
    }
    public Material getMaterial() {
        return material;
    }
    public boolean getHasDoor() {
        return hasDoor;
    }
    public boolean getHasBoxes() {
        return hasBoxes;
    }

    public void setTableId(int tableId) {
        this.tableId=tableId;
    }
    public void setCapacity(int capacity) {
        this.capacity=capacity;
    }
    public void setColor(Color color) {
        this.color=color;
    }
    public void setMaterial(Material material) {
        this.material=material;
    }
    public void setHasBoxes(boolean hasBoxes) {
        this.hasBoxes=hasBoxes;
    }
    public void setHasDoor(boolean hasDoor) {
        this.hasDoor=hasDoor;
    }
}
