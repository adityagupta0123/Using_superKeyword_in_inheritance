package Inherritance;
class vehicle{
    int maxSpeed = 120;
}
class car extends vehicle {
    int maxSpeed = 200;

    public void display(){
        System.out.println("max "+super.maxSpeed);// vehicle speed
        System.out.println("max "+maxSpeed); // car speed
    }
}
public class main {
    public static void main(String[] args) {
        car c = new car();
        c.display();
    }
}
