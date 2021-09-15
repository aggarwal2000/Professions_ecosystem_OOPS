package oops.LabTechnicians;
import java.util.*;
import oops.Persons.*;


public class MicroBioLab extends LabTech {
 
 public int specimenKnowledge;
  public MicroBioLab(Person p, int expAccuracyScore,int specimenKnowledge)
  {
    super(p,expAccuracyScore);
     this.specimenKnowledge = specimenKnowledge;
  }
  @Override
  public String toString()
  {
    return String.format("%s specimenKnowledge for LabTech in MicroBioLab:%d\n",super.toString(),specimenKnowledge);
  }
}
