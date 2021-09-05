package questions;/*Writing a Droid program to create a simple droid project trying to charge battery and hovering */

public class Droid
{
  int batteryLevel;
 
  public Droid()
  {
    batteryLevel=100;
  }
  public void activate()
  {
    System.out.println("Droid is active");
    batteryLevel=batteryLevel-5;
    System.out.println("Battery level is: " + batteryLevel + " percent.");
  }
  public void chargeBattery(int hours)
  {
	System.out.println("Droid is charging");
    batteryLevel = batteryLevel+hours;
    if(batteryLevel>=100)
    {
      batteryLevel=100;
      System.out.println("Battery percentage is: "+batteryLevel);
    }
    else
    {
      System.out.println("Battery percentage is: "+batteryLevel);
    }
  }
  public int checkBatterLevel()
  {
    System.out.println("Battery percentage is:  "+batteryLevel);
    return batteryLevel;
  }
  public void hover(int feet)
  {
    if(feet>=2)
    {
      System.out.println("I cant hover over 2 feet");
    }
    else
    {
       System.out.println("Hovering...");
      batteryLevel = batteryLevel-20;
       System.out.println("Battery Level is "+ batteryLevel);
    }
  }
  public static void main (String[] args)
  {
    Droid mydroid = new Droid();
    mydroid.activate();
    mydroid.chargeBattery(5);
    mydroid.hover(1);
  }
}