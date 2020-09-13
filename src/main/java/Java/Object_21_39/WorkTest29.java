package Java.Object_21_39;

public class WorkTest29 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Truck truck = new Truck();
        CheckPoint checkPoint = new CheckPoint();

        checkPoint.check(bus);
        checkPoint.check(truck);
    }
}

class Vehicle{
    public void start(){
        System.out.println("启动");
    }

    public void stop(){
        System.out.println("停车");
    }

    public void run(){
        System.out.println("跑");
    }
}

class Bus extends Vehicle{
    public void count(int i){
        if (i > 28){
            System.out.println("超载!");
        }else
            System.out.println("未超载");
    }
}

class Truck extends Vehicle{
    public void checkWeight(int i){
        if (i > 28){
            System.out.println("超重!");
        }else
            System.out.println("未超重");
    }
}

class CheckPoint{
    private Vehicle vehicle;

    public CheckPoint() {
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void check(Vehicle vehicle){
        if (vehicle instanceof Bus){
            Bus bus = (Bus) vehicle;
            bus.count(1);
        }else if (vehicle instanceof Truck){
            Truck truck = (Truck) vehicle;
            truck.checkWeight(29);
        }
    }
}