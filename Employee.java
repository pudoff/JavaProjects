package com.geekbrainsPudoff.Lesson_5;
/**
* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 */
public class Employee {
    String  FIO;
    String  Position;
    String  Email;
    String  Phone;
    int Salary;
    int Age;
   
    //    Конструктор класса должен заполнять эти поля при создании объекта; 
                public Employee(String vName,String vPos,String vMail,String vPhone, int vSal, int vAge ) {
            FIO = vName;
            Position = vPos;
            Email = vMail;
            Phone = vPhone;
            Salary = vSal;
            Age = vAge;
    }
     
     public String getName() {
        return FIO;
    }
    public String getPosition() {
        return Position;
    }
    public String getEmail() {
        return Email;
    }
     public String getPhone() {
        return Phone;
    }
       public int getSalary() {
        return Salary;
    }
         public int getAge() {
        return Age;
    }
     
   // Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;     
     public static void mPrint( String vName,String vPos,String vMail,String vPhone, int vSal, int vAge ) {
         System.out.println("ФИО: " + vName);
         System.out.println("Должность: " + vPos);
         System.out.println("Адрес электронной почты:" + vMail);
         System.out.println("Телефон: " + vPhone);
         System.out.println("Зарплата: " + vSal);
         System.out.println("Возраст: " + vAge);
     }  
     // * Создать массив из 5 сотрудников
     public static void main (String[] args) {
         Employee[] arrEmployee = new Employee[5]; 
         arrEmployee[0] = new Employee ("Иванова Ольга Ивановна","Менеджер по продажам", "ivanovai@server.ru", "+7-999-999-99",45000, 30);
         arrEmployee[1] = new Employee ("Фролова Екатерина Анатольевна","Офис менежер", "frolova@server.ru", "+7-888-888-88",25000, 20);
         arrEmployee[2] = new Employee ("Кривов Петр Иванович","Бухгалтер", "krivov@server.ru", "+7-777-777-77",55000, 55);
         arrEmployee[3] = new Employee ("Фарахов Марат Игоревич","Директор", "farahov@server.ru", "+7-999-999-99",85000, 42);
         arrEmployee[4] = new Employee ("Сидоров Борис Евгеньевич","Менеджер по продажам", "sidorov@server.ru", "+7-999-999-99",45000, 45);
     
          ///* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
     for (int i = 0; i < arrEmployee.length; i++ ) {
       // System.out.println(i + ". ФИО: " + arrEmployee[i].getName());
         System.out.println("Сотрудник "+ i + "_______________________________");
         mPrint(arrEmployee[i].getName(), arrEmployee[i].getPosition(),arrEmployee[i].getEmail(), arrEmployee[i].getPhone(), arrEmployee[i].getSalary(),arrEmployee[i].getAge() );
              
     }  
    
}
}
