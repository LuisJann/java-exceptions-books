package org.java.book;

public class Book {
    private String title;
    private int numPage;
    private String author;
    private String editor;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumPage() {
        return numPage;
    }

    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }
    public Book(String title, int numPage, String author, String editor) {
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
