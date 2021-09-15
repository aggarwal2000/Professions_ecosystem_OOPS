package oops.PrintFacilities;
import java.util.*;
import oops.Persons.*;
import oops.DocSurgSpec.*;
import oops.Nurses.*;
import oops.LabTechnicians.*;
import oops.HospitalStaff.*;


public class PrintWorks{


	public static void PrintPersonList(ArrayList<Person> PersonList)
  {   System.out.println("\n                          Printing Persons List");
     for(int i=0;i<PersonList.size();i++)
     {
     	System.out.println(i+1 + "\n" + PersonList.get(i).toString());
     }
     System.out.println("----------------------------------------------------------------------------------");
  }

   public static void PrintDocList(HashMap<String,Doctor> mapDoc)
  {  System.out.println("\n                   Printing Doctors List\n");
    int i=1;
     for(Map.Entry<String,Doctor> entry: mapDoc.entrySet())
      {System.out.println( i + "\nKey: " + entry.getKey() + "\n" + "Value:\n" + entry.getValue()); i++;}
     System.out.println("----------------------------------------------------------------------------------");
  }

   public static void PrintSrgnList(HashMap<String,Surgeon> mapSrgn)
  { System.out.println(" \n                       Printing Surgeons List\n");
     int i=1;
     for(Map.Entry<String,Surgeon> entry: mapSrgn.entrySet())
        {System.out.println(i + "\nKey: " + entry.getKey() + "\n" + "Value:\n" + entry.getValue()); i++;}
     System.out.println("----------------------------------------------------------------------------------");
  }

  public static void PrintSplList(HashMap<String,Specialist> mapSpl)
  { System.out.println(" \n                       Printing Specialist List\n");
     int i=1;
  	for(Map.Entry<String,Specialist> entry: mapSpl.entrySet())
     { System.out.println( i + "\nKey: " + entry.getKey() + "\n" + "Value:\n" + entry.getValue()); i++;}
     System.out.println("----------------------------------------------------------------------------------");
  }

  public static void PrintNurses(HashMap<String,Nurse> mapNurse)
  { int i=1;
    System.out.println("\n                           Printing Nurses\n");
    for(Map.Entry<String,Nurse> entry: mapNurse.entrySet())
      {System.out.println(i + "\nKey: " + entry.getKey() + "\n" + "Value:\n" + entry.getValue()); i++;}
    System.out.println("----------------------------------------------------------------------------------");
  }

  public static void PrintLabTech(HashMap<String,LabTech> mapLabTech)
  {int i=1;
    System.out.println("\n                            Printing Lab Technicians\n");
    for(Map.Entry<String,LabTech> entry: mapLabTech.entrySet())
      {System.out.println(i + "\nKey: " + entry.getKey() + "\n" + "Value:\n" + entry.getValue()); i++;}
     System.out.println("----------------------------------------------------------------------------------");
  }

  public static void PrintStaff(HashMap<String,Staff> mapStaff)
  { int i=1;
    System.out.println("\n                              Printing Staff\n");
    for(Map.Entry<String,Staff> entry: mapStaff.entrySet())
     { System.out.println(i + "\nKey: " + entry.getKey() + "\n" + "Value:\n" + entry.getValue()); i++;}
    System.out.println("----------------------------------------------------------------------------------");
  }



}