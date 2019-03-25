public class WaterBottle {

    private int volume;

    public WaterBottle () {
        volume = 100;
    }

    public void drink() {
        volume -= 10;
    }

    public void empty() {
        volume = 0;
    }

    public void fill() {
        volume = 100;
    }
}
