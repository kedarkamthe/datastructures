public class FindLengthOfLoopInSLL {

    public static void main(String[] args) {
        Node<Integer> head = getHeadOfList();
        //   printList(head);  1-2-3-4-5+
        //                         |    |
        //                         |____|

        Integer length = getLengthOfLoopInSLL(head);
        if (length == -1) {
             System.out.println("No loop Exists in given singly linked list.");
        } else {
             System.out.println("Length of loop in given singly linked list :" + length);
        }
    }

    private static Integer getLengthOfLoopInSLL(Node<Integer> head) {

        Node<Integer> slowPtr = head, fastPtr = head;
        boolean isLoopExists =false;

        while (slowPtr != null && fastPtr != null && fastPtr.getNext() != null) {
            slowPtr =slowPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();
            if(slowPtr == fastPtr){
                isLoopExists = true;
                break;
            }
        }

        if(isLoopExists) { // if loop exists in linked list the return starting node of list

            Integer count =1;
            while (fastPtr.getNext()!=slowPtr) {
                fastPtr = fastPtr.getNext();
                count++;
            }
            return count;
        }
        else {
            return  -1;
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
        node4.setNext(node2);

        return head;
    }
}
