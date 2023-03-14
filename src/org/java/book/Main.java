package org.java.book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book book = new Book("",0,"","");



        System.out.println("Titolo: ");
        book.setTitle(scan.next());

        try {
            System.out.println("Numero di pagine: ");
            book.setNumPage(Integer.parseInt(scan.next()));
        } catch (NumberFormatException e) {

            throw new RuntimeException(e);
        }
        System.out.println("Autore: ");
        book.setAuthor(scan.next());
        System.out.println("Editore: ");
        book.setEditor(scan.next());

        System.out.println(book);


    }
}