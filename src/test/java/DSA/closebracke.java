package DSA;

public class closebracke {

	public static void main(String[] args) {
		
		String str = "((a+b)) + (c*(d+e)))";
		
		int open=0; int close=0;
		
		for(char ch:str.toCharArray())
		{
			if(ch=='(')
				open++;
			else if(ch==')')
				close++;
		}
		
		System.out.println("open br:"+open);


	}

}
