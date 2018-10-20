package Queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class NeuronCircularQueue {
    Neuron[] neuronQueue;
    int back;
    int front;

    public NeuronCircularQueue(int capacity){
        neuronQueue = new Neuron[capacity];
    }

    public void add(Neuron neuron){

        if (size() == neuronQueue.length - 1){
            int numItems = size();
            Neuron[] newArray = new Neuron[2 * neuronQueue.length];
            System.arraycopy(neuronQueue, front, newArray, 0, neuronQueue.length - front);
            System.arraycopy(neuronQueue, 0, newArray, neuronQueue.length - front, back);
            neuronQueue = newArray;
            front = 0;
            back = numItems;
        }
        neuronQueue[back++] = neuron;
    }

    public Neuron remove(){
        if (size() == 0){
            throw new NoSuchElementException();
        }
        Neuron neuron = neuronQueue[front];
        neuronQueue[front] = null;
        front++;
        if (size() == 0){
            front = 0;
            back = 0;
        }else if (front == neuronQueue.length){
            front = 0;
        }
        return neuron;
    }

    public Neuron peek(){
        if (size() == 0){
            throw new NoSuchElementException();
        }
        return neuronQueue[front];
}

    int size(){
        if (back >= front){
            return back - front;
        }else{
            return back - front + neuronQueue.length;
        }
    }

    @Override
    public String toString() {
        return "NeuronQueueArray{" +
                "neuronQueue=" + Arrays.toString(neuronQueue) +
                ", back=" + back +
                ", front=" + front +
                '}';
    }
}
