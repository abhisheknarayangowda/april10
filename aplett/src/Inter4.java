

interface Hexagon
{
	void getArea(int length, int breadth);
}
class Square implements Hexagon
{
	public void getArea(int length,int breadth)
	{
		System.out.println("area of square is " + (length * breadth));
	}
}

public class Inter4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square r1 = new Square();
		r1.getArea(5, 5);
	}

}
