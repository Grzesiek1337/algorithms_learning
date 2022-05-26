package pl.gm.linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> testList = new LinkedList<>();
        testList.addFront("second");
        testList.deleteFront();
        System.out.println(testList);

    }
}
