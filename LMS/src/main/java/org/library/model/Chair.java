package org.library.model;

public class Chair {
    //{material(plastic,iron,wooden),
    //color-string,
    //chairId-int}

    private int chairId;
    private Color color;
    private Material material;

    public Chair(int chairId,Color color, Material material) {
        this.chairId=chairId;
        this.color=color;
        this.material=material;
    }
    public int getChairId() {
        return chairId;
    }
    public Color getColor() {
        return color;
    }
    public Material getMaterial() {
        return material;
    }
    public void setChairId(int chairId) {
        this.chairId=chairId;
    }
    public void setColor(Color color) {
        this.color=color;
    }
    public void setMaterial(Material material) {
        this.material=material;
    }
}
