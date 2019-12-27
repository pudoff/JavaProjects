package com.geekbrainsPudoff.Lesson_7;
 
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] arrCats =  {"Барсик", "Рыжик", "Ипполит", "Варфоламей"};
        int plateIncFood = 0;
        int plateVolume = 400;
        int currentAppetite;
        
        Plate plate = new Plate (plateIncFood, plateVolume);
        plate.increaseFood(300);
        
        for (int i = 0; i<arrCats.length; i++) {
           
            currentAppetite = rand.nextInt(plateVolume);  
            // для проверки алгоритма - если вдруг  коты все не съедят, последний - будет прожорливый
            if (i == arrCats.length-1) {
                currentAppetite = plateVolume+1; 
            }
            System.out.println("Кот " + arrCats[i] + " собирается поесть. Он планирует съесть " + currentAppetite + " грамм еды.");        
        Cat cat = new Cat (arrCats[i] , currentAppetite );
        
        plate.info();        
        cat.eat(plate);
        
        if (cat.getSatiety()) {
            System.out.println("Кот " + arrCats[i] + " съел " + currentAppetite +  " грамм и теперь сыт");
        } else {
            System.out.println("Для кота " + arrCats[i] + " осталось слишком мало еды в тарелке, он не притронулся к ней и остался голодным.");
        }
        plate.info();
            System.out.println("________________________________________");
        }
    }
}
