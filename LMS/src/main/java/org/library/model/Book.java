package org.library.model;

import java.util.List;

public abstract class Book {
    //{name-String,
    //authorName-String,aboutAuthor-List of String,index-list of strings,numberOfpages-int,
    //bookID-isbn id}

    private int isbn;
    private String name;
    private String authorName;
    private List<String> aboutAuthor;
    private List<String> index;
    private int numberOfPages;

    public Book(int isbn, String name, String authorName, List<String> aboutAuthor,
                List<String> index, int numberOfPages) {
        this.isbn=isbn;
        this.name=name;
        this.authorName=authorName;
        this.aboutAuthor=aboutAuthor;
        this.index=index;
        this.numberOfPages=numberOfPages;
    }

    public int getIsbn() {
        return isbn;
    }
    public String getName() {
        return name;
    }
    public String getAuthorName() {
        return authorName;
    }
    public List<String> getAboutAuthor() {
        return aboutAuthor;
    }
    public List<String> getIndex() {
        return index;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setIsbn(int isbn) {
        this.isbn=isbn;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setAuthorName(String authorName) {
        this.authorName=authorName;
    }
    public void setAboutAuthor(List<String> aboutAuthor) {
        this.aboutAuthor=aboutAuthor;
    }
    public void setIndex(List<String> index) {
        this.index=index;
    }
    public void setNumberOfPages(int numberOfPages) {
    this.numberOfPages=numberOfPages;
    }

    public abstract double calculateWeight();
}
