/*
 * Your job is simple. Create method with your lastname. Make it System.out.println a joke.
 * Call the method in the main. 
 * Send it back to my repository.
 */
package gitquiz2;

/**
 *
 * @author lee_c
 */
/**
 *
 * @author lee_c
 */

public class GitQuiz2 {

    // declares an Array of integers. 
      int[] arr; 
          
      // allocating memory for 5 integers. 
      arr = new int[5]; 
          
      // initialize the first elements of the array 
      arr[0] = 10; 
          
      // initialize the second elements of the array 
      arr[1] = 20; 
          
      //so on... 
      arr[2] = 30; 
      arr[3] = 40; 
      arr[4] = 50; 
          
      // accessing the elements of the specified array 
      for (int i = 0; i < arr.length; i++) 
         System.out.println("Element at index " + i +  
                                      " : "+ arr[i]);
    public static void Chow(){
        System.out.println("['hip','hip']");
    }
    public static void Mach()
    {
        System.out.println("Id like to make the world a better place");       
        System.out.println("but they wont give me the source code");  
    }
    public static void Cottrell(){
        System.out.println("A DBA walks into a bar, approaches two tables and says ");
        System.out.println("'Hey, mind if I join you?'");
        System.out.println("\nThere are 10 types of people in the world: those who understand binary, and those who don't.");

    }

        public static void Dombroski(){
        System.out.println("What stopped winter from coming?");
        System.out.println("Winterfell and it can't get up.");
        System.out.println();
        System.out.println("What three rings do you need to marry one of Walder Frey's daughters?");
        System.out.println("Wedding Ring, suffe-ring, and a murder-ring");
}
    public static void Garber(){
        System.out.println("What did the spider do on the computer?\n");
        System.out.println("Made a website!\n");
        System.out.println("What is a computer virus?\n");
        System.out.println("A terminal illness");

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Chow();

        Cottrell();

        Garber();

        Mach();
        Dombroski();


    }
    
}
