
public class CustomExceptionThrower extends Exception {

    /**
     * This method should throw a CustomException. CustomException is a custom exception that we've written ourselves
     * by extending the Exception class in CustomException.java. In a large scale application, writing custom
     * exceptions could provide valuable information for when something goes wrong in the application.
     *
     * I recommend looking at the test case for a good example of try/catch block usage, as well.
     * @throws Exception
     */ 
       
     public void throwCustomException() throws CustomExceptionThrower {
        CustomExceptionThrower foo = new CustomExceptionThrower(); 
        try {
            
          } catch (CustomExceptionThrower e) {
            e.printStackTrace();
          }
    }

}
