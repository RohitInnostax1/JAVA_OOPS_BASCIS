abstract class Innostax11{
   abstract void softwareDev();
   void display()
   {
    System.out.println("Software Company");
   }
}
class Employee22 extends Innostax11{
     void softwareDev(){
        System.out.println("Memebers of the company developing various type of software tailored to the clients need.");
     }
    void display()
    {
     System.out.println("Software Company and IT consulting");
    }
 }
public class Abstraction {
    public static void main(String[] args) {
        Innostax11 e=new Employee22();
        e.softwareDev();
    }
}
