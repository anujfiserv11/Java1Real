import java.util.Scanner;

public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print(name.toUpperCase());

    }

    public void ex2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = input.nextLine();
        name = name.replaceAll(" ","");
        name = name.replaceAll("[^\\sa-zA-Z0-9]", "");
        int count = 0;
        for(int i=0; i < name.length();i++)
        {
            
            if(name.substring(i,i+1).equals(name.substring(i,i+1).toUpperCase()))
            {
                
                count++;

            }
        }
        System.out.print("Number of upper case = " + count);
        
    }

    public void ex3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        String[] words = s.split(" ");
        for(int i=0; i < words.length;i++)
        {
            if(i % 2 ==0)
            {
                System.out.print(words[i].toUpperCase() + " ");
            }
            else
            {
                System.out.print(words[i] + " ");
            }
        }   
        
    }

    public void ex4() {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String word = input.next();
       for(int i=0; i < word.length();i++)
       {
        if(!(word.substring(i,i+1).equals(word.substring(word.length()-1-i,word.length()-i))))
        {
            
            System.out.print("NO");
            break;
        }
        if(i == word.length() -1)
        {
            System.out.print("YES");
        }
       }
       
    }

    public void ex5() {
       String word = "";
       while(true)
       {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        word = input.nextLine();
        word = word.replaceAll(" ","");
        if(word.equalsIgnoreCase("quit"))
        {
            break;
        }
       
        int v =0;
        int c =0;
        for(int i=0;i<word.length();i++)
        {
            String t = word.substring(i,i+1);
            if(t.equalsIgnoreCase("a")||t.equalsIgnoreCase("e")||t.equalsIgnoreCase("i")||t.equalsIgnoreCase("o")||t.equalsIgnoreCase("u") )
            {
                v++;
            }
            else
            {
                c++;
            }
            
        }
        System.out.println("Number of vowels: " + v);
        System.out.println("Number of consonants: " + c);

       }
    }

    public void ex6() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.print("Result: " + (a+b));
    }

    public void ex7() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.print("Enter operation(add,sub,mul,div): ");
        String op = input.next();
        if(op.equalsIgnoreCase("sub"))
        {
            System.out.print("Result: " + (a-b));
        
        }
        if(op.equalsIgnoreCase("add"))
        {
            System.out.print("Result: " + (a+b));
        }
        if(op.equalsIgnoreCase("mul"))
        {
            System.out.print("Result: " + (a*b));
        }
        if(op.equalsIgnoreCase("div"))
        {
            System.out.print("Result: " + (double)(a)/b);
        }
        
        
    }

    public void ex8() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price per square feet: ");
        double p = input.nextDouble();
        String d = "";
        double c = 0;
        while(!d.equalsIgnoreCase("done"))
        {
        System.out.print("Enter room dimensions (widthxheight): ");
        d = input.next();
        
        
        
        if(!d.equalsIgnoreCase("done"))
        {
        c+= p*Double.parseDouble(d.substring(0,2)) *(Double.parseDouble(d.substring(3)));
        }
        
        

        }
        System.out.println("Total cost: " + c);
        
    }

    public void ex9() {
        Scanner input = new Scanner(System.in);
        int x = (int)(Math.random()*5);
        int guess = 0;
        while(guess != x)
        {
            System.out.print("Enter a number: ");
            guess = input.nextInt();
            if(guess != x)
            {
                System.out.println("Try again");
            }
        }
        System.out.println("You guessed it!");
    }

    public void ex10() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        while(input.hasNext())
        {
            String d = input.next();
            for(int i = 0; i < d.length();i++)
            {
                
                for(int j = 0; j<i;j++)
                {
                    System.out.print(" ");
                }
                System.out.println(d.substring(i,i+1));
            }
        }
    }

    //
    // Private helper methods
    //
}
