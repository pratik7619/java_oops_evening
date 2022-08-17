package object.inheritance;

/*
 * => Father => Bike (Scooty)
 *
 *   Garage => Scooty => Activa
 *
 * Method Overriding
 * ----------------------
 *=> Declaring super class method into sub class and changing its body,
 * it is known as Method Overriding.
 * ----------------------------------------------------------------------
 *
 * 3. Multiple Inheritance
 * -> When a class trying to extends multiple class at same time, this type of
 * inheritance is known as Multiple Inheritance.
 * -> In java, there is no syntex to extends multiple classes at same time.
 * -> Here Object properties will never reach to the sub class this problem is
 * known as Diamond Ambiguity Problem.
 * -> In java, multiple inheritance at class level is not possible because of
 * Diamond Ambiguity Problem. But with the help of interface concept
 * we can achieve Multiple Inheritance.
 *
 * -----------------------------------------------------------------------
 * 4. Hierarchical Inheritance
 * -> This inheritance can be achieve by creating one super class and multiple
 * sub classes.
 *
 *
 *
 *
 * */

class Father {
    void bike() {
        System.out.println("I am a Super Scooty");
    }
}

class GrandFather {

}

class Son extends Father {

    @Override
    void bike() {
        //method body/ block/ area
        System.out.println("I am Almighty Activa...");
    }
}

public class TestBike {
    //?Pratik Sherdiwala (Codelytics)
    public static void main(String[] args) {

        Son son = new Son();
        son.bike();

        Father father = new Father();
        father.bike();
    }
}
