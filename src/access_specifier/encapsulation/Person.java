package access_specifier.encapsulation;

/*
* class => Stock
*
?   Accept values from User (Scanner) => TestStock (5 Stocks)
*
! private
*   name
*   buyPrice
*   sellPrice
*   quantity
*   totalInvestment
*
* */

public class Person {
    //?Pratik Sherdiwala (Codelytics)
    private int age = 20;
    private String name = "Babu";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //age | 50
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
