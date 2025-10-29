package Day4;


public class Main {
    public static void main(String[] args) {
        Caravan c = new Caravan();
        fuelRefill(c);
    }

    void fuelRefill(Vehicle vehicle) {

    }
}
class PaintShop {
    static void housepainting(House house){

}
interface House{
        void sitDown();

}

interface Vehicle{
        void sitDown();

}
class Caravan implements House,Vehicle{
        public void sitDown(){
            System.out.println("Sit Down");
        }
}
}