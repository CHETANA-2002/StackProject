package Stack;

public class MyStack {
	int[] stk;
	int top=-1;
	int capacity;
	MyStack(int capacity)
	{
		stk=new int[capacity];
		this.capacity=capacity;
	}
	void push(int ele) {
		if(top==capacity-1)
		{
			System.out.println("stack is overFlow");
			return;
		}
		stk[++top]=ele;
	}
	 int pop() {
		 if(top==-1)
		 {
			 System.out.println("stack is underflow ");
			 return 0;
		 }
		return stk[top--];
	 }
	 public String toString()
	 {
		 String str="[";
		 for(int i=0;i<=top;i++)
		 {
			 str=str+stk[i]+"";
		 }
		return str+"]";
		 
	 }
	 int peek() {
		 if(top==-1)
		 {
			 System.out.println("Stack is under floe");
			 return 0;
		 }
		return stk[top];
	 }
	 int size()
	 {
		return top+1;
		 
	 }

}
