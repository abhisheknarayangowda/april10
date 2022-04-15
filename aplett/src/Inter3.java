

interface Animal
{
	void eat();
}
 class MammalInt implements Animal
{
	public void eat()
	{
		System.out.println("mammal eats");
		
	}
	public void travel()
	{
		System.out.println("mammal travels");
	}
	public int noOfLegs()
	{
		return 0;
	}
}
public class Inter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MammalInt m = new MammalInt();
		m.eat();
		m.travel();
			}

	}


