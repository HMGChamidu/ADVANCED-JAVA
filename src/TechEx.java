import groovy.console.ui.AstBrowser;

public class TechEx {
    public static void main(String[] args) {

    }
}
abstract class Animal{

    abstract void move();

}

abstract class Fish extends Animal{
    void move(){
        System.out.println("Swim");
    }

}

abstract class Bird extends Animal{
         void move(){
             System.out.println("Fly");
         }
}