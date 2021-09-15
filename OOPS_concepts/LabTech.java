package oops.LabTechnicians;
import java.util.*;
import oops.Persons.*;

public class LabTech extends Person{

  public int expAccuracyScore;
  
  public LabTech(Person p,int expAccuracyScore)
  {
    super(p.firstName,p.secondName,p.dob,p.qualification,p.email,p.phone);
    this.expAccuracyScore = expAccuracyScore;
  }
  @Override
  public String toString()
  {
    return String.format("%s expAccuracyScore:%d\n",super.toString(),expAccuracyScore);
  }

}