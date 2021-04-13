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
   public Policy()
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
   public Policy(String polNumber, String polFirstName, String polLastName, String polSmokingStatus, double polAge, double polHeight, double polWeight)
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
      getInsuranceCost method
      @return The insurance cost
   */
   public double getInsuranceCost()
   {          
      //base fee of $600
      //IF over 50 then additional fee of $75
      //IF SMOKER then + $100
      //IF BMI over 35 then Additional Fee = ( BMI – 35 ) * 20      
      final double BASE_FEE = 600;
      final double AGE_FEE = 75;
      final double SMOKING_FEE = 100; 
      final double FEE_PER_BMI = 20;     
      double insuranceCost = 0;
      double bmiFee=0;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      bmiFee = (getBMI() - BMI_THRESHOLD) * FEE_PER_BMI;
      
      if (policyAge > AGE_THRESHOLD) //over 50 years
      {
         insuranceCost += AGE_FEE;
      }
      
      if (policySmokingStatus.equalsIgnoreCase("Smoker"))
      { 
         insuranceCost += SMOKING_FEE;
      }
      
      //Call the getBMI method
      if (getBMI() > BMI_THRESHOLD) // BMI over 35
      {
         insuranceCost += ((getBMI() - BMI_THRESHOLD) * FEE_PER_BMI);
      }
                       
      return insuranceCost + BASE_FEE;     
   }       
}


