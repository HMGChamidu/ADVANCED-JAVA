import groovy.console.ui.AstBrowser;

public class TechEx {
    public static void main(String[] args) {
     BMW bmw = new BMW();
     bmw.driveFast();
     bmw.drive();
     bmw.racing();

    }
}

  class vehicle{
    void drive(){
        System.out.println("Drive");
    }

  }

 class car extends vehicle{
    void racing(){
        System.out.println("Racing");
    }
 }

class BMW extends car{
    void driveFast(){
        System.out.println("Drive Fast");
    }
}