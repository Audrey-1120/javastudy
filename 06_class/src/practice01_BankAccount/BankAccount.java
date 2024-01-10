package practice01_BankAccount;

public class BankAccount {
  
  // field
  private String accNo;
  private long balance;
  
  // constructor
  public BankAccount() {
    
  }

  public BankAccount(String accNo, long balance) {
    super();
    this.accNo = accNo;
    this.balance = balance;
  }
  
  // getter, setter

  public String getAccNo() {
    return accNo;
  }

  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }
  
  
  //method

  public void deposit(long money) {
    
    if(money <= 0) {
      System.out.println(money + "원 입금은 안됩니다..");
      return;
    }
    balance += money;

  }
  
  
  public long withdrawal(long money) {
    
    if(money <= 0) {
      System.out.println(money + "원 출금 불가");
      return 0;
    }
    
    if(money > balance) {
    System.out.println();
    return 0L;
  }
    balance -= money;
    return money;
  }
  
  public void transfer(BankAccount account, long money) {
    
    // 내 통장에서 출금 -> 출금된 금액이 반환 -> 네 통장에 입금
    
    // 내 통장에서 출금
    // long a = withdrawal(money);
    // long b = this.withdrawal(money);
    
    // 네 통장에 입금
    // account.deposit(a);
    
    account.deposit(withdrawal(money));

  }
  
  
  
  

}
