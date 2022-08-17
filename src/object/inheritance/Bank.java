package object.inheritance;

public class Bank {
    //?Pratik Sherdiwala (Codelytics)

    void deposit() {
        System.out.println("Lets deposite some money");
    }

    void withdraw() {
        System.out.println("Lets withdraw some money");
    }

    int getRateOfInterest() {
        return 0;
    }
}

class HDFC extends Bank {

    @Override
    int getRateOfInterest() {
        return 5;
    }
}

class ICICI extends Bank {

    @Override
    int getRateOfInterest() {
        return 7;
    }
}

class Axis extends Bank {
    @Override
    int getRateOfInterest() {
        return 11;
    }
}

/*
 * HDFC : Rate of Interest => 5
 * ICICI : Rate of Interest => 7
 * Axis : Rate of Interest => 11
 * */