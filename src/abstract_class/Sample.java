package abstract_class;

abstract class Sample {
    private int a;

    Sample(int a) {
        this.a = a;
    }

    //abstract void add();

    public int getA() {
        return a;
    }
}

//! static members are not allowed

class SampleHelper extends Sample {
    SampleHelper(int a) {
        super(a);
    }
}

class TestSample {
    //90
    public static void main(String[] args) {

        SampleHelper sampleHelper = new SampleHelper(90);

        System.out.println(sampleHelper.getA());
    }
}
