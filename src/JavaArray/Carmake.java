package JavaArray;

public class Carmake {

    public static void main(String[] args) {
        //Declaring an Array
        String [] CarMake = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
        // Calling Print Array method and passing an Array as a parameter
        Print_Array(CarMake);

    }

    //This accept Array as an argument of type String
    public static void Print_Array(String []array){

        for(int i = 0;i<=array.length-1;i++){
            System.out.println("Printing all the values of an Array ==> " + array[i]);
        }
    }
}
