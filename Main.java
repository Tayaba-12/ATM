package ATMMachine;
java.util; 

class ATM{

float Balance;
int PIN 1234;

public void checkpin(){
System.out.println("Enter your pin: ");
Scanner sc= new Scanner (System.in);
int enteredpin = sc.nextInt();
if(enteredpin==PIN){

menu();
}
else{
  System.out.println("Enter a valid pin");
}
}

public void menu (){
System.out.println("Enter your Choice: ");
System.out.println("1. Check A\C Balance")
System.out.println("2. Withdraw Money");
System.out.println("3. Deposit Money");
System.out.println("4.EXIT");

Scanner sc= new Scanner (System.in);
int opt = sc.nextInt();
 
if (opt == 1){
 checkBalance();
}