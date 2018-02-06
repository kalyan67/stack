package stack;
 class sta
{
	int array[]=new int[20];
	int i=0;
	public void push(int a)
	{
	array[i++]=a;
	
	}
	public void pop()
	{
	i--;
	
	}
	public void print()
	{
		for(int j=0;j<i;j++)
			System.out.print(array[j]);
	}
	
	}
public class Stackk {

	public static void main(String[] args) {
		sta s=new sta();
		s.push(5);
		s.push(7);
		s.print();
		s.pop();
		s.print();
		
	}
	
}
