class Innostax {
    int i=1;
    void softwareCompany()
    {
        System.out.println("Innostax Known for creating software\n");
    }
    void display()
    {
        System.out.println("Innostax Ranking "+i);
    }
    }

     class Employee extends Innostax{
        int i=2;
        void member(){
            System.out.println("reating Software tailoret to client needs\n");
          }

          void display()
          {
              super.display();
              System.out.println("Innostax Ranking"+i);
          }
              }

        class Intern extends Employee{
            void Learning()
            {
                System.out.println("Learning....\n");
            }
        }

     class StaffMembers extends Innostax{
            void staff()
            {
                System.out.println("Memeber of the comapny.\n");
            }
        }

public class inheritanceJava {
    
    
    public static void main(String[] rohit) {
        // Employee s=new Employee();
        StaffMembers stf=new StaffMembers();
        //  Method Overriding (so runtime polymorphism can be achieved).
       Innostax e=new Employee(); 
       Employee e1=new Employee(); 
       e.softwareCompany();
       e1.display();

        // s.softwareCompany();
        stf.softwareCompany();
        stf.staff();
    }
}
