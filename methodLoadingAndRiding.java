//method overloading is a way to achieve compile time polymorphism
//method overriding is a way to achieve run-time time polymorphism
class Innostax {
   
    void display()
    {
        System.out.println("Innostax Pvt. Limited");
    }
    }

     class Employee extends Innostax{
       

          void display()
          {
              
              System.out.println("Innostax Tech LLC");
          }
              }
public class methodLoadingAndRiding {
    public static void innostax(String st1,String st2)
    {
System.out.println(st1+st2);
    }
    public static void innostax(String st1,String st2,String st3)
    {
        System.out.println(st1+st2+st3);
    }
    public static void innostax(String st1,int a)
    {
        System.out.println(st1+a);
    }
    public static void main(String[] args) {
       innostax("Software", "Company");
       innostax("Innostax ","is a" +"Company");
       innostax("Innostax ranking in Gurgoan: ", 10);
       Employee e=new Employee();
       e.display();
       
    }
}
