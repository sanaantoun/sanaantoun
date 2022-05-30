package assignment4comp249;

import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;

import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;

public class CellListUtilization {


    public static void main(String[] args) {
        CellList list1=new CellList();
        CellList list2=new CellList();
        CellList list3;
        Scanner inputStream=null;
        try
        {
            inputStream=new Scanner(new FileInputStream("Cell_Info.txt"));
            txttofile(inputStream, list1);
            inputStream.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Problem opening the file!!");
            System.out.println("Program will terminate.");
            System.exit(0);
        }
        catch (IOException e)
        {
            System.out.println("Problem reading the file!!");
            System.out.println("Program will terminate.");
            System.exit(0);
        }


        list1.showContents();

        //prompt the user to search serial number in the list
        verify(list1);
        System.out.println("Search another serial number? Y or N");
        Scanner input=new Scanner(System.in);
        char c='a';
        c=input.next().toUpperCase().charAt(0);
        while(c=='Y')
        {
            verify(list1);
            System.out.println("Search another serial number? Y or N");
            c=input.next().toUpperCase().charAt(0);
        }

        //test the insertAtIndex method
        CellPhone newp=new CellPhone(746452229, "Blackberry",2003,457.78);

        System.out.println("\n\n Insert at index method: ");
        list1.insertAtIndex(newp, 4);//test if index bigger than size
        
        System.out.println("Insert at index if index 0: ");
        list1.insertAtIndex(newp, 0);//test if index equals to 0, it's test of addToStart method too
        
        System.out.println("Insert at index if index bigger than list size: ");
        list1.insertAtIndex(newp, 67);//test to insert in the middle
       
        System.out.println("The result of above operations.");
        list1.showContents();

        
     
        System.out.println("\n\n Delete from index method: ");
        list1.deleteFromIndex(5);//test if index is negative
        
        System.out.println("Delete from index method if index is not in the bound: ");
        list1.deleteFromIndex(-5);//test delete in the middle
        
        System.out.println("Delete from index method if index is 0: ");
        list1.deleteFromIndex(0);//test when index is 0, it's test of deleteFromStart method too
        list1.showContents();
        
        System.out.println("Delete from index method if index is 0: ");
        list2.deleteFromIndex(0);

        System.out.println("\n\n Replace at index method: ");
        list1.replaceAtIndex(newp, 0);//test if index equals to 0
        list1.showContents();
       
        System.out.println("\n\n Test on an empty list: ");
        list2.replaceAtIndex(newp, 3);//test if the list is empty
        list2.showContents();

        System.out.println("\n\n Test of copy constructor: ");
        System.out.println("***");
        list3=new CellList(list1);
        list3.showContents();

        System.out.println("\n\n Test of equals method: ");
        System.out.println("***");
        if(list3.equals(list1))
            System.out.println("List1 and List3 are equal by equals method.");
        else
            System.out.println("List1 and List3 are not equal by equals method.");
        if(list3.equals(list2))
            System.out.println("List2 and List3 are equal by equals method.");
        else
            System.out.println("List2 and List3 are not equal by equals method.");

    }//end of main method


    public static void txttofile(Scanner inputStream, CellList alist) throws IOException
    {
        while(inputStream.hasNextLine())
        {
            String line=inputStream.nextLine();
           
            Scanner lineScanner=new Scanner(line);
            long serialNumber=lineScanner.nextLong();
            
            String brand=lineScanner.next();
            double price=lineScanner.nextDouble();
            int year=lineScanner.nextInt();
           
            CellPhone newOne=new CellPhone(serialNumber,brand,year,price);
            if(!alist.contains(serialNumber))
            {
                alist.addToStart(newOne);
            }
        }
    }

    public static void verify(CellList alist)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a serial number to search:");
        long number=inp.nextLong();
        alist.contains(number);
    }


}//end of class