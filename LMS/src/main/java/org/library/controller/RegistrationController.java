package org.library.controller;

import org.library.model.Gender;
import org.library.model.LibraryCard;
import org.library.model.Reader;

public interface RegistrationController {

    Reader registerReader(int readerId, String name, String contactNo, int age, Gender gender);
    LibraryCard issueLibraryCard(int readerId);
    boolean isReaderRegistered(int readerId);
    boolean verifyLibraryCard(int cardId);

}
