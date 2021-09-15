package oops.HospitalStaff;
import java.util.*;
import oops.Persons.*;

public class Pharmacist extends Staff{
 public int naplexScore;
  public Pharmacist(Person p,String shift,int naplexScore)
  {
    super(p,shift);
    this.naplexScore = naplexScore;
  }
  @Override
  public String toString()
  {
    return String.format("%s naplexScore for Pharmacist:%d",super.toString(),naplexScore);
  }
}