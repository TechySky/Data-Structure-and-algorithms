
class SinglyLinkList {

    // Node
    static class Node {
        //to store a value
        int value;
        //to store next node address
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    //insert values
    public void push(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    //pop value
    public void pop() {

        if (head == null) {
            System.out.println("No Data Item to Pop");
        } else {
            Node currNode = head;
            if (tail == currNode) {
                head = null;
                tail = null;
            } else {
                while (currNode.next != tail) {
                    currNode = currNode.next;
                }
                int poppedValue = currNode.next.value;
                currNode.next = null;
                tail = currNode;
                System.out.println(poppedValue + " is popped !");
            }
        }

    }

    //Add First
    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    //insert before
    public void insertBefore(int newValue, int data) {
        if (head == null) {
            System.out.println("Insert Before -Sorry! Singly Linked List is Empty !");
        } else {
            if (head.value == data) {
                Node newNode = new Node(newValue);
                newNode.next = head;
                head = newNode;
            } else {
                Node currNode = head;
                while (currNode.next != null && currNode.next.value != data) {
                    currNode = currNode.next;
                }
                if (currNode.next == null) {
                    System.out.println("Insert Before - Data Not Found ! Value Not Inserted !");
                } else {
                    Node newNode = new Node(newValue);
                    newNode.next = currNode.next;
                    currNode.next = newNode;
                    System.out.println("Successfully Inserted " + newValue + " before" + currNode.value);

                }
            }

        }
    }

    //insert after
    public void insertAfter(int newValue, int data) {
        if (head == null) {
            System.out.println("Insert After - Sorry, Singly Linked List is Empty !");
        } else {
            Node currNode = head;
            while (currNode != null && currNode.value != data) {
                currNode = currNode.next;
            }
            if (currNode == null) {
                System.out.println("Insert After - Data Not Found ! Value Not Inserted !");
            } else {

                Node newNode = new Node(newValue);
                newNode.next = currNode.next;
                currNode.next = newNode;

                if (currNode == tail) {
                    tail = newNode;
                }
                System.out.println("Successfully inserted " + newValue + " after, " + currNode.value);

            }

        }
    }

    //remove
    public void remove(int data) {

        if (head == null) {
            System.out.println("Remove - Sorry ! Singly Linked List is Empty !");
        } else {

            if (head.value == data) {
                head = head.next;
                System.out.println("Successfully Removed " + data);
            } else {
                Node currNode = head;
                while (currNode.next != null && currNode.next.value != data) {
                    currNode = currNode.next;
                }

                if (currNode.next == null) {
                    System.out.println("Unable to Remove " + data + " -  Not Found !");
                } else {
                    if (currNode.next == tail) {
                        tail = currNode;
                    }
                    Node temp = currNode.next.next;
                    currNode.next = temp;
                    System.out.println("Successfully Removed " + data);

                }
            }

        }

    }


    //display values
    public void display() {
        if (head == null) {
            System.out.println("Display - Sorry! Singly Linked List is Empty !");
        } else {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.println("Value : " + currentNode.value);
                currentNode = currentNode.next;
            }
        }
    }


}

public class SinglyLinkListImplementation {
    public static void main(String[] args) {
        SinglyLinkList singlyLinkList = new SinglyLinkList();
        //push
        singlyLinkList.push(23);
        singlyLinkList.push(45);
        singlyLinkList.push(89);

//        //add first
        singlyLinkList.addFirst(74);
//
//        //insertBefore
        singlyLinkList.insertBefore(25, 23);
//
//        //insert after
        singlyLinkList.insertAfter(1000, 89);
//
//
//        //remove
        singlyLinkList.remove(1000);

        //pop
        singlyLinkList.pop();
        //display
        singlyLinkList.display();

    }
}
