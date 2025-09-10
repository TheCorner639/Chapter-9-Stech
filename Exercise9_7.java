import java.sql.*;
class Exercise9_7 {
	public static void main(String[] args) {
		class Account {
			int id;
			double balance;
			double annualInterestRate;
			private Date dateCreated;
			Account() {
			}
			Account(int newId, double newBalance) {
				id=newId;
				balance=newBalance;
				
			}
			public double getId() {
				return id;
			}
			public double getBalance() {
				return balance;
			}
			public double getAnnualInterestRate() {
				return annualInterestRate;
			}
			public void setId(int id) {
				this.id = id;
			}
			public void setBalance(double balance) {
				this.balance = balance;
			}
			public void setAnnualInterestRate(double annualInterestRate) {
				this.annualInterestRate = annualInterestRate;
			}
			public Date getDateCreated() {
				return dateCreated;
			}
			public double getMonthlyInterestRate() {
				return (annualInterestRate*100) / 12;
			}
			public double getMonthlyInterest() {
				return balance * getMonthlyInterestRate();
			}
			double withdraw;
			public void withdraw() {
				balance -= withdraw;
			}
			double deposit;
			public void deposit() {
				balance += deposit;
			}
		}
	}
}

