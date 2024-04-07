import java.util.Scanner;  // Import the Scanner class

public class RoomieInfo
{
    public static void main(String[] args)
    {
    Scanner userName = new Scanner(System.in);
    System.out.println("What is your name?");
    String userName = userName.nextLine();
    
    Scanner userEmail = new Scanner(System.in); 
    System.out.println("What is your email adress?");
    String userEmail = userEmail.nextLine();

    Scanner userAddress = new Scanner(System.in);
    System.out.println("What is your Street Address, City, and State?");
    String userAddress = userAddress.nextLine();  
    
    Scanner userDesription = new Scanner(System.in); 
    System.out.println("Leave a description of yourself")
    String userDesription = userDesription.nextLine(); 

    Scanner userPet = new Scanner(System.in); 
    System.out.println("Pet/No Pet")
    String userPet = userPet.nextLine(); 

    Scanner userSpecialCase= new Scanner(System.in); 
    System.out.println("Anything else you want to especially note? (i.e plays loud music at night)")
    String userSpecialCase = userSpecialCase.nextLine(); 

    Scanner userName = new Scanner(System.in);
    System.out.println("What is your name?");
    String userName = userName.nextLine();


    }

    
}

