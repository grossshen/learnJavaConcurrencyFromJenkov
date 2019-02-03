package tech.poorguy.raceCondition;

public class AddTwoNumbersBetter {
    private int sum1;
    private int sum2;
    private Integer sum1Lock = new Integer(1);
    private Integer sum2Lock = new Integer(2);
    public void add(int sum1,int sum2){
        synchronized (sum1Lock){
            sum1+=1;
        }
        synchronized (sum2Lock){
            sum2+=1;
        }
    }
}
