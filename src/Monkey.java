public class Monkey {
     void climb(){
        System.out.println("using legs");
    }
}
class Man extends Monkey{
   void climb(){
        System.out.println("using a ladder");
        super.climb();
    };



    public static void main(String[] args) {
        Man m=new Man();
        m.climb();


    }

    }