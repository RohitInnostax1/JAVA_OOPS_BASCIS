class Innostax {

    void display() {
        System.out.println("Innostax Pvt. Limited ");
    }
}

class Employee extends Innostax {

    void display() {

        System.out.println("Innostax Tech LLC");
    }
}

public class Polymoriphsm {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Polymoriphsm pl = new Polymoriphsm();
        // time polymorphism
        System.out.println("Sum of vlaues: " + pl.add(1, 4));
        System.out.println("Sum of vlaues: " + pl.add(1.5, 1.5));

        // run time polymorphism or Dynamic Method Dispatch
        Innostax e = new Employee();
        e.display();

    }
}
