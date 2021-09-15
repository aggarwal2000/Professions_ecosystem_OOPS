package oops.DocSurgSpec;
import java.util.*;
import oops.Persons.*;
public class Specialist extends Surgeon{

	public String startDateOfSplTraining;
	public String splDomain;

	public Specialist(String firstName,String secondName,String dob,String qualification,String email,String phone,String startDateOfDocTraining,String docID,String hospital,String startDateOfSrgnTraining,String startDateOfSplTraining,String splDomain)
	{
		super(firstName,secondName,dob,qualification,email,phone,startDateOfDocTraining,docID,hospital,startDateOfSrgnTraining);
  	    this.startDateOfSplTraining = startDateOfSplTraining;
  	    this.splDomain = splDomain;

	}

	public Specialist(Person p,String startDateOfDocTraining,String docID,String hospital,String startDateOfSrgnTraining,String startDateOfSplTraining,String splDomain)
	{
	   super(p,startDateOfDocTraining,docID,hospital,startDateOfSrgnTraining);
	   	this.startDateOfSplTraining = startDateOfSplTraining;
  	    this.splDomain = splDomain;
	}

	@Override
    public String toString()
    {
    	return String.format("%s startDateOfSplTraining:%s \nsplDomain:%s\n",super.toString(),startDateOfSplTraining,splDomain);
    }	
}