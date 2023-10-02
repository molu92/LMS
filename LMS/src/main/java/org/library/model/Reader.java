package org.library.model;

public class Reader {
    //{name-String,
    //age-int,
    //readerId-int,
    //gender-string,
    //contactNo-int}

    private int readerId;
    private String name;
    private String contactNo;
    private int age;
    private Gender gender;

    public Reader(int readerId, String name, String contactNo, int age, Gender gender) {
        this.readerId=readerId;
        this.name=name;
        this.contactNo=contactNo;
        this.age=age;
        this.gender=gender;
    }

    public int getReaderId() {
        return readerId;
    }
    public String getName() {
        return name;
    }
    public String getContactNo() {
        return contactNo;
    }
    public int getAge() {
        return age;
    }
    public Gender getGender() {
        return gender;
    }

    public void setReaderId(int readerId) {
     this.readerId=readerId;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setContactNo(String contactNo) {
        this.contactNo=contactNo;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public void setGender(Gender gender) {
        this.gender=gender;
    }
}
