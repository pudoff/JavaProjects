package com.geekbrainsPudoff.Lesson_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
// Сгенерируем случайную длину массива
        int vArrLength = rand(10, 20);
       /*
 1.1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 */
        int[] arrFirst = new int[vArrLength];

        for (int i = 0; i < vArrLength; i++) {
            int vArrNextNum = rand(0, 1);
            arrFirst[i] = vArrNextNum;
        }
        System.out.println("1.1. Исходный массив = " + Arrays.toString(arrFirst));
/*
1.2. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */
        for (int i = 0; i < vArrLength; i++) {
            if (arrFirst[i] == 1) {
                arrFirst[i] = 0;
            } else {
                arrFirst[i] = 1;
            }
        }
        System.out.println("1.2. Преобразованный = " + Arrays.toString(arrFirst));


//2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    int[] arrSecond = new int[8];
    int vNext = 0;

    for( int i = 0 ; i< 8;i++)  {
         arrSecond[i] = vNext;
        vNext = (vNext + 3) ;
       }

     System.out.println("2 Результирующий массив = " + Arrays.toString(arrSecond));

// 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    int [] arrThird = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

    for (int i = 0; i < arrThird.length; i++) {
         if (arrThird[i] < 6) {
             arrThird[i] = arrThird[i]*2;
         }
    }

    System.out.println("3 Результирующий массив = " + Arrays.toString(arrThird));

/*
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
 */
    System.out.println("4 Результирующий массив:");
    vArrLength = rand(4, 20);
    int [][] arrFourth = new int[vArrLength][vArrLength];
    for (int i = 0; i<vArrLength; i++) {
        for (int j = 0; j < vArrLength; j++) {
             arrFourth[i][j] = 1;
            System.out.print(arrFourth[i][j]  + " ");
        }
        System.out.println();
    }
        System.out.println("____________________________________________________");
        System.out.println();

//5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

         vArrLength = rand(10, 20);
         int[] arrFifth = new int[vArrLength];

        for (int i = 0; i < vArrLength; i++) {
            int vArrNextNum = rand(1, 100);
            arrFifth[i] = vArrNextNum;
        }
        System.out.println("5.1. Исходный массив = " + Arrays.toString(arrFifth));

        int vMax = arrFifth[0];
        for (int i = 1; i < arrFifth.length-1; i++) {
            if (arrFifth[i]>=vMax) {
                vMax = arrFifth[i];
            }
        }

        int vMin = arrFifth[0];
        for (int i = 1; i < arrFifth.length-1; i++) {
            if (arrFifth[i]<vMin) {
                vMin = arrFifth[i];
            }
        }

        System.out.println("5.2. Максимальный элемент массива = " + vMax + "\n     Минимальный элемент массива = " + vMin);

        // 6. Вызовем метод из задания 6
        int [] arrSixth =  {2,2,2,1,2,2,10,1};
        boolean vCheckBalance = mCheckBalance (arrSixth);
        System.out.println("6.1. В переданном массиве есть место, в котором сумма левой и правой части массива равны ? - " + vCheckBalance + " ; Массив = " + Arrays.toString(arrSixth));

        int [] arrSeventh = {1,3,5,6,7,9,6};
        vCheckBalance = mCheckBalance (arrSeventh);
        System.out.println("6.2. В переданном массиве есть место, в котором сумма левой и правой части массива равны ? - " + vCheckBalance + " ; Массив = " + Arrays.toString(arrSeventh));

        vCheckBalance = mCheckBalance (arrFifth);
        System.out.println("6.3. В переданном массиве есть место, в котором сумма левой и правой части массива равны ? - " + vCheckBalance + " ; Массив = " + Arrays.toString(arrFifth));

     /*
     НЕ УСПЕЛ
     int vOffset = 2; // длина сдвига
        System.out.println("7.1. исходный массив без сдвигов = " + Arrays.toString(arrFifth));
        System.out.println("7.2. результирующий массив со сдвигами = " + mOffset(arrFifth, vOffset))

        ;*/



    }    // Конец метода main

/*  Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
              checkBalance([1, 1, 1, || 2, 1]) → true,
              граница показана символами ||, эти символы в массив не входят.
 */
    public static boolean  mCheckBalance (int [] incArray) {
        int vSumI = 0;
        int vSumJ = 0;
        for (int i = 0; i<incArray.length-1; i++) {
            vSumI = vSumI + incArray[i];
            for (int j = i+1; j< incArray.length; ++j ) {
                vSumJ = vSumJ + incArray[j];
            }
                if (vSumI == vSumJ) {
                    return true;
                }
                vSumJ = 0;
        }
        return false;
    }

    /*
    7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    при этом метод должен сместить все элементымассива на n позиций.
    Для усложнения задачи нельзя пользоваться вспомогательными массивами.*/

    public static String mOffset (int [] intArray, int n) {
         /// НЕ УСПЕЛ :(
          /*  for (int i = 0; i<intArray.length; i++) {
                    int j = 0;
                        if ( i < n ) {
                            j = intArray.length - n + i;
                        } else {
                            j = i - n;
                        }
                    System.out.println(i + " элемент " + intArray[i] + " меняем на " + intArray[j]);
                    intArray[i] = intArray[j];

            }*/
            return Arrays.toString(intArray);
    }

// Генерация случайного числа в диапазоне от min до max
        public static int rand ( int min, int max)
        {
            max -= min;
            return (int) (Math.random() * ++max) + min;
        }

}
