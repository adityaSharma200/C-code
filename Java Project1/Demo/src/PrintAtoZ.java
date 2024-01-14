import java.util.ArrayList;

import java.util.*;


public class PrintAtoZ {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		for(char c = 'A' ; c <= 'Z'; c++)
		{
			a.add(c);
		}
		System.out.println(a);
		
		Iterator i = a.iterator();
		
		System.out.println("========Using Iterator=========\n");
		while(i.hasNext())
		{
			System.out.print(i.next()+"  ");
		}
		
		ListIterator j = a.listIterator();
		
		
		
		System.out.println("========Using ListIterator backward=========\n");
		while(j.hasNext())
		{
			System.out.print(j.next()+"  ");
		}
				
		System.out.println("========Using ListIterator forward=========\n");
		while(j.hasPrevious())
		{
			System.out.print(j.previous()+"  ");
		}
		
		System.out.println("========Using ListIterator forward=========\n");
		
		int count = 0 ;
		
		while(count <= a.size())
		{
			if(count % 2 == 0)
			{
				System.out.println(a.get(count));		
			}
			else
			{
				a.remove(a);
			}
				count++;
		}
		
		
		

	}

}
