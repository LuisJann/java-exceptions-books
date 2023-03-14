package org.java.book;

import java.util.Objects;

public class Book {
    private String title;
    private int numPage;
    private String author;
    private String editor;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(Objects.equals(title, ""))throw new RuntimeException("Inserisci un titolo");
        this.title = title;
    }

    public int getNumPage() {
        return numPage;
    }

    public void setNumPage(int numPage) {
        if(numPage <= 0)throw new IllegalArgumentException("Inserici un valore maggiore di 0");
        this.numPage = numPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(Objects.equals(author, ""))throw new RuntimeException("Inserisci un autore");
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        if(Objects.equals(editor, ""))throw new RuntimeException("Inserisci un editore");
        this.editor = editor;
    }
    public Book(String title, int numPage, String author, String editor) throws RuntimeException {
        if(Objects.equals(title, "") || Objects.equals(author, "") || Objects.equals(editor, "")) {
            throw new RuntimeException("Stai inserendo valori vuoti");
        }
        if (numPage <= 0 ){
            throw new IllegalArgumentException("Inserisci un valore maggiore di 0");
        }
        this.title = title;
        this.numPage = numPage;
        this.author = author;
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numPage=" + numPage +
                ", author='" + author + '\'' +
                ", editor='" + editor + '\'' +
                '}';
    }
}
