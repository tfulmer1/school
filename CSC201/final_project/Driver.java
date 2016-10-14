
/*
This program for a final project will allow users to add a
list of websites and each run will test the list of webpages for 
changes to their content
Final Project
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 12 Oct 2016
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Page;
import hasher.*;
import java.io.*;
import java.util.*;

public class Driver {

    private static ArrayList<Page> pages = createList();
    public static Scanner kb = new Scanner(System.in);

    //method to create the array List, tries to load from file or creates empty
    public static ArrayList<Page> createList(){
         try {
            FileInputStream rebuild = new FileInputStream("save.dat");
            ObjectInputStream rebuild2 = new ObjectInputStream(rebuild);
            ArrayList<Page> pages = (ArrayList<Page>) rebuild2.readObject();
            rebuild2.close();
            return pages;
        } catch (IOException | ClassNotFoundException e){
            ArrayList<Page> pages = new ArrayList<Page>();
            return pages;
        }
    }

    public static void saveList(ArrayList<Page> saveList)
        throws MyException
    {
        try {
            FileOutputStream save = new FileOutputStream("save.dat");
            ObjectOutputStream save2 = new ObjectOutputStream(save);
            save2.writeObject(saveList);
            save2.close();
        } catch (IOException e) {
            throw new MyException("Failed to save file, this is a FATAL error");
        }
    }

    public static void addPage(String url){
        pages.add(new Page(url));
    }
    

    public static void main(String[] args) 
        throws MyException
    {
        //Setting up the webdriver by establishing OS type and driver paths
        String OS = System.getProperty("os.name");
        System.out.println(OS);
        String path = ("Unknown");
        if(OS.startsWith("Windows")){
            path = (System.getProperty("user.dir") + "/chromedriver/chromedriver.exe");
        }
        if(OS.startsWith("Linux")){
            path = (System.getProperty("user.dir") + "/chromedriver/chromedriver");
        }
        if(OS.startsWith("mac")){
            path = (System.getProperty("user.dir") + "/chromedriver/chromedriverMac");
        }

        if(path == "Unknown"){
            System.out.println("Unable to determine your OS, exiting gracefully");
            System.exit(1);
        }

        //Show the user the current list:
        System.out.println("List of websites to be checked:");
        for (Page page : pages){
            System.out.println(page.getURL());
        }

        //Let the user add pages if desired
        System.out.println("Do you want to add additional pages to scrape? Y/N");
        String yn = kb.nextLine();

        while (yn.equalsIgnoreCase("Y")){
            System.out.println("Enter the URL to scrape: ");
            String newURL = kb.nextLine();
            addPage(newURL);
            System.out.println("Do you wish to enter additional pages? Y/N");
            yn = kb.nextLine();
        }

        //Enabling webdriver
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();

        //Gather pages from the list and alert user of changes
        for (Page page : pages){
            driver.get(page.getURL());
            String pageSource = driver.getPageSource();
            String hash1 = Hasher.SHA256CheckSum(pageSource);
            if (hash1.equals(page.getCurrentHash())){
                System.out.println(page.getURL() + " has not changed since last visit");
            } else {
                System.out.println("CHANGE DETECTED! " + page.getURL() + " has changed since last visit");
                page.setCurrentHash(hash1);
            }
        }

        saveList(pages);

        driver.quit();

    }
}