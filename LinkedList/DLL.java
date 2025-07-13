public class DLL {
    private Node head;
    public class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }
        public Node (int value , Node prev , Node next){
            this.value = value;
            this.prev  = prev;
            this.next = next;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int value){
        Node node = head;
        Node newNode = new Node(value);
        while(node.next != null) {
            node = node.next;
        }
        node.next = newNode;
        newNode.prev = node;
        newNode.next = null;

    }
    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.value + "-->");
            last = node;
            node = node.next;

        }
        System.out.println("END");
        System.out.println("Print in reverse:");
        while(last != null){
            System.out.print(last.value +"-->");
            last = last.prev;
        }
        System.out.println("START");
    }
}
