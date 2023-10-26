import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaTwo
{
    public void ex1() {
        Scanner input = new Scanner(System.in);
        String d = "";
        ArrayList<Person> people = new ArrayList<Person>();
        while(!d.equalsIgnoreCase("done"))
        {
            System.out.print("Enter Person: ");
            d = input.next();
            if(!d.equalsIgnoreCase("done"))
            {
            int i = Integer.parseInt(d);
            String f = input.next();
            String l = input.next();
            people.add(new Person(i,f,l));
            }
        }
        for(Person p:people)
        {
            System.out.println(p);
        }

    }

    public void ex2() {
       HashMap<Integer,Person> personHashMap = new HashMap<Integer, Person>();
        personHashMap.put(1, new Person(1, "Peter", "Jones"));
        personHashMap.put(2, new Person(2, "John","Smith"));
        personHashMap.put(3, new Person(3, "Mary","Jane"));
        Scanner input = new Scanner(System.in);
        String d = "";
        while(!d.equalsIgnoreCase("done"))
        {
            System.out.print("Enter Person ID: ");
            d = input.next();
            if(!d.equalsIgnoreCase("done"))
            {
                System.out.println(personHashMap.get(Integer.parseInt(d)));
            }
        }
      

        
        
        
    }

    public void ex3() {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
                
    }

    public void ex4() {
       var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
       
    }

    public void ex5() {
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }

    public void ex6() {
        Calculator calc = new Calculator();
        calc.calculate();
    }

    public void ex7() {
       var personList = Arrays.asList(
        new Person(1, "Peter", "Jones"),
        new Person(2, "John", "Smith"),
        new Person(3, "Sue", "Anderson")
);

       List<Person> newPersonList = personList.stream().map(i-> new Person(i.id,i.first,"xxx")).toList();

for (Person p : newPersonList) {
    System.out.println(p);
}
        
        
    }

    public void ex8() {
       var personList = Arrays.asList(
        new Person(1, "Charlie", "Jones"),
        new Person(2, "Zoey", "Smith"),
        new Person(3, "Adam", "Anderson")
);

        Collections.sort(personList);
        //person implements comparable

for (Person p : personList) {
    System.out.println(p);
}
    }

    public void ex9() {
        var personList = Arrays.asList(
            new Person(1, "Charlie", "Jones"),
            new Person(2, "Zoey", "Smith"),
            new Person(3, "Adam", "Anderson")
    );
    
    List<Person> filteredList = personList.stream().filter(i -> i.last.equals("Smith")).toList();
    
    for (Person p : filteredList) {
        System.out.println(p);
    }
}

    public void ex10() {
      Queue<Cat>  cats= new LinkedList<Cat>();
      cats.add(new Cat("Alice"));
      cats.add(new Cat("Bob"));
      cats.add(new Cat("Charlie"));
      cats.add(new Cat("Dan"));
      while(!cats.isEmpty())
      {
        System.out.println();
        cats.forEach(i->System.out.print(i + " "));
        cats.remove();
      }

    }


}