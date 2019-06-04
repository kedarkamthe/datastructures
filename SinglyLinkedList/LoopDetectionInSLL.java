 public static void main(String[] args) {
        Node<Integer> head = getHeadOfList();
     //   printList(head);  1-2-3-4-5+
    //                          |    |
    //                          |____|
        System.out.println("Does loop Exists in singly linked list :" +isLoopExistsInSLL(head) );
    }

    private static boolean isLoopExistsInSLL(Node<Integer> head) {

        Node<Integer> slowPtr = head, fastPtr = head;
        while (slowPtr != null && fastPtr != null && fastPtr.getNext() != null) {
            slowPtr =slowPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();
            if(slowPtr == fastPtr){
                return true;
            }
        }
        return  false;
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
