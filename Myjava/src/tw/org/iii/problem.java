package tw.org.iii;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class problem
{

	public static void main(String[] args)
	{
		apple a = new apple(2, "red");
		try
		{
			System.out.println("a");
			ObjectOutputStream testo = new ObjectOutputStream(new FileOutputStream("./dir1/appledata"));
			testo.writeObject(a);
			testo.flush();
			testo.close();
			System.out.println("OKOK");
			ObjectInputStream testi = new ObjectInputStream(new FileInputStream("./dir1/appledata"));
			apple bpple = (apple)testi.readObject();
			System.out.println(bpple.color);		
			testi.close();		
		}catch(Exception ee){ee.toString();}		
	}
}

class apple implements Serializable
{
	int size;
	String color;
	apple(int size, String color)
	{
		this.size = size;
		this.color = color;
	}
}
