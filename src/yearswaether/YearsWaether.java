/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yearswaether;

import java.util.Random;

/**
 *
 * @author user
 */
public class YearsWaether {

    public static enum month {
        Январь, Февраль, Март, Апрель, Май, Июнь, Июль, Август,
        Сентябрь, Октябрь, Ноябрь, Декабрь
    }
    
    public static void main(String[] args) {
        int[][] yearsWaether = new int [12][];
        System.out.print("\t");
        for (int i = 0; i < 31; i++) {
            System.out.printf("%5d",i+1);
        }
        System.out.println();
        for (int i = 0; i < 200; i++) {
            System.out.print("-");
        }
        System.out.println("");
        Random random = new Random();
        int min = -20, max = 20, dayInMonth = 0;
        for (int i = 0; i < yearsWaether.length; i++) {
            switch (i) {
                case 0: min = -20; max = -5; dayInMonth = 31; break;
                case 1: min = -15; max = 0; dayInMonth = 28; break;
                case 2: min = -10; max = 5; dayInMonth = 31; break;
                case 3: min = -5; max = 10; dayInMonth = 30; break;
                case 4: min = 0; max = 15; dayInMonth = 31; break;
                case 5: min = 10; max = 20; dayInMonth = 30; break;
                case 6: min = 15; max = 25; dayInMonth = 31; break;
                case 7: min = 10; max = 20; dayInMonth = 31; break;
                case 8: min = 5; max = 15; dayInMonth = 30; break;
                case 9: min = -5; max = 10; dayInMonth = 31; break;
                case 10: min = -10; max = 5; dayInMonth = 30; break;
                case 11: min = -15; max = 0; dayInMonth = 31; break;
            }

            System.out.println("");
        }
    }
    
}