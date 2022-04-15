

interface Bhaashe
{
	void getName(String name);
	
}
class Kannada implements Bhaashe
{
	public void getName(String name)
	{
		System.out.println("Kannada : " + name);
	}
}
public class Inter5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kannada Bhaashe = new Kannada();
		Bhaashe.getName("Heaven");
	}

}



