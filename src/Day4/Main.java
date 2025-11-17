package Day4;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Dog");
        Animal a2 = new Animal("Cat");
        Animal a3 = new Animal("Fish");

        a1.printName();
        a2.printName();
        a3.printName();


    }
}

class Animal{
    String name;

    public Animal (String _name){
        name = _name;
    }

    void printName(){
        System.out.println(this.name);
    }
    
}