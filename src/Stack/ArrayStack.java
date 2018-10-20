package Stack;

import java.util.EmptyStackException;

public class ArrayStack {
    Integer[] stack;
    int top = 0;

    public ArrayStack(int stackLength){
        stack = new Integer[stackLength];
    }

    public void push (int data){
        // Resizing the stack by creating a new array and initialize new array to the main array
        if (top == stack.length){
            Integer[] newArray = new Integer[stack.length * 2];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = data;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public Integer pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }

        Integer data = stack[--top];
        stack[top] = null;
        return data;
    }

    public Integer peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public int size(){
        return stack.length;
    }

    public String toString(){
        String result = "";
        return result;
    }
}
