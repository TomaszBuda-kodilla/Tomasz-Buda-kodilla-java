package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library( String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException{
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library)super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book book: books){
            Book clonedBooks = new Book(book.title,book.author,book.publicationDate);
            clonedLibrary.getBooks().add(book);
        }
        return clonedLibrary;
    }

    @Override
    public String toString(){
        String lib = "Library" + name + "\n";
        for (Book myLibrary:books){
            lib = lib + myLibrary.toString() + "\n";
        }
        return lib;
    }
}