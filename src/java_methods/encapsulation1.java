package java_methods;

//public class encapsulation1 {

//	public static void main(String[] args) {
//		class Rectangle 
//		{ 
//		   private int length; 
//		   private int breadth; 
//
//		 Rectangle(int length, int breadth)
//		 { 
//		  this.length = length; 
//		  this.breadth = breadth; 
//		 } 
//		public int getLength()
//		{ 
//		 return length; 
//		} 
//		public int getBreadth()
//		{ 
//			 return breadth; 
//			} 
//			public void setLength(int length)
//			{ 
//			 this.length = length; 
//			} 
//			public void setBreadth(int breadth)
//			{ 
//			 this.breadth = breadth; 
//			 } 
//			}
//	}
//
//}
//	class Venkat {
//		   private String accountNumber;
//		    private double balance;
//
//		    public Venkat(String accountNumber, double balance) {
//		        this.accountNumber = accountNumber;
//		        this.balance = balance;
//		    }
//
//		    public String getAccountNumber() {
//		        return accountNumber;
//		    }
//
//		    public double getBalance() {
//		        return balance;
//		    }
//
//		    public void deposit(double amount) {
//		        balance += amount;
//		    }

//		    public void withdraw(double amount) {
//		        balance -= amount;
//		    }
//		  }
//
//		  class SavingsAccount extends Venkat {
//		      private double interestRate;
//
//		      double balance=0;
//		      public SavingsAccount(String accountNumber, double balance, double interestRate) {
//		          super(accountNumber, balance);
//		          this.interestRate = interestRate;
//		      }
//
//		      public double getInterestRate() {
//		          return interestRate;
//		      }
//
//		      public void deposit(double amount) {
//		          balance += amount;
//		          balance += (amount * interestRate);
//		      }
//
//		      public void withdraw(double amount) {
//		          balance -= amount;
//		      }
//		  }
//
//		  public class BankAccount
//		  {
//			  public static void main(String[] args) {
//			        SavingsAccount account1 = new SavingsAccount("123456", 5000, 0.05);
//			        System.out.println("Account number: " + account1.getAccountNumber());
//			        System.out.println("Balance: " + account1.getBalance());
//			        System.out.println("Interest rate: " + account1.getInterestRate());
//
//			        account1.deposit(1000);
////			        System.out.println("Updated balance: " + account1.getBalance());
//	//
////			        account1.withdraw(500.0);
////			       
//			  }
//		  }
