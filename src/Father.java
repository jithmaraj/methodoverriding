public class Father {



    String name="John";
      int age = 48;
      void display(){
          System.out.println("father's name is " +name);
      }


    }

class Son extends Father {

    void sonDetails() {
        int age = 20;
        System.out.println("son's age is " + age);
        System.out.println("father's age is " + super.age);
    }
}


class Test{


    public static void main(String[] args) {
        Son x = new Son();
        x.sonDetails();
        x.display();
    }

}