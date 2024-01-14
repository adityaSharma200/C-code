import java.util.ArrayList;

class Player 
{
   public static void main(String[] args)
   {

     ArrayList TIndia = new ArrayList();
	
 TIndia.add("Virat Kohli");
 TIndia.add("Ravindra jadeja");
 TIndia.add("Kl Rahul");
 TIndia.add("Shreyas Iyer");
 TIndia.add("Ishan kishan");
 TIndia.add("Shardul Thakur");
 TIndia.add("Surya Kumar Yadav");
 TIndia.add("Prasidh Krishna");
 TIndia.add("Rohit Sharma");

	 ArrayList TAus = new ArrayList();

 TAus.add("Mitch Marsh");
 TAus.add("Steve Smith");
 TAus.add("Pat Cummins");
 TAus.add("Adam Zampa");
 TAus.add("Josh inglis");
 TAus.add("Travis Head");
 TAus.add("Marcus Stoinis");
 TAus.add("David Warner");
 TAus.add("Glenn Maxwell");

        System.out.println("==============Team India==================");

	for(int i = 0 ; i < TIndia.size(); i++)
	{
	   System.out.println(TIndia.get(i));
	}
        System.out.println("=============Team Aus===================");
	for(Object obj : TAus)
	{	
		System.out.println(obj);
	}
 
	TIndia.addAll(TAus);
	//System.out.println(TIndia);
	
        System.out.println("==============Teams==================");

	for(int i = 0 ; i < TIndia.size(); i++)
	{
	   System.out.println(TIndia.get(i));
	}
        System.out.println("==============Contains==================");

	System.out.println(TIndia.contains("MS Dhoni"));

	

	System.out.println("==============Team India==================");

	TIndia.remove("Pat Cummins");
        
	System.out.println(TIndia);

   }
}