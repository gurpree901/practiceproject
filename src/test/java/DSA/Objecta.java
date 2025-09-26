package DSA;

public class Objecta {

	public static void main(String[] args) {
		
		Object[] ob= {"1","#","2","4","$","9"};
		
		int sum=0;
		for(Object a:ob)
		{
			if(a instanceof String)
			{
				String st=(String)a;
				
				if(st.matches("\\d+"))
				{
					sum+=Integer.parseInt(st);
				}
			}
		}
		
		System.out.println(sum);
		

	}

}
