package Day4;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.printName();
    }
}

class Animal{
    String name = "Dog";

  void printName(){
      System.out.println(this.name);
  }
    
}