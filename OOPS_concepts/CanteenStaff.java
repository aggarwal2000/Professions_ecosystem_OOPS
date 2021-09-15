package oops.HospitalStaff;
import java.util.*;
import oops.Persons.*;

public class CanteenStaff extends Staff{

  public int cookScore;
  public CanteenStaff(Person p,String shift,int cookScore)
  {
    super(p,shift);
    this.cookScore = cookScore;
  }
  @Override
  public String toString()
  {
    return String.format("%s cookScore for CanteenStaff:%d\n",super.toString(),cookScore);
  }
}