package oops.Nurses;
import java.util.*;
import oops.Persons.*;

public class IcuNurse extends Nurse{

  public int icuFloor;

  public IcuNurse(Person p,int empathyScore,int emotionalStabilityScore,int icuFloor)
  {
    super(p,empathyScore,emotionalStabilityScore);
    this.icuFloor = icuFloor;
  }

 @Override
  public String toString()
  {
    return String.format("%s icuFloor managed by icuNurse:%d \n",super.toString(),icuFloor);
  }
}