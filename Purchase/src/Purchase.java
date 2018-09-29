import java.util.*;

class Purchase 
{

String itemName;
double itemPrice;
int itemQuantity;
double totalCost;

public static void main(String args[])
{
    String strItemName;
    int qty;
    double price;
    double cash;
    double change;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Item Name: ");
    strItemName = input.nextLine();
    System.out.print("Enter Quantity: ");
    qty = Integer.parseInt(input.nextLine());
    System.out.print("Enter Price: ");
    price = Double.parseDouble(input.nextLine());
    
    Purchase p = new Purchase();
    p.setItemName(strItemName);
    p.setTotalCost(qty, price);
    System.out.println("Your Items is: " + p.getItemName());
    System.out.println("Your Total Cost is: " + p.getTotalCost());
    System.out.println("==============================");
    System.out.print("Enter Amount Paid: ");
    cash = Integer.parseInt(input.nextLine());
    change =  cash - price;
    if (change > p.getTotalCost())
    {
        System.out.println("Thank You for BUYING!");
        System.out.println("Your Change is: P" + (cash-p.getTotalCost()) + " pesos");
    }
    else
    {
        System.out.println("Your Money is insufficient");
        System.out.println("You need: P"+(p.getTotalCost() - cash ) + " pesos");
    }
}

public void setItemName(String newItemName)
    {
    itemName = newItemName;
    }
public void setTotalCost(int quantity, double price)
{
    totalCost = quantity * price;
}
public String getItemName()
{
    return itemName;
}
public double getTotalCost()
{
    return totalCost;
}
}