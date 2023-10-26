
import java.util.*;
public class Person implements Comparable<Person>
{
    int id;
    String first;
    String last;
    public Person(int i, String f, String l)
    {
        id = i;
        first = f;
        last = l;

    }
    public int compareTo(Person other)
    {
        if(!first.equalsIgnoreCase(other.first))
        {
            return first.compareToIgnoreCase(other.first);
        }
        return last.compareToIgnoreCase(other.last);
    }
    public String toString()
    {
        return "id = " + id + ", firstName = " + first + ", lastName = " + last; 
    }
    public static void main(String[] args)
    {
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
}
