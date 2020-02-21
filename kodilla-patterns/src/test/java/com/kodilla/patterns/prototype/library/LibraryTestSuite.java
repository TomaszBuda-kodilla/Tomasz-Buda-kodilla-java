package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){

        Book book1 = new Book("Clean Code","Robert C. Maritn", LocalDate.of(2009,01,01));
        Book book2 = new Book("Java Basics", "Cay S. Horstmann & G. Cornell", LocalDate.of(2013,01,01));
        Book book3 = new Book ("Algoryty struktury danych i techniki programowania dla programistow Java","P. Wroblewski",LocalDate.of(2019,01,01));

        Library newLibrary = new Library("Library 1");
        newLibrary.getBooks().add(book1);
        newLibrary.getBooks().add(book2);
        newLibrary.getBooks().add(book3);

        // making a shallow clone of object Library
        Library clonedLibrary = null;
        try{
            clonedLibrary = newLibrary.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        // making a deep clone of object Library

        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = newLibrary.deepCopy();
            deepClonedLibrary.setName("Library 3");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        System.out.println(newLibrary);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(3,newLibrary.getBooks().size());
        Assert.assertEquals(3,clonedLibrary.getBooks().size());
        Assert.assertEquals(3,deepClonedLibrary.getBooks().size());

    }
}
