class Node2 {
    Node2 next;
    int data;
    public Node2(int data){
        this.data=data;
        next=null;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setNext(Node2 next) {
        this.next = next;
    }

    public Node2 getNext() {
        return next;
    }
}
class CircularImplementation {
    private Node2 last;
    private int data;
    private int size;
    public void insertAtBeg(int data) {
        Node2 node = new Node2(data);
        if (last == null) {
            last = node;
            last.setNext(last);
            size++;
        } else {
            node.setNext(last.getNext());
            last.setNext(node);
            size++;
        }
    }
    public void insertAtEnd(int data) {
        Node2 node = new Node2(data);
        if (last == null) {
            last = node;
            last.setNext(last);
            size++;
        } else {
            node.setNext(last.getNext());
            last.setNext(node);
            last = node;
            size++;
        }
    }
    public void show() {
        if (last == null)
            System.out.println("list is empty");
        else {
            Node2 temp = last.getNext();
            while (temp != last) {
                System.out.print(temp.getData() + " ");
                temp = temp.getNext();
            }
            System.out.println(temp.getData() + " ");
        }
    }
    public void deleteAtBeg() {
        if (last == null) {
            System.out.println("Nothing to delete");
        } else {
            Node2 temp = last.getNext();
            last.setNext(temp.getNext());
        }
    }
    public void deleteAtEnd() {
        if (last == null) {
            System.out.println("Nothing to delete");
        } else {
            Node2 temp1=last;
           Node2 temp = last.getNext();
            while (temp!= last) {

                temp = temp.getNext();
                temp1=temp1.getNext();
            }

            temp1.setNext(temp.getNext());
            last=temp1;
        }
    }
}
class CircularLinkedList {
    public static void main(String args[]) {
        CircularImplementation c = new CircularImplementation();
        c.insertAtBeg(2);
        c.insertAtEnd(5);
        c.insertAtEnd(6);
        c.insertAtEnd(7);
        c.insertAtEnd(8);
        c.deleteAtEnd();
        c.deleteAtEnd();
        c.deleteAtEnd();
        c.show();
        c.deleteAtBeg();
        c.show();
        c.insertAtBeg(11);
        c.insertAtEnd(44);
        c.show();
    }
}
