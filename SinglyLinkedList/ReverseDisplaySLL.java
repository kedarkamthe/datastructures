public class ReverseDisplaySLL {

    public static void main(String[] args) {
        Node<Integer> head = getHeadOfList();
        printList(head);
        System.out.println("Reverse display singly linked list using recursion");
        reversePrintUsingRecursion(head);
    }

    private static void reversePrintUsingRecursion( Node<Integer> head){
        if (head == null) {
            return;
        } else {
            reversePrintUsingRecursion(head.getNext());
            System.out.print(head.getData() + " - >");

        }
    }

    private static void printList(Node<Integer> head) {
        while(head!=null){
            System.out.print(head.getData()+" ->");
            head =head.getNext();
            if(head == null)
                System.out.print(" null");
        }
        System.out.println("");
    }


    public  static  Node<Integer> getHeadOfList(){
        Node<Integer> head = new Node<>(1,null);
        Node<Integer> node1 = new Node<>(2,null);
        Node<Integer> node2 = new Node<>(3,null);
        Node<Integer> node3 = new Node<>(4,null);
        Node<Integer> node4 = new Node<>(5,null);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        return head;

    }

}
