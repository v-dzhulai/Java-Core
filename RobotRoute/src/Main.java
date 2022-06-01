public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot(Direction.LEFT, -2, -7);

        System.out.format("Start: X = %s, Y = %S\n", robot1.getX(), robot1.getY());
        moveRobot(robot1, 13, 18);
        System.out.format("End:   X = %s, Y = %S\n", robot1.getX(), robot1.getY());
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

            while (toX < robot.getX()) {
                robot.stepForward();
            }
        }

        if(toX > robot.getX()) {
            while (robot.getDirection() != right) {
                robot.turnRight();
            }

            while (toX > robot.getX()) {
                robot.stepForward();
            }
        }

        if(toY < robot.getY()) {
            while (robot.getDirection() != down) {
                robot.turnLeft();
            }

            while (toY < robot.getY()) {
                robot.stepForward();
            }
        }

        if(toY > robot.getY()) {
            while (robot.getDirection() != up) {
                robot.turnRight();
            }

            while (toY > robot.getY()) {
                robot.stepForward();
            }
        }
    }
}