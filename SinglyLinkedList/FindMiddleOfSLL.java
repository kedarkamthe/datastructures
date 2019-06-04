public class FindMiddleOfSLL {

    public static void main(String[] args) {
        Node<Integer> head = getHeadOfList();
        printList(head);
        Node<Integer> middleNode = getMiddleOfList(head);
        System.out.println("Middle Node of Given Singly Linked list is : "+middleNode.getData());
    }

    private static Node<Integer> getMiddleOfList(Node<Integer> head) {
        Node<Integer> slow = head, fast = head;
        boolean inc = true;
        while (slow.getNext() != null && fast.getNext() != null) {
            if (inc) {
                slow = slow.getNext();
                inc = false;
            } else {
                inc = true;
            }
            fast = fast.getNext();
        }
        return slow;
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
    private static void printList(Node<Integer> head) {
        while(head!=null){
            System.out.print(head.getData()+" ->");
            head =head.getNext();
            if(head == null)
                System.out.print(" null");
        }
        System.out.println("");
    }
}
