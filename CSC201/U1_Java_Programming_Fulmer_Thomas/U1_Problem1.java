
/*
Displays a computer along with upgrade options and adjusts the price accordingly
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 20 Aug 2016
*/

import java.util.Scanner;

public class U1_Problem1
{
	public static Scanner kb = new Scanner(System.in);
	public static double base_price = 1862.10;
	public static String base_processor = "Intel Core i7-6700HQ Processor (6MB Cache, 3.5 GHz)";
	public static String upgrade_processor = "Intel Xeon E3-1505M v5 Processor(8MB Cache, 3.9GHz)";
	public static double upgrade_processor_cost = 1030.00;
	public static String base_os = "Windows 10 Home, 64 bit";
	public static String base_ram = "8GB DDR4";
	public static String upgrade_ram = "32GB DDR4";
	public static double upgrade_ram_cost = 310.00;
	public static String base_gpu = "NVIDIA Quadro M600M 2GB";
	public static String upgrade_gpu = "NVIDIA Quadro M5000M 8GB";
	public static double upgrade_gpu_cost = 1370.00;
	public static String base_harddrive = "SATA3 256GB SSD";
	public static String upgrade_harddrive = "PCIe-NVMe 1 TB SSD";
	public static double upgrade_harddrive_cost = 380.00;

	public static void main(String[] args)
	{

		System.out.println("Greetings, I am computer-sells-o-bot 9100");
		System.out.println("I am reading your mind to find a good computer option...");
		System.out.println(".....");
		System.out.println("Ok, I have selected a high powered laptop work station with these stats:");
		System.out.println("\nBase Processor: " + base_processor);
		System.out.println("Base OS: " + base_os);
		System.out.println("Base RAM: " + base_ram);
		System.out.println("Base GPU: " + base_gpu);
		System.out.println("Base Harddrive: " + base_harddrive);
		System.out.println("========Base Cost: " + base_price + "=========\n\n");
		System.out.println("Please select from the following Options:\n1. Buy computer as is\n2. Buy computer with all upgrades\n3. Show me upgrade options to choose from");
		System.out.println("Choose 1/2/3");
		int choice;
		do {
			choice = kb.nextInt();
			if ((choice < 1) || (choice > 3))
				System.out.println("Your selection is not valid. Try again, choose 1/2/3");
		} while ((choice < 1) || (choice > 3));
		int upgrade_choice;
		if (choice == 1)
			System.out.println("I'm glad you have bowed to my superior wisdom and expertise\nYou have been charged $" + base_price);
		else if (choice == 2)	
			System.out.println("Excellent choice, I knew you'd add everything. \nYour new price is: $" + (base_price + upgrade_gpu_cost + upgrade_harddrive_cost + upgrade_processor_cost + upgrade_ram_cost));
		else {
			System.out.println("Sure, I can give you the detailed options. Choose 1 to add, 0 to keep the base version:");
			System.out.println("Add a " + upgrade_processor + "for $" + upgrade_processor_cost + "?");
			upgrade_choice = kb.nextInt();
			if (upgrade_choice == 1){
				System.out.println("Added");
				base_price += upgrade_processor_cost;
				base_processor = upgrade_processor;
			}
			System.out.println("Add a " + upgrade_gpu + "for $" + upgrade_gpu_cost + "?");
			upgrade_choice = kb.nextInt();
			if (upgrade_choice == 1){
				System.out.println("Added");
				base_price += upgrade_gpu_cost;
				base_gpu = upgrade_gpu;
			}
			System.out.println("Add a " + upgrade_harddrive + "for $" + upgrade_harddrive_cost + "?");
			upgrade_choice = kb.nextInt();
			if (upgrade_choice == 1){
				System.out.println("Added");
				base_price += upgrade_harddrive_cost;
				base_harddrive = upgrade_harddrive;
			}
			System.out.println("Add a " + upgrade_ram + "for $" + upgrade_ram_cost + "?");
			upgrade_choice = kb.nextInt();
			if (upgrade_choice == 1){
				System.out.println("Added");
				base_price += upgrade_ram_cost;
				base_ram = upgrade_ram;
			}
			System.out.println("\n\nHere is your final configuration:");
			System.out.println("Processor: " + base_processor);
			System.out.println("OS: " + base_os);
			System.out.println("RAM: " + base_ram);
			System.out.println("GPU: " + base_gpu);
			System.out.println("Harddrive: " + base_harddrive);
			System.out.println("\nYour new total is: " + base_price + " just as I expected");
		}
	}
}
