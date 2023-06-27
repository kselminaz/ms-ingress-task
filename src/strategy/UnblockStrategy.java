package strategy;

public class UnblockStrategy {

    private Strategy strategy;

    public void setStrategy(Strategy strategy){
       this.strategy=strategy;
    }
    public boolean executeStrategy(){
        return strategy.unblock();
    }

}
