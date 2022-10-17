/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class HistoryManager {
    private final Scanner scanner = new Scanner
    public History takeOnBook(Book[] books,Reader[] readers) {
        History history = new History();
        //
        System.out.println("Spisok chitatela: ");
        ReaderManager readerManager = new ReaderManager();
        readerManager.printListReaders(readers);
        System.out.println("Viberite nomer chitatele iz spiska: ");
        int numberReader = scanner.nextInt(); scanner.nextLine();
        
        System.out.println("Spisok knig: ");
        BookManager bookManager = new BookManager();
        bookManager.printListBooks(books);
        System.out.println("Viberite nomer chitatele iz spiska: ");
        int numberBook = scanner.nextInt(); scanner.nextLine();
        
        history.setBook(book[numberBook - 1]);
        history.setReader(reader[numberReader - 1]);
        history.setTakeOnBook(new GregorianCalendar().getTime());
        return history;
        

        
    }
    
}
