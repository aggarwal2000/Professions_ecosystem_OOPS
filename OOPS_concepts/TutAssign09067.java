import java.util.*;
import oops.Persons.Person;
import oops.DocSurgSpec.Doctor;
import oops.DocSurgSpec.Surgeon;
import oops.DocSurgSpec.Specialist;
import oops.Nurses.Nurse;
import oops.LabTechnicians.LabTech;
import oops.HospitalStaff.Staff;
import oops.CreateProfessions.Professions;
import oops.SearchFacilities.SearchPrivileges;

public class TutAssign09067{
 
 static  Random rand = new Random();
 static String currentDate = java.time.LocalDate.now().toString();
 static ArrayList<Person> PersonList = new ArrayList<Person>();
 static HashMap<String,Doctor> mapDoc = new HashMap<>();
 static HashMap<String,Surgeon> mapSrgn = new HashMap<>();
 static HashMap<String,Specialist> mapSpl = new HashMap<>();
 static HashMap<String,Nurse> mapNurse = new HashMap<>();
 static HashMap<String,LabTech> mapLabTech = new HashMap<>();
 static HashMap<String,Staff> mapStaff = new HashMap<>();

 public static void main(String[] args)
 {  
    int n = 100;
    if(args != null && args.length > 0)
      n = Integer.parseInt(args[0]);
    Professions.CreatePersonObjects(n,PersonList);
    Professions.CreateProfessions(PersonList,mapDoc,mapSrgn,mapSpl,mapNurse,mapLabTech,mapStaff);
    //n as command line

    //For Testing
    System.out.println("Pls enter the email to search for a person as a Surgeon or a Specialist:");
    Scanner input = new Scanner(System.in);
    String email = input.nextLine();
    email = email.trim();
    System.out.println("\nPls enter 1 to search whether the person is a Surgeon , and 0 to search for a Specialist:");
    int x = input.nextInt();
    SearchPrivileges.SearchSrgnSpl(x,email,mapSrgn,mapSpl);
    input.nextLine();
    System.out.println("\nPls enter the email to compute the experience of a person as a Doctor,Surgeon and a Specialist:");
    email = input.nextLine();
    SearchPrivileges.ComputeExperience(email,mapDoc,mapSrgn,mapSpl);
    System.out.println("\n\nPls enter the email of the doctor(Doc , Surg ,Spec) to find the Hosoital associated with him/her:");
    email =input.nextLine();
    SearchPrivileges.DocHospital(email,mapDoc,mapSrgn,mapSpl);

    //For Tesing
    System.out.println("\n\nPls enter the firstName,secondName of a person to search for his/her profile:(Note - It would display top 20 profiles in case the number of people with same name exceeds 20 , in the preference order:Doctor,Nurse,Lab LabTechnicians,Staff)");
    String firstName;
    String secondName;
    System.out.print("FirstName:");
    firstName = input.nextLine();
    System.out.print("secondName:");
    secondName = input.nextLine();
    SearchPrivileges.SearchName(firstName.trim(),secondName.trim(),mapDoc,mapSrgn,mapSpl,mapNurse,mapLabTech,mapStaff);
    
 }
 
}

