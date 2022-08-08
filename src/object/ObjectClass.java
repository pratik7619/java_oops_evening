package object;

class Demo extends Object {
    //Default Constructor
    int a = 90;
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
     * toString() =>
     *
     * hashCode() =>
     * */
    public static void main(String[] args) {

        Demo demo = new Demo();
        System.out.println(demo);
        System.out.println(demo.toString());

        System.out.println(demo.getClass());
        System.out.println(demo.getClass().getSimpleName());
    }
}
