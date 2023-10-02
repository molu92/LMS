package org.library.controller;

import org.library.model.Book;
import org.library.model.RegisterEntry;

public interface ReturnBookController {
   Book returnBook(String name);
   RegisterEntry registerExitTime(int isbn, String name, long exitTime, int tableId);
}
