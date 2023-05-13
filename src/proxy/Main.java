package proxy;

public class Main {
    public static void main(String[] args) {
        var payment=new ProxyCardPayment(100,12);
        payment.pay();
    }
}
