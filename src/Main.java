import java.util.function.IntConsumer;

 class Parent {
    static void m1() {
        System.out.println("From parent static m1()");
    }
    void m2(){
        System.out.println("From parent non-static m2()");
    }
}
 class Child extends Parent{
    static void m1() {
        System.out.println("From child static m1()");
    }
    void m2(){
        System.out.println("From child non-static(instance) m2()");
    }
}


public class Main {
    public static void main(String[] args) {
        Parent obj1 = new Child();
        obj1.m1();  // From child static m1()
        obj1.m2();  // From child non-static(instance) m2()
        
        String str1 = "Hello";  // string pool 
        String str2 = "Hello";   // already in pool
        String str3 = "Hi";    // will create in pool 


        String str4 = new String("Hi");
        String str5 = new String("Hello");
        


String first = "thing";

String second = new String("thing");

if(first.equals(second))
{
 System.out.print("Same things");
}
else
{
 System.out.print("Different things"); //This is printed
}
        
        System.out.println(" s1:"+str1.hashCode() + " s2:"+str2.hashCode() + " s3:"+str3.hashCode() +" s4:"+str4.hashCode() + " s5:"+str5.hashCode()   );
        
    }
}  