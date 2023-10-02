package org.library.model;

public class TableLight {
    //{issued to which table no,
    //check if it is working after submitting it back-notes,
    //chargable or works through electricity only-boolean}

    private int tableId;
    private boolean chargable;

    public TableLight(int tableId, boolean chargable) {
        this.tableId=tableId;
        this.chargable=chargable;
    }
    public int getTableId() {
        return tableId;
    }
    public boolean getChargable() {
        return chargable;
    }
    public void setTableId(int tableId) {
        this.tableId=tableId;
    }
    public void setChargable(boolean chargable) {
        this.chargable=chargable;
    }
}
