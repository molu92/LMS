package org.library.controller;

import org.library.model.Book;
import org.library.model.RegisterEntry;

public interface SearchController {

    Book searchBook(String name);
    boolean bookAssigned(String name);
    RegisterEntry regiterEntryTime(int readerId, int tableId, int isbn,long entryTime);

}
