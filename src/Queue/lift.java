package Queue;

import java.util.PriorityQueue;

public class lift {
    private int currentFloor;
    private PriorityQueue<Integer> floorRequests;

    public lift() {
        currentFloor = 0;
        floorRequests = new PriorityQueue<>();  // Min heap: nearest floor first
    }

    // Add a floor request
    public void requestFloor(int floor) {
        System.out.println("Floor " + floor + " requested.");
        floorRequests.add(floor);
    }

    // Serve next floor
    public void moveToNextFloor() {
        if (floorRequests.isEmpty()) {
            System.out.println("No pending floor requests.");
            return;
        }

        int nextFloor = floorRequests.poll();
        System.out.println("Moving from floor " + currentFloor + " to floor " + nextFloor);
        currentFloor = nextFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public static void main(String[] args) {
    	lift lift1 = new lift();
    	
        lift1.requestFloor(5);
        lift1.requestFloor(2);
        lift1.requestFloor(8);
        lift1.requestFloor(1);

        // Process requests in priority order (nearest floor first)
        while (true) {
            if (lift1.floorRequests.isEmpty()) break;
            lift1.moveToNextFloor();
        }

        System.out.println("All floor requests served.");
    }
}
