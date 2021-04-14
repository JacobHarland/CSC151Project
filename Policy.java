public class Policy
{
   //variables
   private static int instanceCount = 0;
   private String providerName;
   private PolicyHolder info;//AGGREGATION
      
   /**
      No arg constructor
   */
   public Policy()
   {     
      providerName = "";
   }
  
   /**
      Constructor that accepts arguements
      @param provName The providers name       
   */
   public Policy(PolicyHolder info, String provName)
   {
      this.info = new PolicyHolder(info);//deep copy
      providerName = provName;
      instanceCount++; 
   }
   
   /**
      The setproviderName method sets the provider name
      @param provName The providers name
   */
   public void setproviderName(String provName)
   {
      providerName = provName;
   }
     
   /**
      getProviderName method
      @return providerName The provider name
   */
   public String getProviderName()
   {
      return providerName;
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
      
      bmiFee = (info.getBMI() - BMI_THRESHOLD) * FEE_PER_BMI;
      
      if (info.policyAge > AGE_THRESHOLD) //over 50 years
      {
         insuranceCost += AGE_FEE;
      }
      
      if (info.policySmokingStatus.equalsIgnoreCase("Smoker"))
      { 
         insuranceCost += SMOKING_FEE;
      }
      
      //Call the getBMI method
      if (info.getBMI() > BMI_THRESHOLD) // BMI over 35
      {
         insuranceCost += ((info.getBMI() - BMI_THRESHOLD) * FEE_PER_BMI);
      }
                       
      return insuranceCost + BASE_FEE;     
   }
  
   /**
      toString method
      @return A string indicating the objects provider namer
   */
   public String toString()
   {
      String str = "Provider Name: " + providerName +
                   "\nPolicy Price: " + getInsuranceCost();
      
      return str;
   }
   
    /**
      getInstanceCount method returns the number of instances of this class that have been created
      @return The value in the instanceCount field
   */
   public int getInstanceCount()
   {
      return instanceCount;
   }
}


