public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator (int minFloor, int maxFloor) {
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor >= minFloor ? currentFloor - 1 : currentFloor;
    }

    public void moveUp() {
        currentFloor = currentFloor <= maxFloor ? currentFloor + 1 : currentFloor;
    }

    public void move(int floor) {
        if (floor > currentFloor && floor <= maxFloor) {
            for (; currentFloor < floor; moveUp()) {
                System.out.println(getCurrentFloor());
            }
        }
        if (floor < currentFloor && floor >= minFloor) {
            for (; currentFloor > floor; moveDown()){
                System.out.println(getCurrentFloor());
            }
        }
        if (floor > maxFloor || floor < minFloor) {
            System.out.println("Ошибка");
        }
    }
}
