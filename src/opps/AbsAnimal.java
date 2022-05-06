package opps;

abstract class AbsAnimal {

    public abstract void animalSound();
    public void sleep(){
        System.out.println("zzz");
    }

}

class  Pig extends AbsAnimal {
    public void animalSound (){
        System.out.println("The pig says: wee wee");
    }
}

class Implement {
    public static  void main (String [] args){
      Pig pig = new Pig();
      pig.animalSound();
      pig.sleep();
    }
}

