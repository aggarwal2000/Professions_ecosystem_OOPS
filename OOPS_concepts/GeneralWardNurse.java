package oops.Nurses;
import java.util.*;
import oops.Persons.*;

public class GeneralWardNurse extends Nurse{

  public int generalWardNum;

  public GeneralWardNurse(Person p,int empathyScore,int emotionalStabilityScore,int generalWardNum)
  {
    super(p,empathyScore,emotionalStabilityScore);
    this.generalWardNum = generalWardNum;
  }

  @Override
  public String toString()
  {
    return String.format("%s generalWardNum managed by GeneralWardNurse:%d\n",super.toString(),generalWardNum);
  }
}