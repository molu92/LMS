package org.library.model;

import java.util.List;

public class Ebook extends Book{

    public Ebook(int isbn, String name, String authorName, List<String> aboutAuthor, List<String> index, int numberOfPages) {
        super(isbn, name, authorName, aboutAuthor, index, numberOfPages);
    }

    @Override
    public double calculateWeight() {
        return 0;
    }
}
