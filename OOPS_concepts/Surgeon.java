package oops.DocSurgSpec;
import java.util.*;
import oops.Persons.*;
public class Surgeon extends Doctor{
 
  public String startDateOfSrgnTraining;

  public  Surgeon(String firstName,String secondName,String dob,String qualification,String email,String phone,String startDateOfDocTraining,String docID,String hospital,String startDateOfSrgnTraining)
  {
  	super(firstName,secondName,dob,qualification,email,phone,startDateOfDocTraining,docID,hospital);
  	this.startDateOfSrgnTraining = startDateOfSrgnTraining;

  }

  public Surgeon(Person p,String startDateOfDocTraining,String docID,String hospital,String startDateOfSrgnTraining)
  {
  	super(p,startDateOfDocTraining,docID,hospital);
  	this.startDateOfSrgnTraining = startDateOfSrgnTraining;
  }

  @Override
  public String toString()
  {
     return String.format("%s startDateOfSrgnTraining:%s\n",super.toString(),startDateOfSrgnTraining);
  }

}