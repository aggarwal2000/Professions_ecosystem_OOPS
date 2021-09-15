package oops.SearchFacilities;
import java.util.*;
import oops.Persons.*;
import oops.DocSurgSpec.*;
import oops.Nurses.*;
import oops.LabTechnicians.*;
import oops.HospitalStaff.*;
import oops.CreateProfessions.*;
import oops.PrintFacilities.*;

public class SearchPrivileges{

	/////Write all Search Methods here.

    public static void SearchSrgnSpl(int x,String email,HashMap<String,Surgeon> mapSrgn,HashMap<String,Specialist> mapSpl)
    { 
         if(x == 1) //Search surgeon
         {
            Surgeon srgn = mapSrgn.get(email.trim());
            if(srgn != null)
               System.out.println(srgn);
            else 
              { 
              	srgn = mapSpl.get(email.trim());
              	 if(srgn != null)
              	     System.out.println("The person is a surgeon as well as a specialist:\n" + srgn);
              	 else
              	     System.out.println("\nNo surgeon with such email exists\n");
              }	 
         }
         else  //Search specialist
         {
              Specialist spl = mapSpl.get(email.trim());
              if(spl != null)
              	System.out.println(spl);
              else
              	System.out.println("\nNo  specialist with such email exists\n");
         }
    }

    public static void SearchSrgnSpl(int x,HashMap<String,Surgeon> mapSrgn,HashMap<String,Specialist> mapSpl)
    {
    	if(x == 1)
    		{System.out.println("\nPrinting list of surgeons who are just surgeons as well as those who are specialists too\n");
    		 PrintWorks.PrintSrgnList(mapSrgn);
    		 PrintWorks.PrintSplList(mapSpl);}
    	else
    		PrintWorks.PrintSplList(mapSpl);
    }

    public static void SearchSrgnSpl(HashMap<String,Specialist> mapSpl)
    {
    	PrintWorks.PrintSplList(mapSpl);
    }
    
    public static void ComputeExperience(String email,HashMap<String,Doctor> mapDoc,HashMap<String,Surgeon> mapSrgn,HashMap<String,Specialist> mapSpl)
    {
       Doctor doc = mapDoc.get(email.trim());
       if(doc != null)
       {
       	 ExperienceAsDoc(doc);
       	 System.out.println("\nNot a surgeon  or a specialist\n");
       	 return;
       }
       Surgeon srgn = mapSrgn.get(email.trim());
       if(srgn != null)
       {
       	 ExperienceAsDoc((Doctor)srgn); // as --> polymorphism allowed on variables->there access? ???, or need to upcast it??
       	 ExperienceAsSrgn(srgn);
       	 System.out.println("\nNot a specialist\n");
       	 return;
       }
       Specialist spl = mapSpl.get(email.trim());
       if(spl != null)
       {
       	 ExperienceAsDoc((Doctor)spl); // as ---> polymorphism allowed? 
       	 ExperienceAsSrgn((Surgeon)spl); // as ---> polymorphism allowed??
       	 ExperienceAsSpl(spl);
       	 return;
       }
       System.out.println("\nNot a doctor, surgeon or a specialist\n");
    }
  
    public static void ExperienceAsSpl(Specialist spl)
    {
    	String startDate = spl.startDateOfSplTraining;
    	int months = Professions.DateDiffrence(startDate);
    	int exp = months - 12;
    	System.out.printf("\nExperience as a specialist:%d months\n",exp);
    }

    public static void ExperienceAsSrgn(Surgeon srgn)
    {
    	String startDate = srgn.startDateOfSrgnTraining;
    	int months = Professions.DateDiffrence(startDate);
    	int exp = months - 24;
    	System.out.printf("\nExperience as a surgeon:%d months\n",exp);
    }

    public static void ExperienceAsDoc(Doctor doc)
    {
       String startDate = doc.startDateOfDocTraining;
       int months = Professions.DateDiffrence(startDate);
       int exp = months - 14;
       System.out.printf("\nExperience as a doctor:%d months\n",exp);
    }

    public static void DocHospital(String email,HashMap<String,Doctor> mapDoc,HashMap<String,Surgeon> mapSrgn,HashMap<String,Specialist> mapSpl)
    {
    	Doctor doc = mapDoc.get(email.trim());
    	if(doc == null)
    	{
            doc = mapSrgn.get(email.trim());
            if(doc == null)
                doc = mapSpl.get(email.trim());     
    	}

    	if(doc != null)
    	   System.out.printf("\nHospital associated with the doc is:%s\n",doc.hospital);
    	else
    		System.out.println("\nNo such Doctor exists!!!\n");
    }

    public static void SearchName(String fName,String sName,HashMap<String,Doctor> mapDoc,HashMap<String,Surgeon> mapSrgn,HashMap<String,Specialist> mapSpl,HashMap<String,Nurse> mapNurse,HashMap<String,LabTech> mapLabTech,HashMap<String,Staff> mapStaff)
    {
       int i=1;
       int flag = 0;
        for(Map.Entry<String,Doctor> entry: mapDoc.entrySet())
        {  
           if(i>20)
             return;
        	Doctor doc = entry.getValue();
        	if(doc.firstName.equals(fName) == true  && doc.secondName.equals(sName) ==true)
        		{System.out.println(i + "\n" + doc);i++;flag = 1; }
        }

        for(Map.Entry<String,Surgeon> entry: mapSrgn.entrySet())
        { 
          if(i>20)
           break;
        	Surgeon srgn = entry.getValue();
        	if(srgn.firstName.equals(fName) == true  && srgn.secondName.equals(sName) == true)
        		{System.out.println(i + "\n" + srgn); i++; flag = 1;}
        }

        for(Map.Entry<String,Specialist> entry: mapSpl.entrySet())
        { if(i>20)
           break;
        	Specialist spl = entry.getValue();
        	if(spl.firstName.equals(fName) == true  && spl.secondName.equals(sName) == true)
        		{System.out.println(i + "\n" +  spl);   i++; flag = 1;}
        }

        for(Map.Entry<String,Nurse> entry: mapNurse.entrySet())
        {  if(i>20)
             break;
        	Nurse nurse = entry.getValue();
        	if(nurse.firstName.equals(fName) == true  && nurse.secondName.equals(sName) == true)
        		{System.out.println(i + "\n" + nurse);   i++; flag=1;}
        }

        for(Map.Entry<String,LabTech> entry: mapLabTech.entrySet())
        { if(i>20)
           break;
        	LabTech labTech = entry.getValue();
        	if(labTech.firstName.equals(fName) == true  && labTech.secondName.equals(sName) == true)
        		{System.out.println(i + "\n" + labTech); i++; flag=1;}
        }

        for(Map.Entry<String,Staff> entry: mapStaff.entrySet())
        { if(i>20)
           break;
        	Staff staff = entry.getValue();
        	if(staff.firstName.equals(fName) == true  && staff.secondName.equals(sName) == true)
        		{System.out.println(i + "\n" + staff); i++; flag=1;}
        }

        if(flag == 0)
        	System.out.println("\nNo such person exists in the Hospital EcoSystem\n");

    }

}