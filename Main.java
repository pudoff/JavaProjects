
package com.geekbrainsPudoff.Lesson_6;

import java.util.Scanner;

public class Main {
static Scanner Sc = new Scanner(System.in, "Cp1251");

    public static void main(String[] args) {
        int vAnimalType;
        String vInName;
        int vInAction;
        int vIntDistance;
        float vFloatDistance;
        
        System.out.println("Укажите тип животного. Для кошки введите 1, для собаки - 2: ");
        vAnimalType = Sc.nextInt(); 
        System.out.println("Введите имя животного:");
        vInName = Sc.next().toString(); 
        System.out.println("Введите действие. Для бега введите 1, для плавания - 2, для прыжка - 3:");
        vInAction  = Sc.nextInt();  
   
                
      if (vAnimalType == 1) {
            Cat vCurrentCat = new Cat (vInName);
            
            if (vInAction == 1 ) {
                System.out.println("Введите дистанцию в метрах: ");
                vIntDistance = Sc.nextInt();                
                vCurrentCat.Run(vIntDistance);
            } else if (vInAction == 2) {
                System.out.println("Введите дистанцию в метрах: ");
                vIntDistance = Sc.nextInt();                                         
                vCurrentCat.Swim(vIntDistance);
            } else if (vInAction == 3) {
                System.out.println("Введите высоту для прыжкаs в метрах: ");
                vFloatDistance = Sc.nextFloat();                                          
                vCurrentCat.Jump(vFloatDistance);
            }
        } else if (vAnimalType == 2) {
            Dog vCurrentDog = new Dog (vInName);
            
            if (vInAction == 1 ) {
                System.out.println("Введите дистанцию в метрах: ");
                vIntDistance = Sc.nextInt();                
                vCurrentDog.Run(vIntDistance);
            } else if (vInAction ==2) {
                System.out.println("Введите дистанцию в метрах: ");
                vIntDistance = Sc.nextInt();                                         
                vCurrentDog.Swim(vIntDistance);
            } else if (vInAction ==3) {
                System.out.println("Введите высоту для прыжкаs в метрах: ");
                vFloatDistance = Sc.nextFloat();                                          
                vCurrentDog.Jump(vFloatDistance);
            }
        } else {
            System.out.println("Что-то другое " + vAnimalType+"!");
        }

        
     Sc.close();
    }
    
}
