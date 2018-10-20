package LinkedList;

public class Main {
    public static void main (String[] args){
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(4);
        list.add(15);
        list.add(200);
        list.deleteAll();
        System.out.println(list.toString());
    }
}
