package com.geekbrainsPudoff.Lesson_3;

import java.util.Random;
import java.util.Scanner;

/*
1. Написать программу, которая загадывает случайное число от 0 до 9,
и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */

public class Main {
    public static Scanner scan1 = new Scanner(System.in);

    static int getFromScanner(String s, int vMin, int vMax) {
        int vRetOth;
        do {
            System.out.println(s);
            vRetOth = scan1.nextInt();
        } while (vRetOth < vMin || vRetOth > vMax);
        return vRetOth;
    }

    private static int mRandom() {
        Random vRand = new Random();
        return vRand.nextInt(10);
    }

    public static void main (String [] args) {

    int vAgain = 1;
       do {
           int vRand = mRandom(); // загадываем случайное число
           int vCntTries = 3; // 3 попытки

           for (int i = 1; i <= vCntTries; i++) {
               int vUserAnswer = getFromScanner("Загадано случайное число от 0 до 9. Попробуйте угадать.", 0, 9);
               if (vUserAnswer == vRand) {
                   vAgain  = getFromScanner("Вы угадали ! Повторить игру еще раз? 1 – да / 0 – нет ", 0, 1);
                   if (vAgain == 0) { break; }
               } else if (vUserAnswer > vRand & (vCntTries - i) >0) {
                   System.out.println("Вы не угадали ! Загаданное число меньше вашего.  У вас осталось " + (vCntTries - i) + " попыток");
               } else if (vUserAnswer < vRand & (vCntTries - i) >0) {
                   System.out.println("Вы не угадали ! Загаданное число больше вашего.  У вас осталось " + (vCntTries - i) + " попыток");
               } else if (vUserAnswer != vRand & (vCntTries - i) ==0 )  {
                   vAgain  = getFromScanner("Вы проиграли ! Повторить игру еще раз? 1 – да / 0 – нет ", 0, 1);
                   if (vAgain == 0) { break; }
               }
           }

       }  while (vAgain == 1);
        scan1.close();
        System.out.println("Спасибо за игру !");
    }



}
