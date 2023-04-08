public class Mobile {
    public void display(){
        System.out.println("smart mobile");
    }
}
class Samsung extends Mobile{

    public void display(){
        System.out.println("SAMSUNG Galaxy");
        super.display();
    }
}
class Apple extends Samsung{
    public void display() {
        System.out.println("14 pro max");
        super.display();
    }
}
class Mobitest{
    public static void main(String[] args) {
        Samsung s=new Samsung();
        Apple a=new Apple();
        s.display();
        a.display();
    }
}