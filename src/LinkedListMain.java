 class Node{
    Node next;
    int data;
    public Node(int data){
        this.data=data;
        next=null;
    }
    public void setData(int data){
        this.data=data;
    }
    public int getData(){
        return data;
    }
    public void setNext(Node next){
        this.next=next;
    }
    public Node getNext(){
        return next;
    }
}
class ListOperation{
    private Node head;
    private int size;
    public void insert(int data){
         Node node = new Node(data);
        if(isEmpty()){
          head=node;
          size++;
        }
        else{
            Node temp=head;
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(node);
            size++;
        }
    }
    public void insertAtPosition(int pos,int data){
        Node node =new Node(data);
        if (pos==1){
            Node temp=head;
            head=node;
            head.setNext(temp);
            size++;
        }
        else{
            Node temp=head;
            Node temp1=head.getNext();
            for(int i=1;i<pos-1;i++){
                temp=temp.getNext();
                temp1=temp1.getNext();
            }
            temp.setNext(node);
            node.setNext(temp1);
            size++;
        }
    }
    public void delete(){
        if(isEmpty()){
            System.out.println("list is empty");
        }
        else{
            Node temp2=head;
            Node temp=head.getNext();
            while(temp.getNext()!=null){
                temp=temp.getNext();
                temp2=temp2.getNext();
            }
            temp2.setNext(null);
            size--;
        }
    }
    public boolean isEmpty() {
        boolean res = false;
        if (head == null) {
            res = true;
        }
        return res;
    }
    public void Size(){
          System.out.println( size);

        }
     public void show(){
        Node temp=head;
        while (temp.getNext()!=null){
            System.out.print(temp.getData() +" " );
            temp=temp.getNext();

        }

        System.out.println(temp.getData());
     }
    }

public class LinkedListMain {
    public static void main(String args[]) {
        ListOperation l = new ListOperation();
        System.out.println(l.isEmpty());
        l.insert(10);
        l.insert(11);
        l.insert(12);
        l.insert(13);
        l.insert(14);
        l.insert(15);
        l.insert(16);
        l.show();
        l.Size();
        l.insertAtPosition(3,40);
        l.show();
        l.insertAtPosition(1,400);
        l.show();
        l.insertAtPosition(2,4000);
        l.show();
        l.insertAtPosition(7,6900);
        l.show();
        l.Size();
        l.delete();
        l.show();
        l.Size();
    }
}
