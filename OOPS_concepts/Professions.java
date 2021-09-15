package oops.CreateProfessions;
import java.util.*;
import oops.Persons.*;
import oops.DocSurgSpec.*;
import oops.Nurses.*;
import oops.LabTechnicians.*;
import oops.HospitalStaff.*;
import oops.PrintFacilities.*;

public class Professions{
    static String currentDate = java.time.LocalDate.now().toString();
    static  Random rand = new Random();
    
    public static void CreatePersonObjects(int n,ArrayList<Person> PersonList)
  {
    String[] FirstName = {"Shreya","Priyam","Manju","Karan","Archit","Pardeep","Kshitij","Taksh","Navadha"};
    String[] SecondName = {"Aggarwal","Bansal","Mittal","Singla","Thakur","Singh","Arora","Gupta","Kansal"};
    String[] Qualification = {"Bsc","MBBS"};
    String[] Mail = {"gmail.com" , "yahoo.com"};

    for(int i=0;i<n;i++)
    {
    	String firstName = FirstName[rand.nextInt(FirstName.length)];
    	String secondName = SecondName[rand.nextInt(SecondName.length)];
    	String qualification = Qualification[rand.nextInt(Qualification.length)];
    	String mail = Mail[rand.nextInt(Mail.length)];
    	String email = String.format("%s.%s%d@%s",firstName,secondName,rand.nextInt(99) + 1,mail);
    	String phone = String.format("10%d%d",rand.nextInt(100000),rand.nextInt(100000));
    	int year = rand.nextInt(20) + 1965;
    	int month = rand.nextInt(12) + 1;
    	int date = rand.nextInt(28) + 1; 
    	String dob = String.format("%4d/%2d/%2d",year,month,date);
    	Person p = new Person(firstName,secondName,dob,qualification,email,phone);
    	PersonList.add(p);

    }
      PrintWorks.PrintPersonList(PersonList);

  }

