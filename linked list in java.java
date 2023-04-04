class Node{
    int data; // to store data
    Node next; // to store next address
    public Node(int value){
        this.data=value;
        next=null;
    }
}
class LL{
    public Node addElementatStart(Node head,int data){
        Node new_node = new Node(data);
        Node t=head;
        head=new_node;
        head.next=t;
        return head;
    }
    public void addElement(Node head,int data){
        Node new_node=new Node(data);
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=new_node;
    }
    public void deleteElement(Node head){
        Node cur=head;
        while(cur.next.next!=null){
            cur=cur.next;
        }
        cur.next=null;

    }
    public void printList(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
        System.out.println();
    }
}

public class linkedlist {
    public static void main(String[] args) {
        LL h=new LL();
        Node head=new Node(10);
        h.addElement(head, 20);
        h.addElement(head, 30);
        h.addElement(head, 40);
        h.addElement(head, 50);
        h.printList(head);
        h.deleteElement(head);
        h.printList(head);
        head=h.addElementatStart(head, 5);
        h.printList(head);
    }
}