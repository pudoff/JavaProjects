package com.geekbrainsPudoff.Lesson_6;

/**
*  1.2. Создадим класс Кот
 */
public class Cat extends Animal {
    String vType = "Кот";
    
    public Cat (String vCatName) {
        this.vName = vCatName;
        this.vMaxDistRun = super.GenerateDistanceInt(200, 300);
        this.vMaxDistSwim = 0;
        this.vMaxJump = super.GenerateDistanceFloat(1, 3);
    }
      
   @Override
   public void Run (int vDistance) {
       if (vDistance <= vMaxDistRun && vDistance > 0) {
           System.out.println(vType + " " +  vName + " пробежал " + vDistance + " " + super.measure(vDistance) + ". Максимально возможная дистанция = " + vMaxDistRun );
       } else if (vDistance <= vMaxDistRun && vDistance == 0) {
           System.out.println(vType + " " +  vName + " стоит." + " Максимально возможная дистанция = " + vMaxDistRun);
       } else {
           System.out.println(vType + " " +  vName + " не может бежать без остановки на расстояние " + vDistance + " " +super.measure(vDistance) + ". Максимально возможная дистанция = " + vMaxDistRun);
       }
   }
   
   @Override
   public void Swim (int vDistance) {
         if (vDistance <= vMaxDistSwim && vDistance > 0) {
           System.out.println(vType + " " +  vName + " проплыл " + vDistance + " " + super.measure(vDistance) + ". Максимально возможная дистанция = " + vMaxDistSwim );
       } else if (vDistance <= vMaxDistSwim && vDistance == 0 && vMaxDistSwim > 0) {
           System.out.println(vType + " " +  vName + " стоит"  + ". Максимально возможная дистанция = " + vMaxDistSwim );
       } else if (vMaxDistSwim == 0 ) {
             System.out.println(vType + " " +  vName + " не умеет плавать!");
       } else {
           System.out.println(vType + " " +  vName + " не может плавать на расстояние " + vDistance + " " +super.measure(vDistance)  + ". Максимально возможная дистанция = " + vMaxDistSwim );
       }
   }
   
   @Override
   public void Jump (float vDistance) {
       if (vDistance <= vMaxJump && vDistance > 0) {
           System.out.println(vType + " " +  vName + " прыгнул на " + vDistance + " " + super.measure(vDistance)  + ". Максимально возможная высота = " + vMaxJump );
       } else if (vDistance <= vMaxJump && vDistance == 0) {
           System.out.println(vType + " " +  vName + " стоит. " + ". Максимально возможная высота = " + vMaxJump);
       } else {
            System.out.println(vType + " " +  vName + " не может прыгнуть на " + vDistance + " " + super.measure(vDistance) + ". Максимально возможная высота = " + vMaxJump);
       }
   }
   
}
