public class FindNthNodeFromEndOfSLL {

    public static void main(String[] args) {
        Node<Integer> head = getHeadOfList();
        printList(head);
        int n =3;
        Node<Integer> nthNode = getNthNodeFromEnd(head,n);
        System.out.println("Nth Node from end of Given Singly Linked list is : "+nthNode.getData());
    }

    private static Node<Integer> getNthNodeFromEnd(Node<Integer> head,int n) {
        int len =0;
        Node<Integer> current =head;
        while (current!=null) {
            current = current.getNext();
            len++;
        }

        if(n>len) {
            System.out.println("n is greater than length");
            return null;
        }
        else{
            int diff = len-n;
            current = head;
            while (diff>0){
                current =current.getNext();
                diff--;
            }

            return  current;

        }

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
