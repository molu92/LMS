package org.library.model;

public class Library {

    private String libraryName;
    private int libraryId;
    private String libraryAddress;

    private static Library l1 = new Library("Central Library", 1, "Timarni");
    private Library(String libraryName, int libraryId, String libraryAddress) {
        this.libraryName=libraryName;
        this.libraryId=libraryId;
        this.libraryAddress=libraryAddress;
    }

    public static Library getInstance() {
        return l1;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    public String getLibraryAddress() {
        return libraryAddress;
    }

    public void setLibraryAddress(String libraryAddress) {
        this.libraryAddress = libraryAddress;
    }
}
