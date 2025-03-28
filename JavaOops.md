#### Classes and Interfaces
 PascalCase (Upper CamelCase): Each word starts with an uppercase letter. This style is used for naming classes and interfaces.

#### Methods and Variables
 CamelCase (Lower CamelCase): The first word starts with a lowercase letter, and each subsequent word starts with an uppercase letter. This style is used for naming methods and variables.



In Java, an instance of a class (also referred to as an object) is created using the new keyword. The new keyword dynamically allocates memory for an object of that class and returns a reference to it when it is followed by the class name and brackets with optional arguments.

### Different ways to create an object in Java

#### By new keyword
The most common way to create an object in Java is by using the new keyword followed by a constructor.

For example: ClassName obj = new ClassName();. This allocates memory for the object and calls its constructor to initialize it.

####  By newInstance() method

This method is part of the java.lang.Class class and is used to create a new instance of a class dynamically at runtime. It invokes the no-argument constructor of the class.

For example: ClassName obj = (ClassName) Class.forName("ClassName").newInstance();.

#### By clone() method

The clone() method creates a copy of an existing object by performing a shallow copy. It returns a new object that is a duplicate of the original object. For example: ClassName obj2 = (ClassName) obj1.clone();

#### Java main() method
The main() method in Java holds a special place as the entry point for any standalone Java application. When a Java program is executed, the Java Virtual Machine (JVM) looks for the main() method to begin execution. This method must adhere to a strict signature to be recognized by the JVM. Understanding the main() method is crucial for any Java developer, as it serves as the bridge between the program and the underlying execution environment provided by the JVM.

The main() is the starting point for JVM to start execution of a Java program. Without the main() method, JVM will not execute the program. The syntax of the main() method is:

 public static void main(String[] rohit) {
        System.out.println("HI");
    }
we can also write like this:-

 public static void main(String rohit[]) {
        System.out.println("HI");
    }
    agrs is general name gave in java main method() but you can use any name.

#### static
 We can make a method static by using the keyword static. We should call the main() method without creating an object. Static methods are the method that invokes without creating the objects, so we do not need any object to call the main() method.

#### Heap Area
 Heap stores the actual objects. It creates when the JVM starts up. The user can control the heap if needed. It can be of fixed or dynamic size. When we use a new keyword, the JVM creates an instance for the object in a heap. While the reference of that object stores in the stack. There exists only one heap for each running JVM process. When heap becomes full, the garbage is collected.

 #### Why multiple inheritance is not supported in Java?
To reduce the complexity and simplify the language, multiple inheritance is not supported in java.

Suppose there are three classes A, B, and C. The C class inherits A and B classes. If A and B classes have the same method and we call it from child class object, there will be ambiguity to call the method of A or B class.

Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes. So whether you have same method or different, there will be compile time error.

#### Why Method Overloading is not possible by changing the return type of method only?
Method overloading in Java is based on the method signature, which includes the method name and parameter list. The return type alone is not sufficient to distinguish between overloaded methods because Java does not consider the return type when resolving method calls. If two methods have the same name and parameter list but different return types, the compiler cannot determine which method to call based solely on the return type.

#### Can we overload Java main() method?
Yes, technically, it is possible to overload the main() method in Java, but it won't be considered as the entry point for the Java Virtual Machine (JVM) to start the execution of the program. While overloading the main() method is syntactically valid, it doesn't serve the purpose of being the entry point for program execution. The JVM expects the standard signature public static void main(String[] args) for the entry point. Any other overloaded main() method will be treated as a regular method and won't be invoked by the JVM to start the program.

<!-- class OverloadingCalculation3{  
  void sum(int a,long b){System.out.println("a method invoked");}  
  void sum(long a,int b){System.out.println("b method invoked");}  
}  
public class Main{  
  public static void main(String args[]){  
  OverloadingCalculation3 obj=new OverloadingCalculation3();  
  obj.sum(20,20);//now ambiguity  
  }  
}  -->


#### Can we override the static method?
No, a static method cannot be overridden in Java. When a subclass defines a static method with the same signature as a static method in its superclass, it is simply hiding the superclass method, not overriding it. This means that the method invoked is determined at compile time based on the reference type, not at runtime based on the object's type. Therefore, static methods do not exhibit polymorphic behavior like instance methods do.

##### No, because the Java main() method is designated as static, we are unable to override it.

#### super Keyword in Java
The super keyword in Java is a reference variable that is used to refer to immediate parent class objects.

Whenever you create the instance of a subclass, an instance of the parent class is created implicitly, which is referred to by the super reference variable.

#### Uses of Java super Keyword
super can be used to refer to the immediate parent class instance variable.
super can be used to invoke the immediate parent class method.
super() can be used to invoke the immediate parent class constructor.

#### Static Binding in Java
When type of the object is determined at compiled time(by the compiler), it is known as static binding.

If there is any private, final or static method in a class, there is static binding.

#### Dynamic Binding in Java
When type of the object is determined at run-time, it is known as dynamic binding.

#### instanceof
The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).

#### Abstraction 
Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where we type the text and send the message. We do not know the internal processing about the message delivery.

Abstraction lets you focus on what the object does instead of how it does it.

#### Ways to achieve Abstraction
There are two ways to achieve abstraction in Java:

Using Abstract Class (0 to 100%)

Using Interface (100%)

#### Interface
An interface in Java is a blueprint of a class. It has static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

![Interface](image.png)

#### Multiple inheritance is not supported through class in java, but it is possible by an interface, why?
As we have explained in the inheritance chapter, multiple inheritance is not supported in the case of class because of ambiguity. However, it is supported in case of an interface because there is no ambiguity. It is because its implementation is provided by the implementation class