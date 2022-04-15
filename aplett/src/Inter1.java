import java.applet.AppletContext;
import java.applet.AppletStub;
import java.net.URL;

interface Polygon extends AppletStub
{
	void getArea(int length, int breadth);
}
class Rectangle implements Polygon
{
	public void getArea(int length,int breadth)
	{
		System.out.println("area of rectangle is" + (length * breadth));
	}

	@Override
	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public URL getDocumentBase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URL getCodeBase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getParameter(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppletContext getAppletContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void appletResize(int width, int height) {
		// TODO Auto-generated method stub
		
	}
}
public class Inter1 {
	Rectangle r1 = new Rectangle();
	r1.getArea(5, 6);
		}

	

