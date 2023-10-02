package org.library;

import org.library.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book rashmiRathi= new PaperBack(123, "Rashmirathi", "Ramdhari Singh",
                new ArrayList<>(), new ArrayList<>(), 100);
        System.out.println(rashmiRathi.getAuthorName());
        rashmiRathi.setAuthorName("Ramdhari Singh Dinkar");
        System.out.println(rashmiRathi.getAuthorName());

        Book harryPotter= new HardCover(121, "Harry Potter", "J K Rolling",
                 new ArrayList<>(), new ArrayList<>(), 200);
        harryPotter.setNumberOfPages(300);
        System.out.println(harryPotter.getNumberOfPages());

        Table iron= new Table(111, 3, Color.BLUE, Material.PLASTIC,
                false, true);
        iron.setCapacity(4);
        System.out.println(iron.getCapacity());
        Table wooden= new Table(222,3,Color.BLACK, Material.PLASTIC,
                true, true);
        wooden.setColor(Color.GRAY);
        System.out.println(wooden.getColor());

        Chair plastic= new Chair(333,Color.GREEN, Material.PLASTIC);
        plastic.setMaterial(Material.IRON);
        System.out.println(plastic.getMaterial());
        Chair wooden1= new Chair(444,Color.BLUE, Material.WOODEN);

        Reader sumit= new Reader(1,"Sumit", "7795020455", 30, Gender.MALE);
        sumit.setName("Amit");
        System.out.println(sumit.getName());
        Reader reader1= new Reader(2,"Ankit", "7795320455", 30, Gender.MALE);

        Register registerProperty= new Register(21,150, "Vijayant");
        registerProperty.setId(22);
        System.out.println(registerProperty.getId());
        Register registerProperty1= new Register(22,160, "Classmate");

        TableLight light= new TableLight(222, true);
        light.setChargable(false);
        System.out.println(light.getChargable());
        TableLight light1= new TableLight(111, false);

        Almirah almirah= new Almirah(666,120,Color.SILVER);
        System.out.println(almirah.getId());
        almirah.setId(700);
        System.out.println(almirah.getId());
        Almirah almirah1= new Almirah(667,150,Color.RED);
        System.out.println(almirah1.getCapacity());
        almirah1.setCapacity(200);
        System.out.println(almirah1.getCapacity());

        LMSSystem lmsSystem= new LMSSystem(new ArrayList<>(),new ArrayList<>(), new ArrayList<>(), true);
        lmsSystem.setCheckMembership(false);
        System.out.println(lmsSystem.getCheckMembership());
        LMSSystem lmsSystem1= new LMSSystem(new ArrayList<>(),new ArrayList<>(), new ArrayList<>(), false);

        Library lib = Library.getInstance();
        Library lib2 = Library.getInstance();

        LibraryCard libraryCard= new LibraryCard(001, lib,
                sumit, new Date(), new Date(),
                "Ramesh" );
        System.out.println(libraryCard.getLibrary().getLibraryName());

        RegisterEntry regEntry= new RegisterEntry(451, 125, 0101, System.currentTimeMillis(), System.currentTimeMillis());
        System.out.println(regEntry.getEntryTime()/1000/3600/24);
        regEntry.setTableId(131);
        System.out.println(regEntry.getTableId());



    }

}