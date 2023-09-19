public class Average extends Mdas {
    private int data3, avg;

    public void setdata3(int value) {
        data3 = value;
    }

    public void setAverage() {
        super.Add();
        avg = (super.getSum() + data3) / 3;
    }

    public int getdata3() {
        return data3;
    }

    public int getAverage() {
        return avg;
    }
}
