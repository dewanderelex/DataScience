package Queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class NeuronQueueArray {
    Neuron[] neuronQueue;
    int back;
    int front;

    public NeuronQueueArray(int capacity){
        neuronQueue = new Neuron[capacity];
    }

    public void add(Neuron neuron){
        if (back == neuronQueue.length){
            Neuron[] newArray = new Neuron[2 * neuronQueue.length];
            System.arraycopy(neuronQueue, 0, newArray, 0, neuronQueue.length);
            neuronQueue = newArray;
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
        return back - front;
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
