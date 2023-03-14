package org.java.book;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book book = new Book("ciao",1,"ciao","ciao");
        System.out.println("Quanti libri devi inserire: ");
        int pages = Integer.parseInt(scan.next());

        Book[] books = new Book[pages];

        for (int i = 0; i < books.length; i++) {
            try {
                System.out.println("Titolo: ");
                String title = scan.next();
                if (Objects.equals(title, ""))throw new RuntimeException("Inseirisci un titolo");

                System.out.println("Numero di pagine: ");
                int numPage = Integer.parseInt(scan.next());
                if(numPage < 0)throw new IllegalArgumentException("Inserisci un numero di pagine maggiore di 0");

                System.out.println("Autore: ");
                String author = scan.next();
                if(Objects.equals(author, ""))throw new RuntimeException("Inserisci un autore");

                System.out.println("Editore: ");
                String editor = scan.next();
                if(Objects.equals(editor, ""))throw new RuntimeException("Inseirisci un editore");

                books[i] = new Book(title, numPage, author, editor);

                File path = new File("./books.txt");
                FileWriter writer = new FileWriter("books.txt", true);
                if(path.exists()){
                    writer.write(books[i].toString() + "\n");
                    writer.close();
                }

                Scanner reader = new Scanner(path);
                while(reader.hasNextLine()){
                    String item = reader.nextLine();
                    System.out.println(item);
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (RuntimeException e){
                System.out.println("Error" + e.getMessage());
            } catch (IOException e) {
                System.out.println("Error");
            }
        }

//        System.out.println(Arrays.toString(books));


    }
}