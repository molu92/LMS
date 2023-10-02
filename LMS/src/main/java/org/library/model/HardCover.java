package org.library.model;

import java.util.List;

public class HardCover extends Book{
    public HardCover(int isbn, String name, String authorName, List<String> aboutAuthor, List<String> index, int numberOfPages) {
        super(isbn, name, authorName, aboutAuthor, index, numberOfPages);
    }

    @Override
    public double calculateWeight() {
        return 20*getNumberOfPages();
    }
}
