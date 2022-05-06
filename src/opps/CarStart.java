package opps;

interface CarStart {
    void start ();
}

interface  CarStop {
    void stop();
}


class Car implements CarStart, CarStop{
    public void start (){
        System.out.println("The car engine has been started");
    }

    public void stop(){
        System.out.println("The car has been stopped");
    }


    public static void main (String [] args){
        Car car = new Car();
        car.start();
        car.stop();
    }
}
