package DSA;

public class closebrac {

	public static void main(String[] args) {

		String str="(())()()()()";
		
		int close =0;
		int open=0;
		
		for(char ch:str.toCharArray())
		{
			if(ch=='(')
			{
				close++;
			}
			else if(ch==')')
			{
				open++;
			}
		}
		
		System.out.println(" close"+close);
	}

}
