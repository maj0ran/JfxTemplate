package mrn.data;

public class Model {

    private int value = 0;

    public Model() {

    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void incValue() {
        this.value++;
    }

    public void decValue() {
        this.value--;
    }
}
