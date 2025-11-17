package Day4;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

   Student s = new Student("Chamidu" , 22, "chamidusandeepa339@gmail.com");




    }
}

class Student{
    String name;
    int age;
    String email;

    Student(String name, int age, String email){
           this();
           this.name = name;
           this.age = age;
           this.email = email;


    }
    Student(){
        System.out.println("Student is created");
        System.out.println("dssdsdds");
    }
}