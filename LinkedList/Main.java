
public class Main{
     public static void main(String[] args) {
        LL list = new LL();
//      list.insertFirst(3);
//      list.insertFirst(5);
//      list.insertFirst(6);
//      list.insertFirst(8);
//
//      list.display();
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
        list.insertLast(8);
        list.insertLast(9);
        list.display();

        list.insert(15,2);
        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(2));
        list.display();

         System.out.println(list.find(15));



     }
 }