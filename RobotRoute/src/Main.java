public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot(Direction.LEFT, 10, 12);

        System.out.format("Start: X - %s, Y - %S\n", robot1.getX(), robot1.getY());
        moveRobot(robot1, -13, -18);
        System.out.format("End:   X - %s, Y - %S\n", robot1.getX(), robot1.getY());
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        Direction up    = Direction.UP;
        Direction down  = Direction.DOWN;
        Direction right = Direction.RIGHT;
        Direction left  = Direction.LEFT;

        if(toX < robot.getX()) {
            while (robot.getDirection() != left) {
                robot.turnLeft();
            }

            while (robot.getX() < toX) {
                robot.stepForward();
            }
        }

        if(toX > robot.getX()) {
            while (robot.getDirection() != right) {
                robot.turnRight();
            }

            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }

        if(toY < robot.getY()) {
            while (robot.getDirection() != down) {
                robot.turnLeft();
            }

            while (robot.getY() < toY) {
                robot.stepForward();
            }
        }

        if(toY > robot.getY()) {
            while (robot.getDirection() != up) {
                robot.turnRight();
            }

            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
    }
}