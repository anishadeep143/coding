package coding.lab2;

public class Actual {

	public static void main(String[] args) {
		Item[] items=new Item[4];
		items[0]=new Book(12,"Alchemist", 200, "paul coleo");
		items[1]=new JournalPaper(81, "The need for cyber security", 300, "Nirnay", 2017);
		items[2]=new Video(21);
		items[3]=new CD(41, "win Xp BOOT","Microsoft");
		
   for(Item a:items)
   {
	   System.out.println(a.toString());
   }

	}

}
