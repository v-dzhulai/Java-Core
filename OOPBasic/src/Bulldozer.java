public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("This bulldozer started it`s work");
    }

    @Override
    public void stopWork() {
        System.out.println("This bulldozer stopped it`s work");
    }
}
