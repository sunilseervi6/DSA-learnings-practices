package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data1 , Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }

}
public class Linkedlist {
    private static Node convert(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1 ; i<arr.length ; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static int search(Node head , int val){
        Node temp = head;
        while(temp != null){
            if(temp.data == val){
                return 1;
            }
            temp=  temp.next;
        }
        return 0;

    }
    public static void main(String[] args){
        int[] arr = {12,2,3,4};
        Node head = convert(arr);
        System.out.println(head.data);
        //traversal
        int count=0;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
            count++;
        }
        System.out.println("the count of ll:"+count);

        int value = 20;
        System.out.print(search(head,value));

    }
    
}
