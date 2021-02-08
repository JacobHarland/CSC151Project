/**
Jacob Harland
mm/dd/yyyy
Assignment description
*/

import java.util.Scanner;//for reading user input

public class Project1_Jacob_Harland
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);//gets users input
      
      String polNumber, provName, polFirstName, polLastName, polSmokingStatus;
      int polAge;
      double polHeight, polWeight;
      
      System.out.print ("Please enter the Policy Number: ");
      polNumber = keyboard.nextLine();
      
      System.out.print ("Please enter the Provider Name: ");
      provName = keyboard.nextLine();
      
      System.out.print ("Please enter the Policyholder's First Name: ");
      polFirstName = keyboard.nextLine();
      
      System.out.print ("Please enter the Policyholder's Last Name: ");
      polLastName = keyboard.nextLine();
      
      System.out.print ("Please enter the Policyholder's Age: ");
      polAge = keyboard.nextInt();
      
      System.out.print ("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      keyboard.nextLine();//clears
      polSmokingStatus = keyboard.nextLine();
      
      System.out.print ("Please enter the Policyholder's Height (in inches): ");
      polHeight = keyboard.nextDouble();
      
      System.out.print ("Please enter the Policyholder's Weight (in pounds): ");
      polWeight = keyboard.nextDouble();
      
      Policy pol = new Policy(polNumber, provName, polFirstName, polLastName, polSmokingStatus, polAge, polHeight, polWeight);
       
      System.out.println ("\nPolicy Number: " + pol.getPolicyNumber());
      System.out.println ("Provider Name: " + pol.getProviderName());
      System.out.println ("Policyholder’s First Name: " + pol.getPolicyFirstName());
      System.out.println ("Policyholder’s Last Name: " + pol.getPolicyLastName());
      System.out.println ("Policyholder’s Age: " + pol.getPolicyAge());
      System.out.println ("Policyholder’s Smoking Status: " +  pol.getPolicySmokingStatus());
      System.out.println ("Policyholder’s Height: " + pol.getPolicyHeight());
      System.out.println ("Policyholder’s Weight: " + pol.getPolicyWeight());
      System.out.printf ("Policyholder’s BMI: %,.2f" , pol.getBMI());
      System.out.printf ("\nPolicy Price: $%,.2f" , pol.getInsuranceCost());       
   }
}