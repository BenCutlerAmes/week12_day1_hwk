public class WaterBottle {

    private int capacity;

    public WaterBottle(int capacity) {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }

    public void drink10(){
        capacity -= 10;
    }

    public void emptyBottle(){
        capacity = 0;
    }

    public void fillBottle() {
        capacity=100;
    }
}

