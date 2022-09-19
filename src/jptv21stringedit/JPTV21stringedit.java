/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21stringedit;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV21stringedit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==== StringEdit ====");
        System.out.println("Введите текст (Латиницей): ");
        String str = scanner.nextLine();
        int counter = 0;
        OUTER:
        do {
            System.out.println("Выберите номер функции: ");
            System.out.println("1.Кол-во символов в тексте: ");
            System.out.println("2.Кол-во слов в тексте: ");
            System.out.println("3.Найти указаную подстроку в тексте: ");
            System.out.println("4.Заменить указанную подстроку на другую подстроку: ");
            int numberFunction = scanner.nextInt();
            Scanner scan = new Scanner(System.in);
            Scanner one = new Scanner(System.in);
            Scanner two = new Scanner(System.in);
            switch (numberFunction) {
                case 0:
                    System.out.println("goodbye");
                    break OUTER;
                case 1:
                    System.out.println("Вы выбрали функцию 1");
                    char[] strChar = str.toCharArray();
                    System.out.println("number of chars: "+ strChar.length);
                    break;
                case 2:
                    System.out.println("Вы выбрали функцию 2");
                    String[] words = str.split("  ");
                    for (String word : words) {
                        counter ++;
                        System.out.println(word);
                        System.out.println("counter: "+counter);
                    }
                    break;
                case 3:
                    System.out.println("Вы выбрали функцию 3");
                    String numsub = scanner.nextLine();
                    int index = str.indexOf(numsub);
                    index++;
                    if(index == 0){
                        System.out.println("No such line in text");
                    }
                    else{
                        System.out.println("it lies in"+ index + "position");
                    }
                    System.out.println(index);
                    break;
                case 4:
                    String on = one.nextLine();
                    String tw = two.nextLine();
                    System.out.println("Вы выбрали функцию 4");
                    String str2 = str.replace(on, tw);
                    System.out.println("change line is: "+ str2);
                    break;
                default:
                    break;
            }
            
            counter = 0;
        } while (true);
    }
    
}
