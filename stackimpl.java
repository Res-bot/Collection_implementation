public class stackimpl {
    int maxSize;
    int top; 
    int[] stkArr;

    public stackimpl(int size){
        maxSize = size;
        stkArr = new int[maxSize];
        top = -1; 
    }

    public boolean isFull(){
        return (top== maxSize - 1);
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack Overflow! Cannot push");
        }else{
            stkArr[++top] = value;
            System.out.println("value pushed into stack.");
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        }else{
            return stkArr[top--];
        }

    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty! No top element");
            return -1;
        }else{
            return stkArr[top];
        }
    }
    public static void main(String[] args){
        stackimpl stk = new stackimpl(4);

        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);

        System.out.println("deleted element: " + stk.pop());
        System.out.println("the top element after popping: " + stk.peek());
        System.out.println("is the stack empty? " + stk.isEmpty());

        stk.push(6);
        stk.push(7);
        stk.push(8);

    }
}
