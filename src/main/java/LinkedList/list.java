package LinkedList;

public class list {
    private class  Node{

        private int value ;
        private Node next;
        public Node(int value ){
            this.value= value ;
        }
        public Node(int value,Node next ){
            this.value= value ;
            this.next= next;
        }

    }
}
