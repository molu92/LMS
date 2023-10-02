package org.library.model;

public class RegisterEntry {
    //{readerId-int,
    // entryTime-int,
    // exitTime-int,
    // isbn-int,
    // tableId-int}
    private int readerId;
    private long entryTime;
    private long exitTime;
    private int isbn;
    private int tableId;

    public RegisterEntry(int readerId, int tableId, int isbn,long entryTime, long exitTime) {
        this.readerId=readerId;
        this.tableId=tableId;
        this.isbn=isbn;
        this.entryTime=entryTime;
        this.exitTime=exitTime;
    }
    public int getReaderId() {
        return readerId;
    }
    public int getTableId() {
        return tableId;
    }
    public int getIsbn() {
        return isbn;
    }
    public long getEntryTime() {
        return entryTime;
    }
    public long getExitTime() {
        return exitTime;
    }
    public void setTableId(int tableId) {
        this.tableId=tableId;
    }
    public void setReaderId(int readerId) {
        this.readerId=readerId;
    }
    public void setIsbn(int isbn) {
        this.isbn=isbn;
    }
    public void setEntryTime(long entryTime) {
        this.entryTime=entryTime;
    }
    public void setExitTime(long exitTime) {
        this.exitTime=exitTime;
    }
}
