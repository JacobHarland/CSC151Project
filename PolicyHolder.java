/**
   This class stores data about a policy holder
*/

public class PolicyHolder
{
   //variables
   private String policyNumber, policyFirstName, policyLastName, policySmokingStatus;
   private int bmi;
   private double policyHeight, policyWeight, policyAge;
   
   
   /**
      No arg constructor
   */
   public PolicyHolder()
   {
      policyNumber = "";     
      policyFirstName = "";
      policyLastName = "";
      policySmokingStatus = "";
      policyAge = 0;
      policyHeight = 0;
      policyWeight = 0; 
   }
  
   /**
      Constructor that accepts arguements
      @param polNumber The policy number
      @param polFirstName The policy members first name
      @param polLastName The policy members last name
      @param polSmokingStatus The policy members smoking status
      @param polAge The policy members age
      @param polHeight The policy members height
      @param polWeight The policy members weight       
   */
   public PolicyHolder(String polNumber, String polFirstName, String polLastName, String polSmokingStatus, double polAge, double polHeight, double polWeight)
   {
      policyNumber = polNumber;     
      policyFirstName = polFirstName;
      policyLastName = polLastName;
      policySmokingStatus = polSmokingStatus;
      policyAge = polAge;
      policyHeight = polHeight;
      policyWeight = polWeight; 
   }
   
   /**
      The setpolicyNumber method sets the policy number
      @param polNumber The policy number
   */
   public void setpolicyNumber(String polNumber)
   {
      policyNumber = polNumber;        
   }
        
   /**
      The setpolicyFirstName method sets the policy members first name
      @param polFirstName The policy members first name
   */
   public void setpolicyFirstName(String polFirstName)
   {
      policyFirstName = polFirstName;
   }

   /**
      The setpolicyLastName method sets the policy members last name
      @param polLastName The policy members last name
   */
   public void setpolicyLastName(String polLastName)
   {
      policyLastName = polLastName;
   }

   /**
      The setpolicySmokingStatus method sets the policy members smoking status
      @param polSmokingStatus The policy members smoking status
   */
   public void setpolicySmokingStatus(String polSmokingStatus)
   {
      policySmokingStatus = polSmokingStatus;
   }

   /**
      The setsetpolicyAgeHERE method sets the policy members age
      @param polAge The policy members age
   */
   public void setpolicyAge(double polAge)
   {
      policyAge = polAge;
   }

   /**
      The setpolicyHeight method sets the policy members height
      @param polHeight The policy members height
   */
   public void setpolicyHeight(double polHeight)
   {
      policyHeight = polHeight;
   }

   /**
      The setpolicyWeight method sets the policy members height
      @param polWeight The policy members weight
   */
   public void setpolicyWeight(double polWeight)
   {
      policyWeight = polWeight;
   }
   
   /**
      getPolicyNumber method
      @return policyNumber The policy number
   */
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
      getPolicyFirstName method
      @return policyFirstName The policy members first name
   */
   public String getPolicyFirstName()
   {
      return policyFirstName;
   }
   
   /**
      getPolicyLastName method
      @return policyLastName The policy members last name
   */
   public String getPolicyLastName()
   {
      return policyLastName;
   }
   
   /**
      getPolicySmokingStatus method
      @return policySmokingStatus The policy members smoking status
   */
   public String getPolicySmokingStatus()
   {
      return policySmokingStatus;
   }
   
   /**
      getPolicyAge method
      @return policyAge The policy members age
   */
   public double getPolicyAge()
   {
      return policyAge;
   }
   
   /**
      getPolicyHeight method
      @return policyHeight The policy members heigh
   */
   public double getPolicyHeight()
   {
      return policyHeight;
   }
   
   /**
      getPolicyWeight method
      @return policyWeight The policy members weight
   */
   public double getPolicyWeight()
   {  
      return policyWeight;
   }
   
   /**
      getBMI method
      @return The BMI of the member
   */
   public double getBMI()
   {
      final double CONVFACTOR = 703.0;
      
      return (policyWeight * CONVFACTOR) / (policyHeight * policyHeight);      
   }

   /**
      toString method
      @return A string indicating the objects provider namer
   */
   public String toString()
   {
      String str = "Policy Number: " + policyNumber +
                   "\nPolicyholder's First Name: " + policyFirstName +
                   "\nPolicyholder's Last Name: " + policyLastName +
                   "\nPolicyholder's Age: " + policyAge +
                   "\nPolicyholder's Smoking Status (Y/N): " + policySmokingStatus +
                   "\nPolicyholder's Height: " + policyHeight +
                   "\nPolicyholder's Weight: " + policyWeight +
                   "\nPolicyholder's BMI: " + getBMI();
                                            
      return str;
   }
}

