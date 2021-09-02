package delimeter_check;

/************************************************************************************************
 * This is a test file
 ************************************************************************************************/

public class TestData {
   public static void main(String[]args){
       System.out.println("Hello, I am a java file");
       TestData testData = new TestData();
       testData.doMath();
    }

   public void doMath() {
       System.out.println("I can do 2+2");
       int add = 2+2;
       System.out.println("2+2 = " + (add+1));
    }
}

