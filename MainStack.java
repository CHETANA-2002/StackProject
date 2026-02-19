package Stack;

public class MainStack {

	public static void main(String[] args) {
		MyStack ms=new MyStack(5);
		ms.push(23);
		ms.push(56);
		ms.push(98);
		ms.push(58);
		System.out.println(ms);
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms);
		System.out.println(ms.peek());
		System.out.println(ms.peek());
		System.out.println(ms);
		System.out.println(ms.size());
		

	}

}
