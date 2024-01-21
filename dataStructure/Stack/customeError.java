package dataStructure.Stack;

public class customeError extends Exception{

    private String error;

    public customeError(String errorMessage){
        this.error = errorMessage;
    }

    @Override
    public String toString(){
        return (this.error);
    }
}
