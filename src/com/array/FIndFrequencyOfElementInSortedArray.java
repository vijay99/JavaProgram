package com.array;

/**
 * @author Kumar Vijay
 */
public class FIndFrequencyOfElementInSortedArray {
    public static void main(String[] args) {
        String apiEndPoint="https://apisalesdemo2.successfactors.eu/odata/v2/PerPersonal(personIdExternal='mschneider',startDate=datetime'2019-01-01T00:00:00')";
        String firstPart =apiEndPoint.substring(0,48);
        String secondPart=apiEndPoint.substring(firstPart.length());
        System.out.println(firstPart);
        System.out.println(secondPart);

    }

}
