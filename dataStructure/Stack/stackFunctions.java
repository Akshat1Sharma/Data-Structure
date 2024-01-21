package dataStructure.Stack;

public interface stackFunctions<dataType> {

    public void push(dataType data) throws customeError;
    public void pop() throws customeError;

    public boolean isFull();

    public boolean isEmpty();

    public dataType peek() throws customeError;
}
