package proxy;

public class CreditCardPayment implements Payment{

    private double amount;
    private long cardId;
    public CreditCardPayment(double amount,long cardId){
        this.amount=amount;
        this.cardId=cardId;
    }
    @Override
    public void pay() {
        System.out.println("Getting " +amount+" amount from Card with card id "+cardId);
    }

}
