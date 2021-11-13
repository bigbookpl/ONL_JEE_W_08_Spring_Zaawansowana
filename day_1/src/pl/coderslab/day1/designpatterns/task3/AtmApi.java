package pl.coderslab.day1.designpatterns.task3;

public class AtmApi {
    private BankAccount bankAccount;
    private Transfer transfer;
    private PhoneCard phoneCard;
    private Loan loan;

    public AtmApi() {
        this.bankAccount = new BankAccount();
        this.transfer = new Transfer();
        this.phoneCard = new PhoneCard();
        this.loan = new Loan();
    }

    public void deposit(){
        bankAccount.deposit();
    }

    public void payOut(){
        bankAccount.payOut();
    }

    public void transferMoney(){
        transfer.transferMoney();
    }

    public void recharge(){
        phoneCard.recharge();
    }

    public void getLoan(){
        loan.getLoan();
    }
}
