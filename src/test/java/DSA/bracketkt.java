package DSA;

public class bracketkt {

	public static void main(String[] args) {
		
		String str="()(()()()())";
		
		int open=0;
		int close=0;
		
		for(char ch:str.toCharArray())
		{
			if(ch=='(')
			{
				open++;
			}
			else if(ch==')')
			{
				close++;
			}
		}
		
		
		System.out.println(" open"+open);
		System.out.println(" close "+close);

	}

}
