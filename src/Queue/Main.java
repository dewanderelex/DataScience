package Queue;

public class Main {

    Neuron head = null;

    public void add (Neuron neuron){
        if (head == null){
            head = neuron;
        }else{
            Neuron current = head;
            while(current.getAxon() != null){
                current = current.getAxon();
            }
            current = neuron;
        }
    }

    public static void main (String[] args){
        NeuronCircularQueue arr = new NeuronCircularQueue(3);

        Neuron n1 = new Neuron(1, null,null);
        Neuron n2 = new Neuron(2, null,null);
        Neuron n3 = new Neuron(3, null,null);
        Neuron n4 = new Neuron(4, null,null);
        Neuron n5 = new Neuron(5, null,null);
        Neuron n6 = new Neuron(6, null,null);
        arr.add(n1);
        arr.add(n2);
        arr.add(n3);
        arr.add(n4);
        arr.add(n5);
        arr.add(n6);
        System.out.println(arr.toString());
    }
}
