import java.util.Scanner;

class tester {
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        String name1 = "Ryan";
        String name2 = "Jarom";
        String name3 = "Mario";
        String name4 = "Coco";
        double workhours = 8,tax = 0.10,rph = 130.50;
        double workdays; 
        double grosspay = rph * workhours;
        double overtime;                             
        
        System.out.print("Enter your name:");
        String name = input.nextLine();
        System.out.print("Enter your age:");
        int age = input.nextInt();
        
        Scanner connum = new Scanner(System.in);
        
        System.out.print("Enter your Contact number:");
        String num = connum.nextLine();
        
        System.out.print("Enter Worked days: ");
        workdays = connum.nextDouble();
        
        Scanner answer = new Scanner(System.in);
        System.out.print("Overtime Yes/No:" );
        String ans = answer.next();
        
        if(ans.equalsIgnoreCase("Yes")){
            System.out.print("Enter hours overtime: ");
            overtime = answer.nextDouble();
            double Netpay1 = overtime * grosspay * workdays;
        }else if (ans.equalsIgnoreCase("No")){
            System.out.print("");
        } else {
            System.out.println("Enter Yes or No only!");
        
        }
        
        
        double Netpay = grosspay * workdays;        
        double Netpay2 = Netpay - tax;
        
        if (name.equalsIgnoreCase(name1) || name.equalsIgnoreCase(name2) || name.equalsIgnoreCase(name3) || name.equalsIgnoreCase(name4)) {
            System.out.println("Your name already exist");
        }
        System.out.println("\nUser Information");
        System.out.println("Your name is: " + name);    
        System.out.println("Your age is " + age + "years old");
        System.out.println("Contact number:" + num);
        System.out.println("Total Tax: " + tax);
        System.out.println("Total rate per hour: " + rph);
        System.out.println("");
        System.out.println("Grosspay: " + grosspay);
        System.out.println("Netpay: " + Netpay2);
        
        
    }    
}
