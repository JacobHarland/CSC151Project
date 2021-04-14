public class Policy
{
   //variables
   private static int instanceCount = 0;
   private String providerName;
      
   /**
      No arg constructor
   */
   public Policy()
   {     
      providerName = "";
      instanceCount++; 
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
   
    /**
      getInstanceCount method returns the number of instances of this class that have been created
      @return The value in the instanceCount field
   */
   public int getInstanceCount()
   {
      return instanceCount;
   }
}


