package oops.HospitalStaff;
import java.util.*;
import oops.Persons.*;

public class Staff extends Person{

  public String shift;
  public Staff(Person p,String shift)
  {
    super(p.firstName,p.secondName,p.dob,p.qualification,p.email,p.phone);
    this.shift = shift;
  }

  @Override
  public String toString()
  {
    return String.format("%s Shift:%s\n",super.toString(),shift);
  }
}