import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Vl 
{
	public static void main(String[] args) 
	{
		
		LinkedList li = new LinkedList();
		
		li.add("Sheela");
		li.add("leela");
		li.add("Meena");
		li.add("Ravi");
		li.add("Geeta");
		li.add("Reeta");		
		
		System.out.println(li);
		
		ListIterator l1 = li.listIterator();
		
		System.out.println("=============");
		
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		
		System.out.println("=============");
		
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}
		
		System.out.println("=============");
		if(li.contains("Aditya"))
		{
			System.out.println("My name is present .");
		}
		else
		{
			System.out.println("My name is not present .");
		}
		
		li.add(3, "juli");
		
		System.out.println("=============");
		System.out.println(li);
		
		System.out.println("======Ascending=======");
		Collections.sort(li);
		System.out.println(li);
		
		System.out.println("======Descending=======");
		Collections.reverse(li);
		System.out.println(li);
		
		
		
		
		System.out.println("=============");
		
		li.remove("juli");
		
		if(li.contains("juli"))
		{
			System.out.println("Cousin juli not been removed");
			
		}
		else
		{
			System.out.println("Cousin juli has been removed");
		}
		
		//System.out.println(li.contains("juli"));
        System.out.println("=============");
		
		System.out.println(li);
		
		
		
		
		
		LinkedList li1 = new LinkedList();
		
		li1.add("Arjun");
		li1.add("Karan");
		li1.add("Abhishek");
		li1.add("AlbartRaj");
		System.out.println("=============");
		li.addAll(li1);
		System.out.println(li);
		
		System.out.println("=============");
		
		Collections.sort(li);
		
		ListIterator l2 = li.listIterator();
		
		while(l2.hasNext())
		{
			System.out.println(l2.next());
		}
		
		//System.out.println(li);
		
		
	}
}
