public class StackPH {
    private int maxSize;
    private int top;
    private char [] stackArray;


    public StackPH(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new char[maxSize];
        top=-1;
    }

    public void push(char val){
        top++;
        stackArray[top]=val;
    }
    public char pop(){
        return stackArray[top--];
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (top==maxSize-1);
    }

}
