package dataStructure.Stack.ArrayStack;
import dataStructure.Stack.customeError;
import dataStructure.Stack.stackFunctions;
public class ArrayStack<dataType> implements stackFunctions<dataType> {
    private dataType[] stack;

    private int size;
    private int top;

    public ArrayStack(int capacity){
        this.stack = (dataType[]) new Object[capacity];
        this.size = capacity;
        this.top = -1;

    }

    @Override
    public void push(dataType data) throws customeError {
        //System.out.println("top value before push : " + this.top);
        if(!isFull()){
            this.stack[++top] = data;
        } else{
            throw new customeError("Stack is Full");
        }

        //System.out.println("top value after push: " + this.top);
    }

    @Override
    public void pop() throws customeError {
        if(!isEmpty()){
            this.top--;
        }else{
            throw new customeError("Stack is Empty");
        }

    }

    @Override
    public boolean isFull() {
        return (this.top == size-1);
    }

    @Override
    public boolean isEmpty() {
        return (this.top == -1);
    }

    @Override
    public dataType peek() throws customeError {
        if(isEmpty()){
            throw new customeError("Stack is Empty");
        }
        return (this.stack[this.top]);
    }

}

