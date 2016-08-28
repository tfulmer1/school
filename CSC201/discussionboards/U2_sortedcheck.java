
/*
Checks an array to see if it is sorted
Unit 2 Discussion Board
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 27 Aug 2016
*/

import java.util.Scanner;

public class U2_sortedcheck
{
    public static Scanner kb = new Scanner(System.in);

	private static boolean isSorted(int[] list){
		for(int i = 1; i < list[0]; i++){
			if (list[i] > list[i+1])
				return false;
		}
		return true;
	}

	public static void main(String[] args)
	{
		//The example lists used index 0 to provide number of items to follow
		int[] list1 = {5, 1, 2, 3, 4, 5};
		int[] list2 = {10, 1, 2, 3, 4, 5, 7, 6, 8, 9, 10};
		int[] list3 = {8, 7, 6, 5, 4, 3, 2, 1, 0};
		int[] list4 = {12, 1, 2, 3, 5, 6, 7, 8, 9, 5, 54, 3, 1};

		System.out.println("List 1 is sorted: " + isSorted(list1));
		System.out.println("List 2 is sorted: " + isSorted(list2));
		System.out.println("List 3 is sorted: " + isSorted(list3));
		System.out.println("List 4 is sorted: " + isSorted(list4));
	}
}
