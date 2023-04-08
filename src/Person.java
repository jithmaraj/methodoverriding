public class Person {
    int speed=120;
}
class Special extends Person{
    int speed=180;
    void display(){
        System.out.println("max speed is "+speed);
        System.out.println("average speed is "+super.speed);
    }
}
class Testrun{
    public static void main(String[] args) {
        Special man=new Special();
        man.display();
    }

}