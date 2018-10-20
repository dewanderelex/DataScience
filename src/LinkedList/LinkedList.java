package LinkedList;

public class LinkedList {
    Node head = null;

    public void add (int data){
        Node node = new Node(data, null);
        if (head == null){
            head = node;
        }else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }

    public void insert(int data, int index){
        Node node = new Node (data, null);
        Node current = head;
        for (int i = 0; i < index - 1; i++){
            current = current.next;
        }
        node.next = current.next;
        current.next = node;
    }

    public void put (int data, int index){
        Node node = new Node (data, null);
        Node current = head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }
        current.data = node.data;
    }

    public void delete (int index){
        Node current = head;
        for (int i = 0; i < index - 1; i++){
            current = current.next;
        }
        current.next = current.next.next;
    }

    public void deleteAll (){
        head = null;
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
