public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = node;
        }
        size += 1;

    }
    public void insertLast(int value){
        Node node = new Node(value);
        if(tail == null){
            insertFirst(value);
            return;
        }
        //another way;;
//        if(tail == null){
//            tail = node;
//            head = node;
//            return;
//        }
        tail.next = node;
        tail = node;
        size++;

    }
    public void insertLast2(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        tail = node;
        size++;
    }
    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i=1 ; i<index ; i++){
            temp = temp.next;
        }
        Node newNode = new Node(value , temp.next);
        temp.next = newNode;
        size++;

    }
    public void insertAtIndex(int value , int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        int count= 0;
        Node node = new Node(value);
        Node temp =head;
        while (index-1 != count) {
            temp =temp.next;
            count++;
        }
        node.next = temp.next;
        temp.next  = node;
        size++;

    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }


    public Node get(int index){
        Node node = head;
        for(int i=0 ; i<index ; i++){
            node = node.next;
        }
        return node;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int value = tail.value;
        tail = secondLast;

        tail.next = null;
        size--;
        return value;
    }
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size){
            return deleteLast();
        }
        Node prev = get(index-1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        return value;

    }
    public int find(int value){
        Node node = head;
        int index=0;
        while(node != null){
            if(node.value == value){
                return index;
            }
            node = node.next;
            index++;
        }
        return -1;
    }



    public void display(){
        Node temp = head;
        while( temp != null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node (int value , Node next){
            this.value = value;
            this.next = next;
        }
    }

}
