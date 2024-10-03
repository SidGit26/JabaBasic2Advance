package OOPS;


class vechile{
    double price;
    double mileage;
    String color;
    void display(){
        System.out.println("Price "   +price);
        System.out.println("Mileage "   +mileage);
        System.out.println("Colour "   +color);
        System.out.println();
        
    }
}
class car extends vechile{
    String type;
    boolean sunroof;
    String brand;

}
public class RealInherit {
    public static void main(String[] args) {
        car car1 = new car();
        car1.price = 23444;
        car1.brand = "Sizuki";
        car1.type = "Pterol";
        car1.mileage = 67.1;
        car1.display();
      

    }
    
}
