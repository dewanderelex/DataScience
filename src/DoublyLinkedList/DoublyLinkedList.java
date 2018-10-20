package DoublyLinkedList;

public class DoublyLinkedList {
    Node head = null;
    Node tail = null;

    public void add (int data){
        Node node = new Node(data, null, null);
        if (head == null){
            tail = node;
        }else {
            Node current = head;
            while (current.next != null){
                Node temp = current;
                current = current.next;
                current.prev = temp;
            }
            current.next = node;
            node.prev = current;
        }
    }

    public String toString(){
        String result = "";
        if (head != null){
            Node current = head;
            while (current.next != null){
                result += current.data + " ";
                current = current.next;
            }
            result += current.data;
        }
        return result;
    }
}
