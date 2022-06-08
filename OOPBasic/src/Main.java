public class Main {
    public static void main(String[] args) {
        Machine[] machines = {new Track(), new Bulldozer(), new Excavator()};

        for (Machine i : machines) {
            i.doWork();
            i.stopWork();
            System.out.println();
        }
    }
}