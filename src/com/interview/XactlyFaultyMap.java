/*
package com.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {


    }

    private static Map<Account, List<Opportunities>> processMap(Map<Account,Opportunities> map){

        //creating duplicate accounts
        Account account1 = new Account(101);
        Account account2 = new Account(101);

        Account account3 = new Account(102);
        Account account4 = new Account(102);


        Opportunities opportunities1 = new Opportunities(1);
        Opportunities opportunities2 = new Opportunities(2);
        Opportunities opportunities3 = new Opportunities(3);
        Opportunities opportunities4 = new Opportunities(4);


        //Creating faulty map
        Map<Account,Opportunities> faultyMap=new HashMap<>();
        faultyMap.put(account1,opportunities1);
        faultyMap.put(account2,opportunities2);
        faultyMap.put(account3,opportunities3);
        faultyMap.put(account4,opportunities4);


        for(Map.Entry<Account,Opportunities> entry : faultyMap.entrySet()){
            Account account =entry.getKey();
            if(account)
        }
        Map<Account,List<Opportunities>> processedMap =faultyMap.s


        List<Opportunities> opportunitiesList;
        for(Map.Entry<Account,Opportunities> entry :map.entrySet()){
                 Account account= entry.getKey();
                 Opportunities opportunities = entry.getValue();
                 for()
                 if(account.accId==account.accId){
                     opportunitiesList.add(entry.getValue());
                 }
                 faultyMap.put(account);
        }
    }
}


class Account {
    private int accId;

    public Account(int accId) {
        this.accId = accId;
    }

    public int getAccId() {
        return accId;

    public void setAccId(int accId) {
        this.accId = accId;
    }
}
//Account
//AccountId
//Account1,Account2,Account3,
//map(Account,Opportunities) faulty
//map(Account,List<Opportunities>) newMap

//Opportunities

class Opportunities{
    private int OppId;

    public Opportunities(int oppId) {
        OppId = oppId;
    }

    public int getOppId() {
        return OppId;
    }

    public void setOppId(int oppId) {
        OppId = oppId;
    }
}






















Player
        payerId,playerNickName,List<int>

Vechile
     id,brand_name,


Score


Team

















*/
