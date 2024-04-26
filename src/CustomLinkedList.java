public class CustomLinkedList {
    public CustomLinkedList list;
    public Node head;
    public int val;

    public CustomLinkedList() {
        this.val = val;
    }


    public void add(int val) {
        if (head == null) {
            head = new Node(val);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(val);


    }

    public void print() {
        Node current = head;
        while (current != null) {

            System.out.println(current.val);
            current = current.next;
        }
    }

    public int getSize() {
        int i = 0;
        Node current = head;
        while (current != null) {
            i++;
            current = current.next;
        }
        return i;
    }

//    public int getValue() {
//        Node current = head;
//        for (int i = 0; i < list.getSize(); i++) {
//
//        }
//
//        return val;
//    }

    public void sort() {

        Node current = head;

        while (current.next != null) {

            if (current.val > current.next.val) {
                Node node = current;
                while (node.next != null) {
                    int temp = node.val;

                    node.val = node.next.val;
                    node.next.val = temp;
                    node = node.next;
                }
            }
            current = current.next;
        }

    }

}
