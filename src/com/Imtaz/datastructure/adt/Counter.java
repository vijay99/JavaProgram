package com.Imtaz.datastructure.adt;

/**
 * @author Kumar Vijay
 */
public class Counter {
    private String counterName;
    private int count;

    public Counter(String counterName){
        this.counterName=counterName;
        count=0;
    }

    public void increment(){
        count++;
    }

    public int getCurrentValue(){
        return count;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "counterName='" + counterName + '\'' +
                ", count=" + count +
                '}';
    }
}
