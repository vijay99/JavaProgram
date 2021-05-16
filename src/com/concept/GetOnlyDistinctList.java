package com.concept;

import java.util.*;

/**
 * @author Sacumen (www.sacumen.com)
 */

/**
 * Here we have to get distinct truck record( if location of truck is same(latitude and longitude ).
 * By overriding equals and hashcode in the Truck class object we are making sure to store only distinct truck location
 * Also by using LinkedHashSet it is assured to keep the order of insertion in the set and finally get distinct ordered truck location list only.
 */
public class GetOnlyDistinctList {
    public static void main(String[] args) {
        Set<Truck> linkedHasSetOfTruck = new LinkedHashSet<>();
        linkedHasSetOfTruck.add(new Truck(10, 20, 0));
        linkedHasSetOfTruck.add(new Truck(11, 21, 5));
        linkedHasSetOfTruck.add(new Truck(12, 22, 10));
        linkedHasSetOfTruck.add(new Truck(12, 22, 15));
        linkedHasSetOfTruck.add(new Truck(12, 22, 20));
        linkedHasSetOfTruck.add(new Truck(12, 22, 25));
        linkedHasSetOfTruck.add(new Truck(12, 22, 30));
        linkedHasSetOfTruck.add(new Truck(13, 23, 35));

        System.out.println("All distinct records are:");
        for (Truck truck : linkedHasSetOfTruck)
            System.out.println(truck);

        if ((new Truck(12, 22, 20).equals(new Truck(12, 22, 25))))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}

class Truck {
    public Truck(long altitude, long longitude, long timestamp) {
        this.altitude = altitude;
        this.longitude = longitude;
        this.timestamp = timestamp;
    }

    private final static long truckId = 1234;
    private long altitude;
    private long longitude;
    private long timestamp;

    @Override
    public String toString() {
        return "Truck{" +
                "altitude=" + altitude +
                ", longitude=" + longitude +
                ", timestamp=" + timestamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return altitude == truck.altitude &&
                longitude == truck.longitude;
    }

    @Override
    public int hashCode() {
        return Objects.hash(altitude, longitude);
    }

   /* @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (this.getClass() != o.getClass())
            return false;
        Truck truck = (Truck) o;
        if (this.longitude == truck.longitude && this.altitude == truck.altitude)
            return true;
        return false;
    }*/
}
