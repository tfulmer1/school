
/*
This program is a virtual rolodex
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 20 November 2015
*/

import java.util.Scanner;

public class Rolodex
{
	String name;
	String number;
	
	//constructor
	public Rolodex(String newname, String newnumber){
		name = newname;
		number = newnumber;
	}
	
	//So I needed away to keep adding objects to the array since a rolodex has to grow, this is what I came up with it creates a new array with length + 1, adds each element including new, then returns the new array (presumably in place of the old one, although that isn't required)
	private static Rolodex[] updateRolodex(Rolodex[] inArray, Rolodex inName){
		Rolodex[] rolodexNew = new Rolodex[inArray.length+1];
		for (int i = 0; i < inArray.length; i++)
		{
			rolodexNew[i] = inArray[i]; 
		}
		rolodexNew[rolodexNew.length - 1] = inName;
		return rolodexNew;

	}

	
	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);
	
	Rolodex[] rolodex = new Rolodex[0];
	/*
		DEBUG CODE HERE:

	rolodex[0] = new Rolodex("Test","479");
	System.out.println(rolodex[0].name + " " + rolodex[0].number);

	rolodex = updateRolodex(rolodex, new Rolodex("Test2","477"));
	
	System.out.println(rolodex[0].name + " " + rolodex[0].number + " " + rolodex[1].name + " " + rolodex[1].number);
	*/

	boolean more = true;

	while (more == true)
		{

		System.out.println("Welcome to your virtual rolodex\nPlease input the name of the person you wish to add: ");
		String inname = kb.nextLine();

		System.out.println("Please enter this person's Phone number");
	
		String innum = kb.nextLine();

		Rolodex inperson = new Rolodex(inname, innum);	
		
		rolodex = updateRolodex(rolodex, inperson);

		System.out.println("You have successfully added: " + inperson.name + " " + inperson.number + "\n Would you like to enter an additional person in your rolodex? Use [y / n]");

		String moreRolo = kb.nextLine();
		if (moreRolo.equalsIgnoreCase("y"))
			more = true;
		else
			more = false;
		
		}
	System.out.println("Congratulations, your rolodex has been updated. Here are the entries in your rolodex:");

	for (Rolodex outperson : rolodex) {
		System.out.println(outperson.name + " " + outperson.number);
		
	}


	}
}
