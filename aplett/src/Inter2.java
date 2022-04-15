import java.applet.Applet;

interface Language 
{
	void getName(String name);
	
}
class ProgrammingLanguage implements Language
{
	public void getName(String name)
	{
		System.out.println("programming language: " + name);
	}
}


public class Inter2 extends Applet {
	ProgrammingLanguage language = new ProgrammingLanguage();
	language.getName("java");
}
