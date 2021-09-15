package oops.Persons;
import java.util.*;

public class Person{

 public String firstName;
 public String secondName;
 public String dob;
 public String qualification;
 public String email;
 public String phone;

 public Person(String firstName,String secondName,String dob,String qualification,String email,String phone)
 {
 	this. firstName = firstName;
 	this.secondName = secondName;
 	this.dob = dob;
 	this.qualification = qualification;
 	this.email = email;
 	this.phone = phone;
 }

 public String toString()
 {
 	return String.format("FName:%s \nSName:%s\nDOB:%s\nQualification:%s\nEmail:%s\nPhone:%s\n",firstName,secondName,dob,qualification,email,phone);
 } 
}
