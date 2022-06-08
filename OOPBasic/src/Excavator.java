public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("This excavator started it`s work");
    }

    @Override
    public void stopWork() {
        System.out.println("This excavator stopped it`s work");
    }
}
