package abstractandinterface;

import javax.swing.plaf.basic.BasicHTML;

abstract class House {
    private String roof = "House roof";
    private String wall = "Wall";
    private Door door;

    void setDoor(Door door) {
        this.door = door;
    }

    Door getDoor() {
        return door;
    }

    void openDoor() {
        System.out.println("Basic door opened");
    }

    void closeDoor() {
        System.out.println("Basic door closed");
    }


}

interface Door {
    void openDoor();

    void closeDoor();
}

class BasicHouse extends House {
}

class myHouse extends House {
    @Override
    void openDoor() {
        super.openDoor();
    }

    @Override
    void closeDoor() {
        super.closeDoor();
    }
}

class myDoor implements Door{
    @Override
    public void openDoor() {
        System.out.println("my Door opened");
    }

    @Override
    public void closeDoor() {
        System.out.println("my Door closed");
    }
}

public class Abstract {
    public static void main(String[] args) {
        House basicHouse = new BasicHouse();

        basicHouse.openDoor();
        basicHouse.closeDoor();

        House myHouse = new myHouse();
        Door myDoor = new

                myHouse.openDoor();
        myHouse.closeDoor();
    }
}
