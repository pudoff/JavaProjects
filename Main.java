package com.geekbrainsPudoff;

public class Main {
    // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {
        System.out.println("1. Это первый метод Пудова А.Н.");
        // 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte vFrstByte = 55; //1) 8 битное знаковое целое число от -128 до 127
        short vFrstShort = 2222; //2) 16 битное знаковое целое число от -32768 до 32767
        int vFrstInt = 55000; //3) 32 битное знаковое целое число
        long vFrstLong = 3000000L; //4) 64-битное знаковое целое число
        float vFrstFloat = 33.333F; //5) 32-битное знаковое число с плавающей запятойодинарной точности
        final float vFrstFF = 9.8F; // константа - ускорение свободного падения
        double vFrstDouble = 99999999999.99; //6) 64-битное знаковое число с плавающей запятой двойной точности
        char vFrstChar = '\u2242'; // 7) 16-битный тип данных, предназначенный для хранения символов в кодировке Unicode
        boolean vFrstBool = true; // 8) Логический тип данных
        // итого 9 примитивных типов данных
        String vFrstString = "2. Можно вывести символ приближенного равенства: "; // строка
        System.out.println(vFrstString + vFrstChar);
        // Вызов метода из п.3. домашнего задания
        int a = 25, b = 3, c = 10, d = 5;
        int vResM = mCalc3(a, b, c, d);
        System.out.println("3. Результат работы метода из пункта 3 ДЗ = " + vResM);
        // Вызов метода из п.4. домашнего задания
        int vOne = 5, vTwo = 10;
        System.out.println("4. Результат работы метода из пункта 4 ДЗ = " + mRetBool(vOne, vTwo));
        vTwo = vTwo +10;
        System.out.println("4. Проверим что работает else в методе из 4 пункта ДЗ = " + mRetBool(vOne, vTwo));
        // 5. Результат работы метода из пункта 5 ДЗ
        System.out.println(mPositiveCheck(vFrstByte));
        // 5. Проверим результат работы метода, если на вход передадим число < 0
        vFrstByte = -60;
        System.out.println(mPositiveCheck(vFrstByte));
        // 6. Результат работы метода из пункта 6 ДЗ
        System.out.println(mPositiveCheck2(vFrstShort));
        // 6. Проверим результат работы метода, если на вход передадим число < 0
        vFrstShort = -2222;
        System.out.println(mPositiveCheck2(vFrstShort));
        // 7. Результат работы метода из пункта 7 ДЗ
        String vIncName = "Саша";
        System.out.println(mHello(vIncName));
        // 7. Результат работы метода из пункта 8 ДЗ
        int vCheckYr = 2019;
        // Проверим високосный ли 2019
        System.out.println ( mCheckLeap(vCheckYr));
        // Проверим високосный ли 2020
        vCheckYr = 2020;
        System.out.println ( mCheckLeap(vCheckYr)  );
        // Проверим високосный ли 2100
        vCheckYr = 2100;
        System.out.println ( mCheckLeap(vCheckYr)  );
        // Проверим високосный ли 2400
        vCheckYr = 2400;
        System.out.println ( mCheckLeap(vCheckYr)  );


    }

    /* 3.  Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
            где a, b, c, d – входные параметры этого метода;
           Протестирую модификатор доступа Private для использования внутри класса Main
    */
    private static int mCalc3(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    /*4. Написать метод, принимающий на вход два числа, и проверяющий
         что их сумма лежит в пределах от 10 до 20(включительно),
        если да – вернуть true, в противном случае – false;
    */
    private static boolean mRetBool(int vFrst, int vSecond) {
        int vRes = vFrst + vSecond;
        return vRes >= 10 & vRes <= 20;
    }

    /*
    5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
    в консоль положительное ли число передали, или отрицательное;
    Замечание: ноль считаем положительным числом.
     */
    private static String mPositiveCheck(byte vIncCheck) {
        if (vIncCheck >= 0) {
           return  ("В метод mPositiveCheck передано положительное число");
        } else {
            return ("В метод mPositiveCheck передано отрицательное число");
        }
    }
    /*
    6. Написать метод, которому в качестве параметра передается целое число,
       метод должен вернуть true, если число отрицательное;
     */
    private static boolean mPositiveCheck2 (short vCheckPositive) {
        return vCheckPositive<0;
    }
    /*
    7. Написать метод, которому в качестве параметра передается строка,
    обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
     */
    private static String mHello (String vName) {
      return ("Привет, " + vName + "!");
    }

    /*
    Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    private  static String mCheckLeap (int vYear) {
        if  ((vYear%4 == 0 & vYear%100 != 0 ) ||vYear%400==0)  {
            return  ("Год " + vYear + " является високоснымю");
        } else { return  ("Год " + vYear + " не является високоснымю");
        }

    }

}