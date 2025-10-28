import groovy.console.ui.AstBrowser;

public class TechEx {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.run();
        d.play();

        cat c = new cat();


    }
}
 class Animal {
     String color;


     void run() {
         System.out.println("Run");
     }
     void eat(){
         System.out.println("Eat");
     }
 }

 class dog extends Animal{

    void play(){
        System.out.println("Play");
    }

 }

class cat extends Animal{

    void hunt(){

    }

}
