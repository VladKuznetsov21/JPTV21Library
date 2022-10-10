/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21library;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Spisik zadoch: ");
            System.out.println("0. Zakrit prilozenie");
            System.out.println("1. Dobavit knigu");
            System.out.println("2. Vidat knugu");
            System.out.println("3. Dobavit chitatela");
            System.out.println("4. Vernut knigu");
            System.out.println("5. Spisok knigi");
            System.out.println("======================");
            System.out.println("Viberite nomer zadachi: ");
            int task = scanner.nextInt();
            scanner.nextLine();
            System.out.println("======================");
            switch (task) {
                case 0:
                    repeat = false;
                    break;
                default:
                    System.out.println("Viberite zadachu is spiska");
                                
            }
            
        }while(repeat);
    }
}
