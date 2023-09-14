import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
    Account account= new Account(1,"Aina",1000);

    try {
        account.withdraw(-500);
    }catch (InvlaidAmountExcetion | InsufficientBalanceException exp){
        System.out.println(exp.getMessage());
    }
        System.out.println(account.getBalance());
    }
}