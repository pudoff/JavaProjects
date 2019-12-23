package com.geekbrainsPudoff.Lesson_6;

import java.util.Random;

/**
* 1. Создать классы Собака и Кот с наследованием от класса Животное.
* 1.1. Создадим класс Животное
 */
public class Animal {
    String vName;
    int vMaxDistRun;
    int vMaxDistSwim ;
    float vMaxJump;    
    int vMinIntervalRun;
    int vMaxIntervalRun;
     
    
    public Animal() {
        
    }
    
    public Animal (String vAnimalName) {
        this.vName = vAnimalName;
    };
        
   public void Run (int vDistance) {
       System.out.println("Животное пробежало " + vDistance + "метров.");
   } 
   
   public void Swim (int vDistance) {
       System.out.println("Животное проплыло " + vDistance + " метров.");
   }
   
   public void Jump (float vHeight) {
       System.out.println("Животное прыгнуло на " + vHeight + " метров.");
   }
   
       public String measure (int vDistance) {
        String vRet;
        if (vDistance == 1) {
            vRet = "метр";
        } else if (vDistance > 1 && vDistance < 5) {
             vRet = "метра";
        } else {
            vRet = "метров";
        }
        return vRet;
    }
       
       public String measure (float vDistance) {
        String vRet;
        if (vDistance == 1) {
            vRet = "метр";
        } else if (vDistance > 1 && vDistance < 5) {
             vRet = "метра";
        } else {
            vRet = "метров";
        }
        return vRet;
    }       
       
    public int GenerateDistanceInt (int vMinDist, int vMaxDist) {
        Random rand = new Random();
        int diff = vMaxDist - vMinDist;
        int vRes = rand.nextInt(diff + 1);
        vRes += vMinDist;
        return vRes;
    }  
    
        public float GenerateDistanceFloat (float vMinDist, float vMaxDist) {
        Random rand = new Random();
        float diff = vMaxDist - vMinDist;
        float vRes = vMinDist +  rand.nextFloat() * diff;
        return vRes;
    }  
    
}

