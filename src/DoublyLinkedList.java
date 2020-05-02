class Node1 {
    Node1 next;
    Node1 previous;
    int data;
    public Node1(int data){
        this.data=data;
        next=null;
        previous=null;
    }
    public void setData(int data){
        this.data=data;
    }

    public int getData() {
        return data;
    }

    public void setNext(Node1 next) {
        this.next = next;
    }

    public Node1 getNext() {
        return next;
    }

    public void setPrevious(Node1 previous) {
        this.previous = previous;
    }

    public Node1 getPrevious() {
        return previous;
    }
}
class Double{
    private Node1 head;
    private int data;
    private int size;

    public void insertAtBeg(int data) {
        Node1 node = new Node1(data);
        if (head == null) {
            head = node;
            size++;
        } else {
            head.setPrevious(node);
            node.setNext(head);
            head = node;
            size++;
        }
    }

    public void insertAtEnd(int data) {
        Node1 node = new Node1(data);
        if (head == null) {
            head = node;
            size++;
        } else {
            Node1 temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            node.setPrevious(temp);
            temp.setNext(node);
            size++;
        }
    }

    public void deleteAtBeg() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            head = head.getNext();
            head.setPrevious(null);
            size--;
        }
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            Node1 temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            if (temp.getPrevious() != null) {
                temp = temp.getPrevious();
                temp.setNext(null);
                size--;
            } else {
                head = null;
                size--;
            }
        }
    }
    public void show(){
        Node1 temp=head;
        while (temp.getNext()!=null){
            System.out.print(temp.getData() +" " );
            temp=temp.getNext();

        }

        System.out.println(temp.getData());
    }
    public void size(){
        System.out.println(size);
    }
    }
 class DoubleLinkedList{
    public static void main(String[] args) {
        Double d =new Double();
        d.insertAtBeg(1);
        d.insertAtEnd(2);
        d.insertAtEnd(3);
        d.insertAtEnd(4);
        d.insertAtEnd(5);
        d.insertAtBeg(7);
        d.size();
        d.deleteFromEnd();
        d.deleteAtBeg();
        d.show();
        d.size();


    }
}