
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;

    }

    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }

    public String toString() {
//        if (this.value < 10) {
//            return "0" + this.value;
//        } else {
//            return "" + this.value;
//        }

        return (this.value < 10) ? "0" + this.value : "" + this.value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value < 0 || value > this.upperLimit) {
            return;
        }
        this.value = value;
    }
}
