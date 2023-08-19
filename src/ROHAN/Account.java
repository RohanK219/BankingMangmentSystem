package ROHAN;

public class Account {
private int Number;
private double Balance;
private String Name;
private String Email;
private String PhoneNumber;

public Account(int Number,double Balance,String Name,String Email,String PhoneNumber) {
	this.Number = Number;
	this.Balance = Balance;
	this.Name = Name;
	this.Email = Email;
	this.PhoneNumber = PhoneNumber;
}

public void DepositeMoney(double DepositeMoney) {
	this.Balance+=DepositeMoney;
	System.out.println("Deposit is Scussful, new Balance is"+this.Balance);
}
public void WithDrowMoney(double WithDrowlMoney ) {
	if(this.Balance - WithDrowlMoney < 0 ) {
		System.out.println("WithDrow Unsecessful only" + this.Balance+"is Left");
	}else {
		this.Balance-=WithDrowlMoney;
		System.out.println("Withdrow Sucessful , Current balance"+this.Balance);
	}
}

public int GetNumber() {
	return Number;
}
public void setNumber ( int number) {
	Number = number;
}
public double getBallance() {
	return Balance;
}
public void setBalance(double balance) {
	balance = balance;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmain() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPhoneNumber() {
	return PhoneNumber;
}
public void setPhoneNumber(String PhoneNumber) {
	PhoneNumber = PhoneNumber;
}



}
