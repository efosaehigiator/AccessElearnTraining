package JavaArray;

public class ArrayLength {

    public static void main (String[] args){
      String [] CarMake = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
      int Length = CarMake.length;
      System.out.println("Length of the array is ==>"+Length);

// this is to access the first element in the array directly with its position
    String BMW = CarMake[0];
    System.out.println("First value of the Array is ==>" +BMW);

    }
}
