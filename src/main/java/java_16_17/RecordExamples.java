package java_16_17;

/*
usefull articles :

https://blogs.oracle.com/javamagazine/records-come-to-java#anchor_8
https://www.baeldung.com/java-record-keyword
http://tutorials.jenkov.com/java/record.html
https://openjdk.java.net/jeps/359
https://openjdk.java.net/jeps/395 (openjdk 16)

*/

import java.util.ArrayList;
import java.util.Collections;

public class RecordExamples {
    
    // Store records Ticket in an ArrayList and Sort the Collection
    public static void run() {
  
        Ticket ticket1 = new Ticket(1,"New York","2021-05-03",10,110.30f,"Ferrari");
        Ticket ticket2 = new Ticket(2,"Miami","2021-05-02",9,120.50f,"Porche");
        Ticket ticket3 = new Ticket(3,"Los Angeles","2021-05-01",10,150.50f,"Mercedes");
        
        var list = new ArrayList<Ticket>();

        list.add(ticket1);
        list.add(ticket2);
        list.add(ticket3);

        System.out.println("The List before sorting:\n");
        list.forEach(System.out::println);
        Collections.sort(list);       
        System.out.println("\nThe List After sorting:\n");
        list.forEach(System.out::println);
       
    }
}

// Record which impements Comparable interface and be able to sort if its stored in a Collection

record Ticket(int id,String city,String date,int days,float price,String vehicle) implements Comparable<Ticket> {

    public int compareTo(Ticket ticket){

        return this.date.compareTo(ticket.date);
    }
}