package oops.HospitalStaff;
import java.util.*;
import oops.Persons.*;

public class Accountant extends Staff{

  public int businessAcumen;
  public Accountant(Person p,String shift,int businessAcumen)
  {
    super(p,shift);
    this.businessAcumen = businessAcumen;
  }

  @Override
  public String toString()
  {
    return String.format("%s businessAcumen for Accountant:%d\n",super.toString(),businessAcumen);
  }
}