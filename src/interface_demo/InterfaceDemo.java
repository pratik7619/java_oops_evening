package interface_demo;

//30 Programs => Debug and Laptop me implemented
//? 30 Programs => 30 times

//? 1. addition of two integers without using + program
/* -------------------------
//--------------------------
? 30.
* A B C D
* A B C D
* A B C D
* A B C D
* */

interface Demo {

    static final int a = 90;//!by default => static and final

    //! Constructor can not be declare
//    Demo() {
//
//    }

    //! By default methods are public and abstract
    void add();
    
    void mul();
}

//? Implementation class.
class DemoIMPL implements Demo {
    @Override
    public void add() {
        System.out.println("Running add()");
    }

    @Override
    public void mul() {
        
    }
}

abstract class DemoAbstractOne implements Demo { }

//? Concrete Class
class DemoCon extends DemoAbstractOne {
    @Override
    public void mul() {

    }

    @Override
    public void add() {

    }
}

public class InterfaceDemo {
    //?Pratik Sherdiwala (Codelytics)
    /*
     * -> Interface is same as like a Java class but which is 100% incomplete in nature
     * -> To declare an interface, 'interface' keyword is used.
     * -> Inside an interface, only abstract members are allowed.
     * -> Inside an interface, we can not declare a constructor. Hence, object of an interface
     * can't be created.
     * -> Variable of an interface are by default static and final.
     * -> By default methods are public and abstract
     * -> To complete abstract methods of an Interface, we have to create an Implementation class.
     * -> Implementation class means, a class where interface is going to get implemented
     * with the help of implements keyword.
     * -> With the help of implementation class's object, we can access implemented methods
     * of an interface.
     * */

    public static void main(String[] args) {

        System.out.println(Demo.a);
        //Demo.a = 80;

        new DemoIMPL().add();

    }
}
