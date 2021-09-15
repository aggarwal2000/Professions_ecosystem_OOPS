package oops.LabTechnicians;
import java.util.*;
import oops.Persons.*;

public class PathologyLab extends LabTech{
 public int chemicalKnowledge;
  public PathologyLab(Person p , int expAccuracyScore, int chemicalKnowledge)
  {
    super(p,expAccuracyScore);
    this.chemicalKnowledge = chemicalKnowledge;
  }

  @Override
  public String toString()
  {
    return String.format("%s chemicalKnowledge for LabTech in PathologyLab:%d\n",super.toString(),chemicalKnowledge);
  }
}