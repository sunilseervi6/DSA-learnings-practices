

public class CLL {
    private Node head;
    private Node tail;
    public CLL(){
        this.head = null;
        this.tail = null;
    }

    private class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    public void insert(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }
    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.val +"->");
                node = node.next;
            }while(node != head);
            System.out.println("HEAD");
        }
    }

    public void delete(int value){

        Node node = head;
        if(head == null) return;  // empty list
        //if there is only one element
        if(head == tail && head.val == value){
            head=null;
            tail = null;
            return;
        }
        //if  head is the deleting value
        if(node.val == value){
            head = head.next;
            tail.next = head;
            return ;
        }
        while(node.next != head){
            if(node.next.val == value){
                //if deleting tail
                if(node.next == tail){
                    tail = node;
                }
                node.next = node.next.next;
                return ;
            }
            node = node.next;
        }
    }
}
