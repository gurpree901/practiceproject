package DSA;

public class closebracker {

	public static void main(String[] args) {
		
		String str="((((())))))";
		
		int close=0;
		int open=0;
		
		for(char ch:str.toCharArray())
		{
			if(ch=='(')
				open++;
			else if(ch==')')
				close++;
		}
		
		System.out.println("open"+open);
		System.out.println("close"+close);

	}

}
