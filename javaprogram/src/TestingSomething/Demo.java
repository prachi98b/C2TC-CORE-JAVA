package TestingSomething;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		do
		{
			x++;
			System.out.println(x);
			
			if(++x<5)
				continue;
			
		}while(++x<10);
		

	}

}
