
package oops.DocSurgSpec;
import java.util.*;
import oops.Persons.*;

public class Doctor extends Person{

 public String startDateOfDocTraining;
 public String docID;
 public String hospital;
  
 public Doctor(String firstName,String secondName,String dob,String qualification,String email,String phone,String startDateOfDocTraining,String docID,String hospital)
 {
 	super(firstName,secondName,dob,qualification,email,phone);
 	this.startDateOfDocTraining = startDateOfDocTraining;
 	this.docID = docID;
 	this.hospital = hospital;
 } 

 public Doctor(Person p,String startDateOfDocTraining,String docID,String hospital)
 {
 	super(p.firstName,p.secondName,p.dob,p.qualification,p.email,p.phone);
 	this.startDateOfDocTraining = startDateOfDocTraining;
 	this.docID = docID;
 	this.hospital = hospital;
 }
 
 @Override
 public String toString()
 {
 	return String.format("%s startDateOfDocTraining:%s\ndocID:%s\nhospital:%s\n",super.toString(),startDateOfDocTraining,docID,hospital);
 }

}

