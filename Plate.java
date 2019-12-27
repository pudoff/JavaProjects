package com.geekbrainsPudoff.Lesson_7;

public class Plate {
    private int food;
    private int maxFood;
    
    public Plate (int food, int maxFood) {
        this.food = food;
        this.maxFood = maxFood;
    }
    
    public int getFood() {
        return food;
    }
    
    public void setFood (int incFood) {
         this.food = incFood;
    }
    
    public boolean decreaseFood (int incFood) {
        if ((food - incFood) >0) {
        food -= incFood;    
        return true;
        }  else {           
            return false;
        } 
    }
    
    public int increaseFood (int incFood){
      if ((maxFood-incFood) >= 0) {
        food += incFood; 
        return food;
      } else {
          System.out.println("Вы не можете положить в тарелку больше " + maxFood + " грамм еды.");
          System.out.println("Тарелка полна.");
          return maxFood;
      }
    }
    
    public void info () {
        System.out.println("В тарелке " + food + " грамм еды");
    }
}