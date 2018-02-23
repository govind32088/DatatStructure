class Stack{

	char a[];
	static int top=-1;
	
	Stack(int n)
	{
		a=new char[n];
	}
	
	void push(char x){
		a[++top]=x;
	}
	
	void pop(){
		--top;
	}
	
	char top()
	{
		return a[top];
	}
	
	void print()
	{
		System.out.println("");
		for(int i=0;i<=top;i++){
			System.out.print(a[i] +" , ");
			
		}
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (top==-1)
		return true;
		else
			return false;
	}
}


public class StackBalanceParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch[]={'[','(',')',']','['};
		Stack sx=new Stack(ch.length);
		
		System.out.println(new StackBalanceParantheses().IsBalanced(ch, sx));
		
		

	}

	private boolean IsBalanced(char[] ch, Stack sx) {
		String strOpen="[{(";
		for(int i=0;i<ch.length;i++){
			if(strOpen.contains(String.valueOf(ch[i])))
				sx.push(ch[i]);
			else if (ch[i]=='}' || ch[i]==']' || ch[i]==')'){
				if(sx.isEmpty() ){
					return false;
				}
				else if ((sx.top() == '{' && ch[i] == '}') || (sx.top() == '[' && ch[i] == ']') || (sx.top() == '(' && ch[i] == ')')){
					sx.pop();
				}
				else
				{
					return false;
				}
			}
			
		}
		if(sx.isEmpty()){
			return true;
		}
		else
			return false;
	}

}
