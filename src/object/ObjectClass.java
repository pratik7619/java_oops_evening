package object;

/*
 * Method Overriding
 * -----------------------
 * -> Declaring parent class method into subclass and changing its body it is known as
 * method overriding.
 * */

import java.util.Objects;

class Demo extends Object {
    //Default Constructor
    int a = 90;
    int b = 80;

    @Override
    public String toString() {
        return "Hello";
    }

    @Override
    public int hashCode() {
        return 29;
    }
}

//Object
/*
 * -> Object class is a super most class of all classes.
 * -> By default each and every classes are using the properties of Object class.
 * -> If Object class is not available, constructor concept is not applicable.
 * -> If constructor concept is not applicable, object of a class can't be created.
 * -> If object of a class cant be created, non-static members of a class can't be
 * accessed.
 * -> That is the reason each and every class must use properties of Object class.
 * */

public class ObjectClass {
    //?Pratik Sherdiwala (Codelytics)
    /*
     * getClass() => this method is used to get the class of an object.
     *
     * toString() => this method will return the address of an object(hexadecimal)
     *
     * hashCode() => this method will return the memory cell address of
     * an object in decimal format.
     *
     * */
    public static void main(String[] args) {

        Demo demo = new Demo();
        System.out.println(demo);//Demo@123db
        System.out.println(demo.toString());

        System.out.println(demo.hashCode());

        System.out.println(demo.getClass());
        System.out.println(demo.getClass().getSimpleName());
    }
}
