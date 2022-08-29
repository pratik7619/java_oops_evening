package access_specifier;

public class AccessSpecifier {

    public int a = 90;//default

    protected void add() {
        System.out.println("Hello");
    }

    //?Pratik Sherdiwala (Codelytics)
    /*
    * Access Specifier -> It is used to define or restrict scope of java members.
    *
     *  default
     * --------
     *  -> When no access specifier is declared that time by default, default access specifier
     * will be apply.
     *  -> default members can only access inside the package only.
     *
     *
     *  public
     * ---------
     * -> This members can be access anywhere inside a project
     * -> We can declare class, constructor, methods and variables as public
     *
     *  protected
     * ----------
     * -> This members can be access within a package only.
     * -> If you want to access protected member outside of the package, inheritance has to be
     * done.
     * -> constructor, methods and variables can be declare as protected.
     *
     *  private
     * ----------
     * -> private members can be access within a class only.
     * -> with the help of getter and setter method we can access private members of a class.
     *
     *
     * Encapsulation
     * --------------------
     * => Binding the data members(variables) with private access specifier, it is known as
     * Encapsulation.
     * => getter & setter methods to access private data members
     * => getter => to get the value of a private data member
     * => setter => to update/change the value of private data member
     *
     * class Demo {
     *
     *      private int a = 90;
     *
     *      public XXX getValue() {
     *          return value;
     *      }
     *
     *      public int getA() {
     *          return a;
     *      }
     *
     *      public void setValue(XXX variable) {
     *          this.variable = variable;
     *      }
     *
     *      public void setA(int a) {
     *          this.a = a;
     *      }
     * }
     *
    * */
}
