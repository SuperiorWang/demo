package wcq;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*List��ʹ��*/
public class text2 {

	public static void main(String[] args) {
		String a = "A";		
		String b = "B";		
		String c = "C";
		
		/*��������*/
		List<String> list = new ArrayList<>();   
		
		list.add(a);
		list.add(b);
		list.add(c);

		/*����������*/
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}		
	}
}
