public class Account {
    private  int id;
    private String title;
    private double balance;

    Account(){}

    public Account(int id, String title, double balance) {
        this.id = id;
        this.title = title;
        this.balance = balance;
    }
    public void withdraw(double amount) throws InvlaidAmountExcetion, InsufficientBalanceException
    {
        if (amount <= 0)
            throw new InvlaidAmountExcetion();
        if (amount>balance)
            throw new InsufficientBalanceException();
        balance-=amount;
    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public  String getTitle(){
        return  title;
    }
    public void setTitle(){
        this.title=title;
    }
    public  double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
}