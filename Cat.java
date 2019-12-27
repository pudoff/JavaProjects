package com.geekbrainsPudoff.Lesson_7;

public class Cat {
    
    private String name;
    private int appetite ;
    private boolean satiety;
    
    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;        
        this.satiety = false;
    }
    
    public int getAppetite() {
        return appetite;
    }
    
    public boolean getSatiety() {
        return satiety;
    }
    
    public void eat (Plate incPlate) {
        if ( incPlate.decreaseFood(appetite) ) {
            satiety = true;           
        } else {
            satiety = false;            
        }
    }
    
    
}
