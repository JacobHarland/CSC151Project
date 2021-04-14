/**
Jacob Harland
mm/dd/yyyy
Assignment description
*/

import java.util.Scanner;//for reading user input
import java.io.*;
import java.util.ArrayList;

public class Project1_Jacob_Harland
{
   public static void main(String[] args)
   {
      try
      {
         Scanner keyboard = new Scanner(System.in);//gets users input
         
         String polNumber, provName, polFirstName, polLastName, polSmokingStatus, totalAmountOfSmokers=(" "), totalAmountOfNonSmokers=(" "), fileInput = (" "); 
         double polHeight, polWeight, polAge;
     
         int intValueOfSmokers=0, intValueOfNonSmokers=0;
         
         Policy pol;
         PolicyHolder polHol;
         
         File file = new File("PolicyInformation.txt");
         Scanner inputFile = new Scanner(file);
         
         ArrayList<Policy> policyList = new ArrayList<Policy>();
         
         while(inputFile.hasNext())
         {
           polNumber = inputFile.nextLine();
           
           provName = inputFile.nextLine();
           
           polFirstName = inputFile.nextLine();
           
           polLastName = inputFile.nextLine();
           
           polAge = inputFile.nextDouble(); 
           inputFile.nextLine();         
        
           polSmokingStatus = inputFile.nextLine();
                    
           polHeight = inputFile.nextDouble();
           inputFile.nextLine();
 
           polWeight = inputFile.nextDouble();

           
           if(inputFile.hasNext())
               { 
                  inputFile.nextLine();//skip the blank line if we have not reached the end of the file
                  inputFile.nextLine();
               }
           
           Policy pol = new Policy(provName, info);
           PolicyHolder polHold = new PolicyHolder(polNumber, provName, polFirstName, polLastName, polSmokingStatus, polAge, polHeight, polWeight);
           
           policyList.add(pol);
         } 
         
         inputFile.close();
                        
         for (int index = 0; index < policyList.size(); index++)
         {    
            System.out.println ("\n\nPolicy Number: " + policyList.get(index).getPolicyNumber());
            System.out.println ("Provider Name: " + policyList.get(index).getProviderName());
            System.out.println ("Policyholder’s First Name: " + policyList.get(index).getPolicyFirstName());
            System.out.println ("Policyholder’s Last Name: " + policyList.get(index).getPolicyLastName());
            System.out.println ("Policyholder’s Age: " + policyList.get(index).getPolicyAge());
            System.out.println ("Policyholder’s Smoking Status: " +  policyList.get(index).getPolicySmokingStatus());
            System.out.println ("Policyholder’s Height: " + policyList.get(index).getPolicyHeight());
            System.out.println ("Policyholder’s Weight: " + policyList.get(index).getPolicyWeight());
            System.out.printf ("Policyholder’s BMI: %,.2f" , policyList.get(index).getBMI());
            System.out.printf ("\nPolicy Price: $%,.2f" , policyList.get(index).getInsuranceCost());
            
            if (policyList.get(index).getPolicySmokingStatus().equals("smoker"))
                intValueOfSmokers += 1;
               
               
            else if (policyList.get(index).getPolicySmokingStatus().equals("non-smoker"))                            
               intValueOfNonSmokers += 1;        
         }
         
         System.out.println ("\n\nThe number of policies with a smoker is: " + intValueOfSmokers);
         System.out.println ("The number of policies with a non-smoker is: " + intValueOfNonSmokers);       
      } 
      
      catch(IOException ex)//If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
      {
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }      
   }
}