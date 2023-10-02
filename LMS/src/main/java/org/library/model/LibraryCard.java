package org.library.model;

import java.util.Date;
import java.util.List;

public class LibraryCard {
    //{cardId-int,
    //libraryName-String,
    //libraryAddress-List of String,
    //readerName-String,
    //contactNo-int,
    //dateOfregistrationOfreader-date class,
    //expiryDate-date class,
    //issuedBy-String}

    private int cardId;
    private Library library;
    private Reader reader;
    private Date registrationDate;
    private Date expiryDate;
    private String issuedByLibrarian;

    public LibraryCard(int cardId,Library library, Reader reader, Date registrationDate, Date expiryDate,
                       String issuedByLibrarian) {
        this.cardId=cardId;
        this.library=library;
        this.reader=reader;
        this.registrationDate=registrationDate;
        this.expiryDate=expiryDate;
        this.issuedByLibrarian=issuedByLibrarian;
    }
    public int getCardId() {
        return cardId;
    }
    public Library getLibrary() {
        return library;
    }
    public Reader getReader() {
        return reader;
    }
    public Date getRegistrationDate() {
        return registrationDate;
    }
    public Date getExpiryDate() {
        return expiryDate;
    }
    public String getIssuedByLibrarian() {
        return issuedByLibrarian;
    }
    public void setCardId(int cardId) {
        this.cardId=cardId;
    }
    public void setReader(Reader reader) {
        this.reader = reader;
    }
    public void setLibrary(Library library) {
        this.library = library;
    }
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate=registrationDate;
    }
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate=expiryDate;
    }
    public void setIssuedByLibrarian(String issuedByLibrarian) {
        this.issuedByLibrarian=issuedByLibrarian;
    }
}
