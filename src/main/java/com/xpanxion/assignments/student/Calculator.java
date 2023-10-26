import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    ArrayList<String> calculations;
    public Calculator()
    {
        calculations = new ArrayList<String>();
    }
    public void calculate()
    {
        Scanner input = new Scanner(System.in);
        String d ="";
        while(!d.equalsIgnoreCase("done"))
        {
        System.out.print("Enter first number: ");
        d = input.next();
        if(!d.equalsIgnoreCase("done"))
        {
        int a = Integer.parseInt(d);
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.print("Enter operation(+,-,*,/): ");
        String op = input.next();
        int result = 0;
        if(op.equalsIgnoreCase("-"))
        {
           result = a-b;
        
        }
        if(op.equalsIgnoreCase("+"))
        {
            result = a+b;
        }
        if(op.equalsIgnoreCase("*"))
        {
            result = a*b;
        }
        if(op.equalsIgnoreCase("/"))
        {
            result = a/b;
        }
        System.out.println("Result: " + result);
        calculations.add(Integer.toString(a) + " " + op + " " + Integer.toString(b) + " = " + result);
    }
    for(String a:calculations)
    {
        System.out.println(a);
    }
    }

    }


}
