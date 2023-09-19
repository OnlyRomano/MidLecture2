public class Mdas extends input {
    private int sum, diff, prod, quo;

    public void Add() {
        sum = super.getdata1() + super.getdata2();
    }

    public void Subtract() {
        diff = super.getdata1() - super.getdata2();
    }

    public void Multiply() {
        prod = super.getdata1() * super.getdata2();
    }

    public void Divide() {
        quo = super.getdata1() / super.getdata2();
    }

    public int getSum() {
        return sum;
    }

    public int getDifferent() {
        return diff;
    }

    public int getProduct() {
        return prod;
    }

    public int getQuotient() {
        return quo;
    }
}