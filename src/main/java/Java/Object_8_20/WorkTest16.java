package Java.Object_8_20;

import java.util.Scanner;

public class WorkTest16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circl circl = new Circl();
        PassObject passObject = new PassObject();

        passObject.printArea(circl,scanner.nextInt());
    }
}


class Circl{
    private double redius;

    public void setRedius(double redius){
        this.redius = redius;
    }

    public double getRedius(){
        return this.redius;
    }

    /**
     * findArea
     */
    public double findArea(){
        return Math.PI*this.redius*this.redius;
    }
}

class PassObject{
    public void printArea(Circl c,int time){
        System.out.println("Radius\t\tArea");
        for (int i = 1;i <= time;i++){
            c.setRedius(i);
            System.out.println(c.getRedius() + "\t\t"+ c.findArea());
        }

    }
}