	public static void CreateProfessions(ArrayList<Person> PersonList,HashMap<String,Doctor> mapDoc,HashMap<String,Surgeon> mapSrgn,HashMap<String,Specialist> mapSpl,HashMap<String,Nurse> mapNurse,HashMap<String,LabTech> mapLabTech,HashMap<String,Staff> mapStaff) {
  	   
  for(int i = 0;i< PersonList.size();i++)
  { 
  		Person p = PersonList.get(i);
      int val = CreateDocSrgnSpl(p,mapDoc,mapSrgn,mapSpl);
      if(val == 1)
        continue;
      int choice = 2 +  rand.nextInt(3);
      
      switch(choice)
      {
        case 2:
          CreateNurse(p,mapNurse);
          break;
        
        case 3:
          CreateLabTech(p,mapLabTech);
          break;

        case 4:
          CreateStaff(p,mapStaff);
          break; 
      }

   }

    PrintWorks.PrintDocList(mapDoc);
    PrintWorks.PrintSrgnList(mapSrgn);
    PrintWorks.PrintSplList(mapSpl);
    PrintWorks.PrintNurses(mapNurse);
    PrintWorks.PrintLabTech(mapLabTech);
    PrintWorks.PrintStaff(mapStaff);
    
}

public static void CreateStaff(Person p,HashMap<String,Staff> mapStaff)
{
  String Shifts[] = {"Morning","Evening"};
  int staffType = 1 + rand.nextInt(3);
  String shift = Shifts[rand.nextInt(Shifts.length)];

  if(staffType == 1)
  {
     int businessAcumen = 100 + rand.nextInt(50);
     Accountant acc = new Accountant(p,shift,businessAcumen);
     mapStaff.put(p.email.trim(),acc);
     //Add to HashMap
  }
  else if(staffType == 2)
  {
     int cookScore = 100 + rand.nextInt(50);
     CanteenStaff cook = new CanteenStaff(p,shift,cookScore);
     mapStaff.put(p.email.trim(),cook);
     //Add to HashMap
  }
  else if(staffType == 3)
  {
    int naplexScore = 100 + rand.nextInt(50);
    Pharmacist phr = new Pharmacist(p,shift,naplexScore);
    mapStaff.put(p.email.trim(),phr);
    //Add to HashMap
  }
  else;

}

public static void CreateLabTech(Person p,HashMap<String,LabTech> mapLabTech)
{
  int expAccuracyScore = 7 + rand.nextInt(4);
  int labTechType = 1 + rand.nextInt(2);

  if(labTechType == 1)
  {
    int chemicalKnowledge = 50 + rand.nextInt(50);
    PathologyLab pathTech = new PathologyLab(p,expAccuracyScore,chemicalKnowledge);
    mapLabTech.put(p.email.trim(),pathTech);
    //Add to Map
  }
  else if(labTechType == 2)
  {
    int specimenKnowledge = 50 + rand.nextInt(50);
    MicroBioLab microTech = new MicroBioLab(p,expAccuracyScore,specimenKnowledge);
    mapLabTech.put(p.email.trim(),microTech);
    //Add to Map
  }
  else;
} 

public static void CreateNurse(Person p,HashMap<String,Nurse> mapNurse)
{
  int empathyScore = 7 + rand.nextInt(4);
  int emotionalStabilityScore = 7 + rand.nextInt(4);
  int nurseType = 1 + rand.nextInt(2);

  if(nurseType == 1)
  {
    int icuFloor = 3 + rand.nextInt(4);
    IcuNurse icuNurse = new IcuNurse(p,empathyScore,emotionalStabilityScore,icuFloor);
    mapNurse.put(p.email.trim(),icuNurse);
    //Add to map
  }
  else if(nurseType == 2)
  {
    int generalWardNum = 1 + rand.nextInt(20);
    GeneralWardNurse genNurse = new GeneralWardNurse(p,empathyScore,emotionalStabilityScore,generalWardNum);
    mapNurse.put(p.email.trim(),genNurse);
    //Add to map
  }
  else;
}

public static int CreateDocSrgnSpl(Person p,HashMap<String,Doctor> mapDoc,HashMap<String,Surgeon> mapSrgn,HashMap<String,Specialist> mapSpl)
{
    String[] Hospital = {"AIIMS" , "Ivy" , "Fortis" , "Alchemist" , "Apollo" , "Escorts"};
    String[] Domains = {"Dermatology" , "Genetics", "Neurology" , "Pathology" , "Psychiatry" , "Radiology", "Orthopaedics", "Cosmetics"};
    int year;
    int month;
    int date;
    String startDateOfDocTraining = null;
    String docID = null;
    String hospital = null;
    String startDateOfSrgnTraining = null;
    String startDateOfSplTraining = null;
    String splDomain = null;
    int docFlag = 0;
    int srgnFlag = 0;
    int splFlag = 0;
    
      
      //doc
        year = rand.nextInt(9) + 2010;
        month = rand.nextInt(12) + 1;
        date = rand.nextInt(28) + 1;
        startDateOfDocTraining = String.format("%4d/ %2d /%2d",year,month,date);
        boolean bool1 = CheckDoc(startDateOfDocTraining);
        
         if(bool1 == true)
        {  
           docFlag = 1;
           docID = String.format("D%3d%c",rand.nextInt(1000),rand.nextInt(26) + 65);
           hospital = Hospital[rand.nextInt(Hospital.length)];
        }

        //surgeon
        if(docFlag == 1)
        {
          year = year + 1+  rand.nextInt(2);
           month = rand.nextInt(12) + 1;
           date = rand.nextInt(28) + 1;
           startDateOfSrgnTraining = String.format("%4d/ %2d /%2d",year,month,date);
           boolean bool2 = CheckSrgn(startDateOfSrgnTraining);
           if(bool2 == true)
           {  
              srgnFlag = 1;               
           }

        }
   
        //specialist
        if(srgnFlag == 1)
        {
          year = year +2 +  rand.nextInt(2);
           month = rand.nextInt(12) + 1;
           date = rand.nextInt(28) + 1;
           startDateOfSplTraining = String.format("%4d/ %2d /%2d",year,month,date);
           boolean bool3 = CheckSpl(startDateOfSplTraining);
           if(bool3 == true)
           {  
              splFlag = 1;
              splDomain = Domains[rand.nextInt(Domains.length)];
           }
        }
        
       if(docFlag == 0)
          return 0;
       if(docFlag == 1)
       {
         if(srgnFlag == 0)
             mapDoc.put(p.email.trim(),new Doctor(p,startDateOfDocTraining,docID,hospital)); 
         else
         {
          if(splFlag == 1)
             mapSpl.put(p.email.trim(),new Specialist(p,startDateOfDocTraining,docID,hospital,startDateOfSrgnTraining,startDateOfSplTraining,splDomain));// SplList.add(new Specialist(p,startDateOfDocTraining,docID,hospital,startDateOfSrgnTraining,startDateOfSplTraining,splDomain));
          else
             mapSrgn.put(p.email.trim(),new Surgeon(p,startDateOfDocTraining,docID,hospital,startDateOfSrgnTraining));// SrgnList.add(new Surgeon(p,startDateOfDocTraining,docID,hospital,startDateOfSrgnTraining));
         }
       }
    
      return 1;
    
}

  	public static boolean CheckDoc(String startDateOfDocTraining)
  	{  
        int diff = DateDiffrence(startDateOfDocTraining);
       if(diff >= 14)
       	return true;
       return false;
  	} 


  	 public static boolean CheckSrgn(String startDateOfSrgnTraining)
    {  
      int diff = DateDiffrence(startDateOfSrgnTraining);
      if(diff >= 24)
      	  return true;
      return false;
    }

    public static boolean CheckSpl(String startDateOfSplTraining)
    {  int diff = DateDiffrence(startDateOfSplTraining);
       if(diff >= 12)
       	return true;
       return false;
    }

    public static int DateDiffrence(String startDate) //returns diffrenece in months
    {  
    	//String str = java.time.LocalDate.now().toString();
        String[] currArr = currentDate.split("\\-");
        int currYear = Integer.parseInt(currArr[0]);
        int currMonth = Integer.parseInt(currArr[1]);

        String[] startArr = startDate.split("\\/");
        int startYear = Integer.parseInt(startArr[0].trim());
        int startMonth = Integer.parseInt(startArr[1].trim());

        int yearDiffInMonths = (currYear - startYear)*12;
        int monthDiff = currMonth - startMonth;
        int difference = yearDiffInMonths + monthDiff;
        
    	return difference;
    }

}