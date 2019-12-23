package com.geekbrainsPudoff.Lesson_6;

/**
 * 1.3. Создадим класс Собака
 */
public class Dog extends Animal {
    String vType = "Собака";
    
    public Dog (String vDogName) {
        this.vName = vDogName;
        this.vMaxDistRun = super.GenerateDistanceInt(400, 600);
        this.vMaxDistSwim = super.GenerateDistanceInt(1, 100);
        this.vMaxJump = super.GenerateDistanceFloat(0.5F, 4.99F);
    }
    
   @Override
   public void Run (int vDistance) {
       if (vDistance <= vMaxDistRun && vDistance > 0) {
           System.out.println(vType + " " +  vName + " пробежала " + vDistance + " " + super.measure(vDistance) + ". Максимально возможная дистанция = " + vMaxDistRun );
       } else if (vDistance <= vMaxDistRun && vDistance == 0) {
           System.out.println(vType + " " +  vName + " стоит. "+ ". Максимально возможная дистанция = " + vMaxDistRun);
       } else {
           System.out.println(vType + " " +  vName + " не может бежать без остановки на расстояние " + vDistance + " " +super.measure(vDistance) + ". Максимально возможная дистанция = " + vMaxDistRun);
       }
   }
   
   @Override
   public void Swim (int vDistance) {
       if (vDistance <= vMaxDistSwim && vDistance > 0) {
           System.out.println(vType + " " +  vName + " проплыла " + vDistance + " " + super.measure(vDistance) + ". Максимально возможная дистанция = " + vMaxDistSwim );
       } else if (vDistance <= vMaxDistSwim && vDistance == 0) {
           System.out.println(vType + " " +  vName + " стоит" + ". Максимально возможная дистанция = " + vMaxDistSwim);
       } else {
           System.out.println(vType + " " +  vName + " не может плавать на расстояние " + vDistance + " " +super.measure(vDistance) + ". Максимально возможная дистанция = " + vMaxDistSwim);
       }
   }
   
   @Override
   public void Jump (float vDistance) {
       if (vDistance <= vMaxJump && vDistance > 0) {
           System.out.println(vType + " " +  vName + " прыгнула на " + vDistance + " " + super.measure(vDistance) + ". Максимально возможная высота = " + vMaxJump);
       } else if (vDistance <= vMaxJump && vDistance == 0) {
           System.out.println(vType + " " +  vName + " стоит" + ". Максимально возможная высота = " + vMaxJump);
       } else {
            System.out.println(vType + " " +  vName + " не может прыгнуть на  " + vDistance + " " + super.measure(vDistance) + ". Максимально возможная высота = " + vMaxJump);
       }
   }
}
