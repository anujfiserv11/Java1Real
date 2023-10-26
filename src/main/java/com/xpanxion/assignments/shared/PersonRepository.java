package com.xpanxion.assignments.shared;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PersonRepository {

    //
    // Data members
    //

    private final HashMap<Integer, Person> personHashMap;

    //
    // Constructors
    //

    public PersonRepository() {
        personHashMap = new HashMap<Integer, Person>();
        personHashMap.put(1, new Person(1, "Peter", "Jones"));
        personHashMap.put(2, new Person(2, "John","Smith"));
        personHashMap.put(3, new Person(3, "Mary","Jane"));
    }

    //
    // Methods
    //

    public Person getPerson(Integer personId) {
        return personHashMap.get(personId);
    }
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        String d = "";
        PersonRepository one = new PersonRepository();

        
        while(true)
        {
            System.out.print("Enter person ID: ");
            String id = input.next();
            if(id.equalsIgnoreCase("done"))
            {
                break;
            }
            
            System.out.print(one.getPerson(Integer.parseInt(id)));

        }
    }
   
}
