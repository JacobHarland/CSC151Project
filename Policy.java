public class Policy
{
   //variables
   private String providerName;
      
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
   public Policy(String provName)
   {
      providerName = provName; 
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
      toString method
      @return A string indicating the objects provider namer
   */
   public String toString()
   {
      String str = "Provider Name: " + providerName;
      
      return str;
   }
}


