package pckg4;

public class ArrayStack {
	
		int size = 100;
		int array[];
		int top;

		public ArrayStack() {
			this(100);
		}
		public ArrayStack(int size) {
			this.size = size;
			this.array = new int[size];
			this.top = -1;
		}

		public void push(int pushedElement) {
			if (!isFull()) {
				
				array[++top] = pushedElement;
				System.out.println("Pushed element:" + pushedElement);
			} else {
				System.out.println("Stack is full !");
			}
		}

		public int pop() {
			if (!isEmpty()) {
				int returnedTop = top;
				top--;
				System.out.println("Popped element :" + array[returnedTop]);
				return array[returnedTop];

			} else {
				System.out.println("Stack is empty !");
				return -1;
			}
		}

		public int peek() {
			if (!this.isEmpty())
				return array[top];
			else {
				System.out.println("Stack is Empty");
				return -1;
			}
		}

		public boolean isEmpty() {
			return (top == -1);
		}

		public boolean isFull() {
			return (size - 1 == top);
		}

			}

