package opps;

public class Vehicle {

    protected String brand = "Ford";   //Vehicle Attribute

    public void horn(){
        System.out.println("Tuut, tuut!");
    }
}

class CarType extends Vehicle{
    private  String modelName = "Mustang";  // car attribute

    public static  void main (String[] args){
CarType carType = new CarType();
carType.horn();
System.out.println(carType.brand + "" + carType.modelName );

    }
}