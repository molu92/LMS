package org.library.model;

public class Register {
    //{reader name,
    //entry and exit time,
    //issued book name,isbn
    //assigned table no.,
    //contact no of reader,readerId
    //signature of reader}

    private int id;
    private int pages;
    private String name;
    public Register(int id, int pages, String name) {
        this.id= id;
        this.name=name;
        this.pages=pages;
    }
    public int getId() {
        return id;
    }
    public int getPages() {
        return pages;
    }
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id=id;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setPages(int pages) {
        this.pages=pages;
    }
}
