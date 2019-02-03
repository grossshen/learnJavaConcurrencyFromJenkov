package tech.poorguy.raceCondition;

public class AddTwoNumber {
    private int sum1;
    private int sum2;
    public void add(int sum1,int sum2){
        synchronized (this){
            sum1+=1;
            sum2+=1;
        }
    }
}
