import java.util.Scanner;

abstract class Vehicle{
    public abstract void move();
}

class Helicopter extends Vehicle{
    public void move(){
        System.out.println("Helicopter Flies in Air");
    }
}

class Train extends Vehicle{
    public void move(){
        System.out.println("Train runs on tracks");
    }
}

class Car extends Vehicle{
    public void move(){
        System.out.println("Car drives on road");
    }
}
public class ques4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of vehicle");
        String vehicleType = sc.nextLine().toLowerCase();
        Vehicle vehicle= createVehicle(vehicleType);
        if(vehicle != null){
            vehicle.move();
        }
        else{
            System.out.println("Invalid vehicle type");
        }

    }
    public static Vehicle createVehicle(String vehicleType){
        if(vehicleType.equals("helicopter")){
            return new Helicopter();
        } else if (vehicleType.equals("train")) {
            return new Train();
        }
        else if(vehicleType.equals("car")){
            return new Car();
        }
        else
            return null;
    }
}
