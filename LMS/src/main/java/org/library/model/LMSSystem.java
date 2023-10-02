package org.library.model;

import java.util.List;

public class LMSSystem {
    //{data of books-int,
    //books arrangement-list of string,
    //data of readers-list of string,
    //alert or notification to reader's registered mobile no that membership is about to end-Alert class}

    private List<Book> dataOfBooks;
    private List<String> booksArrangement;
    private List<Reader> dataOfReaders;
    private boolean checkMembership;

    public LMSSystem(List<Book> dataOfBooks,  List<String> booksArrangement, List<Reader> dataOfReaders,
                     boolean checkMembership) {
        this.booksArrangement=booksArrangement;
        this.dataOfBooks=dataOfBooks;
        this.checkMembership=checkMembership;
        this.dataOfReaders=dataOfReaders;
    }
    public List<Book> getDataOfBooks() {
        return dataOfBooks;
    }
    public List<String> getBooksArrangement() {
        return booksArrangement;
    }
    public List<Reader> getDataOfReaders() {
        return dataOfReaders;
    }
    public boolean getCheckMembership() {
        return checkMembership;
    }
    public void setDataOfBooks(List<Book> dataOfBooks) {
        this.dataOfBooks=dataOfBooks;
    }
    public void setBooksArrangement(List<String> booksArrangement) {
        this.booksArrangement=booksArrangement;
    }
    public void setDataOfReaders(List<Reader> dataOfReaders) {
        this.dataOfReaders=dataOfReaders;
    }
    public void setCheckMembership(boolean checkMembership) {
        this.checkMembership=checkMembership;
    }
}
