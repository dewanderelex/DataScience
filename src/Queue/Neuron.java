package Queue;

import java.util.Arrays;

public class Neuron {
    private int id;
    private Neuron[] dendrites;
    private Neuron axon;

    public Neuron(int id, Neuron[] dendrites, Neuron axon) {
        this.id = id;
        this.dendrites = dendrites;
        this.axon = axon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Neuron[] getDendrites() {
        return dendrites;
    }

    public void setDendrites(Neuron[] dendrites) {
        this.dendrites = dendrites;
    }

    public Neuron getAxon() {
        return axon;
    }

    public void setAxon(Neuron axon) {
        this.axon = axon;
    }

    @Override
    public String toString() {
        return "Neuron{" +
                "id=" + id +
                '}';
    }

}
