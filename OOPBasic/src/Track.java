public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("This track started it`s work");
    }

    @Override
    public void stopWork() {
        System.out.println("This track stopped it`s work");
    }
}
