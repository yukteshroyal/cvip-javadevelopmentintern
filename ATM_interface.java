import java.util.Scanner;  
public class ATM_interface
{  
    private String accno;  
    private String name;  
    private long balance;
    Scanner sc = new Scanner(System.in); 
    
    //method to open new account  
    public void openAccount() 
    {  
        System.out.print("Enter Account No: ");  
        accno = sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter some amount: ");  
        balance = sc.nextLong();  
    }  

    //method to display account details  
    public void showAccount() 
    {  
        System.out.println("\n Name of account holder: " + name);  
        System.out.println("\n Account no.: " + accno);  
        System.out.println("\n Balance: " + balance);  
    }  
     public void getBalance()
	{
		System.out.println("Balance: " + balance);
	}
    //method to deposit money  
    public void deposit() 
    {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt;
        System.out.println("After Deposit balance is:  "+balance);
    }  
    
    //method to withdraw money  
    public void withdrawal() 
    {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (balance >= amt) 
        {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } 
        else 
        {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
    }  
   

    public static void main(String arg[]) 
    {  
       //sc object is created for switching btw choices
        Scanner sc = new Scanner(System.in);  
        //create initial accounts  
        System.out.println("Enter User Details ");  
        ATM_interface C = new ATM_interface(); 
        C.openAccount();
        int ch;  
        do
        {  
            System.out.println("\n ***ATM Interface Application***\n ");  
            System.out.println("1. Display all account details \n 2. Deposit the amount \n 3. Withdraw the amount \n 4. Balance check\n 5.Exit ");  
            System.out.println("\n Enter your choice: ");  
            ch = sc.nextInt();  
                switch (ch) 
                {  
                    case 1:  
                        C.showAccount(); 
                        break;
                    case 2:  
                        C.deposit();
                        break;
                     case 3:  
                        C.withdrawal();
                        break;  
                    case 4:  
                        C.getBalance(); 
                        break;
                    case 5:  
                        System.out.println("See you soon...");  
                        break;  
                }  
         }  
            while (ch != 5);  
     }  
}  



