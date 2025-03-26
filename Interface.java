
interface Printable{    
    void print();    
  }    
  interface Showable{    
    void show();    
  }    
 
  class Computer implements Printable,Showable{    
    public void print(){System.out.println("printing data...");}    
    public void show(){System.out.println("showing data...");}    
  }  
 
  public class Interface{  
    public static void main(String args[]){    
      Computer c = new Computer();    
      c.print();    
      c.show();    
   }    
  }