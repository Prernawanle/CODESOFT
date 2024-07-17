import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000, deposit, withdraw;
        
        
        while(true){
System.out.println("CHOOSE 1 FOR DEPOSIT :");
System.out.println("CHOOSE 2 FOR WITHDRAW :");
System.out.println("CHOOSE 3 FOR BALACE INQUIRY :");
System.out.println("CHOOSE 4 FOR EXIT");
System.out.println("CHOOSE CORRECT OPTION TO PERFORM :");

int choice = sc.nextInt();

switch(choice){


    case 1:
    System.out.println("ENTER THE AMOUNT YOU WANT TO DEPOSIT: ");
    deposit = sc.nextInt();
    balance = balance + deposit;
    System.out.println("YOUR UPDATED BALANCE IS: "+balance);
    System.out.println();
    break;

    case 2:
    System.out.println("ENTER THE AMOUNT TO WITHDRAW: ");
    withdraw = sc.nextInt();
    if(balance>=withdraw){
        balance = balance - withdraw;
        System.out.println("YOUR UPDATED BALANCE IS: "+balance);
    }else{
        System.out.println("INSUFFICIENT BALANCE...!!");
    }
     System.out.println();
    break;

    case 3:
    System.out.println("YOUR ACCOUNT BALANCE IS: "+balance);
    System.out.println();
    break;

    case 4:
    System.exit(0);

}

    }
}
}
