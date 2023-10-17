/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv22task2kezerev.java;

import java.util.Scanner;


public class App {
    void run() {
           Scanner scanner = new Scanner(System.in);

           System.out.print("Введите трехзначное число: ");
           int number = scanner.nextInt();

           if (number < 100 || number > 999) {
               System.out.println("Введенное число не трехзначное.");
           } else {
               int num1 = number / 100;      
               int num2 = (number / 10) % 10;
               int num3 = number % 10;       

               int sum = num1 + num2 + num3;

               System.out.println("Сумма цифр введенного числа: " + sum);
           }

           scanner.close();
    }
}
