public class FindMergingPointOf2SLL {
    public static void main(String[] args) {
        //create 2 lists
        Node<Integer> head1 = new Node<>(1,null);
        Node<Integer> head2 = new Node<>(7,null);
        Node<Integer> node1 = new Node<>(2,null);
        Node<Integer> node2 = new Node<>(3,null);
        Node<Integer> node3 = new Node<>(4,null);
        Node<Integer> node4 = new Node<>(5,null);
        Node<Integer> node5 = new Node<>(8,null);
        Node<Integer> node6 = new Node<>(9,null);
        Node<Integer> node7 = new Node<>(10,null);
        Node<Integer> node8 = new Node<>(11,null);
        head1.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        head2.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node7);
        node7.setNext(node8);
        node8.setNext(node3);

        //              1->2->3->4->5->NULL
      //                     /
      //   7->8->9->10->11 _/


        System.out.println("1st Singly Linked list is : ");

        printList(head1);
        System.out.println("2nd Singly Linked list is : ");
        printList(head2);

        Node<Integer> mergingPoint = getMergingPoint(head1,head2);
        System.out.println(mergingPoint.getData());

    }

    private static Node<Integer> getMergingPoint(Node<Integer> head1, Node<Integer> head2) {
        Node<Integer> first = head1;
        Node<Integer> second = head2;
        int firstLength =0,secondLength =0;
        while (first !=null) {
            first = first.getNext();
            firstLength++;
        }
        while (second !=null) {
            second = second.getNext();
            secondLength++;
        }


        int diff =0;
        if (firstLength > secondLength) {
            diff = firstLength - secondLength;
            first = head1;
            return traverseNodes(first, firstLength-diff);
        } else {
            diff = secondLength - firstLength;
            second = head2;
            return traverseNodes(second, secondLength- diff);
        }

    }

    private static Node<Integer> traverseNodes(Node<Integer> node, int nodesToTraverse) {
        while (nodesToTraverse > 0) {
            node = node.getNext();
            nodesToTraverse--;
        }
        return node;
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
