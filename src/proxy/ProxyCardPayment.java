package proxy;

public class ProxyCardPayment implements Payment{


    private final double amount;
    private long cardId;
    private CreditCardPayment creditCardPayment;
    public ProxyCardPayment(double amount,long cardId){
        this.amount=amount;
        this.cardId=cardId;

    }
    private boolean controlBalance(double amount,long cardId){
        //control card balance for card id
        if(cardId==0) return false;
        return true;
    }
    @Override
    public void pay() {
        if(controlBalance(amount,cardId)){
            creditCardPayment=new CreditCardPayment(amount,cardId);
            creditCardPayment.pay();
        }
        else
        System.out.println("Card issues");
    }
}
