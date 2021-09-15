package oops.Nurses;
import java.util.*;
import oops.Persons.*;

public class Nurse extends Person{

 public  int empathyScore;
  public int emotionalStabilityScore;

  public Nurse(Person p,int empathyScore,int emotionalStabilityScore)
  {
    super(p.firstName,p.secondName,p.dob,p.qualification,p.email,p.phone);
    this.empathyScore = empathyScore;
    this.emotionalStabilityScore = emotionalStabilityScore;
  }

  @Override
  public String toString()
  {
    return String.format("%s empathyScore:%d \n emotionalStabilityScore: %d \n",super.toString(),empathyScore,emotionalStabilityScore);
  }
}