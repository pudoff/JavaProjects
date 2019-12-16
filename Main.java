package com.geekbrainsPudoff.lesson_4;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
/*
Урок 4. Крестики-нолики в процедурном стиле
1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку;
2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
    
 */
    static int Axis_X = 5;
    static int Axis_Y = 5;
    static char field[][] = new char[Axis_X][Axis_Y] ;

    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    static Scanner Sc= new Scanner(System.in);
    static Random rand = new Random();

    public static  void main (String[] args) {

     initField ();
     printField();

     while (true) {
         plrStep();
         printField();
         if (checkWin(DOT_X)) {
             System.out.println("Победил Игрок!");
             break;
         }
         if (checkDraw()) {
             System.out.println("Ничья!!!");
             break;
         }
         
         aiStep();
         printField();
         if (checkWin(DOT_0)) {
             System.out.println("Победил компьютер!");
             break;
         }
         if (checkDraw()) {
             System.out.println("Ничья!!!");
             break;
         }
     }

      }

       static  void initField () {
        for (int i = 0; i < Axis_X; i++) {
            for (int j = 0; j < Axis_Y; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

     static  void printField () {
        for (int i = 0; i < Axis_Y; i++) {
            if (i == 0) {
                System.out.print("     " + (i + 1) + " ");
            } else {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
            for (int i = 0; i < Axis_Y; i++) {
                System.out.print((i+1) + "   |");
                for (int j = 0; j < Axis_X; j++) {
                    System.out.print(field[i][j] + "|");
                }
                System.out.println();
            }
            System.out.println("");

    }

    static void plrStep () {
        int x;
        int y;
        do {
            System.out.println("Введите координаты X и Y для установки своей фишки " + DOT_X);
            x = Sc.nextInt() - 1;
            y = Sc.nextInt() - 1;
        }
        while (!valid(y,x));
        setSymbol(y,x, DOT_X);

    }

    static void setSymbol (int y, int x, char typeDot) {
        field[y][x] = typeDot;
    }
    static void aiStep () {    
        int x;
        int y;
       do {
//           int[] vBlock = checkBlock (DOT_0, DOT_X);
       //    if (vBlock[0] == 0 && vBlock.length == 1) {
            x = rand.nextInt(Axis_X);
            y = rand.nextInt(Axis_Y);
    /*    } else {
               //x = Sc.nextInt() - 1;
            x = vBlock[0];
            y = vBlock[1]; 
          }*/
        }
        while (!valid(y,x));
        setSymbol(y,x, DOT_0);
    }

    static boolean valid(int y, int x) {
         
        if(x < 0 || y < 0 || x > Axis_X-1 || y >Axis_Y - 1)  {
            return false;
        }
        return field[y][x] == DOT_EMPTY;
    }

    static boolean checkDraw () {
        for (int i = 0; i < Axis_Y; i++) {
            for (int j = 0; j < Axis_X; j++) {
                if (field[i][j]==DOT_EMPTY)   return false;
            }
        }
        return true;
        
    }

    static boolean checkWin (char chip) {
        int sumChips = 0;
        for (int i = 0; i < Axis_X; i++) {
            for (int j = 0; j < Axis_Y; j++) {
                 if (field[i][j] == chip) sumChips++;
            }
            if (sumChips == Axis_X) return true;
            sumChips = 0;
        }

        for (int i = 0; i < Axis_Y; i++) {
            for (int j = 0; j < Axis_X; j++) {
                 if (field[j][i] == chip) sumChips++;
            }
            if (sumChips == Axis_Y) return true;
            sumChips = 0;
        }

        for (int i = 0; i < Axis_X; i++) {
            if (field[i][i] == chip) sumChips++;
        }
        if (sumChips == Axis_X) return true;
        sumChips = 0;
        
        int j = Axis_X-1;
        for (int i = 0; i < Axis_X; i++) {
            if (field[i][j] == chip) sumChips++;
            j--;
        }
        if (sumChips == Axis_X) return true;
        sumChips = 0;

        return false; 
    }
/*
   static int[] checkBlock( char chipAi, char chipPlr) {
        int [] vRes = new int[2];
        int vSumChipsAi = 0;
        int vSumChipsPlrs = 0;
        
        for (int i = 0; i <Axis_X; i++) {
             for (int j = 0; j < Axis_Y; j++) {
                  if (field[i][j] == chipAi) {
                      vSumChipsAi++;
                } else if (field[i][j] == chipPlr) {
                          vSumChipsPlrs++;
                }   
                if (vSumChipsAi==0 && vSumChipsPlrs>0) {
                    vRes[0]=i;                    
                    vRes[1]=j;                                        
                    return vRes;
                    
                }  
                vSumChipsPlrs =0;
                vSumChipsAi = 0;
        } 
           vSumChipsPlrs = 0; 
           vSumChipsAi = 0;
}
         return vRes;
} 
 */
       
}