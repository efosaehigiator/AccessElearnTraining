package opps;

public class Polymorphism {

    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

class Ppig extends Polymorphism{

    public void animalSound(){
        System.out.println("The Ppig says: wee wee");
}
}

class Ddog extends Polymorphism{
    public void animalSound(){
       System.out.println("The dog says: Bow wow");
    }
}

class Main{
    public  static  void main(String[] args){
        Polymorphism poly = new Polymorphism();
        Polymorphism ddog = new Ddog();
        Polymorphism ppig = new Ppig();

        poly.animalSound();
        ddog.animalSound();
        ppig.animalSound();

    }
}



