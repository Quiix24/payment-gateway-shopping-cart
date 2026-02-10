import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {

        Scanner input = new Scanner(System.in);

        ShoppingCart cart = new ShoppingCart();

        String answer;
        do {
            System.out.println("Please, select a product:");
            System.out.println("- Pizza, $40 \n - Cheeseburger, $20 \n - Coffee, $5 \n - Soda, $4 \n - Water, $2");

            String name = JOptionPane.showInputDialog("Name of the Item");

            String respons = JOptionPane.showInputDialog("Price of the Item");
            int price = Integer.parseInt(respons);

            String respons2 = JOptionPane.showInputDialog("Quantity of the Item");
            int quantity = Integer.parseInt(respons2);

            Item item = new Item(name, price, quantity);
            cart.add(item);

            answer = JOptionPane.showInputDialog("Add another item? (Y/N)");
        } while (answer != null && answer.length() > 0 && answer.toUpperCase().charAt(0) == 'Y');

        // Display the items in the cart
        System.out.println("Items in the shopping cart:");
        // da belf 3la el array l7d ma y5las
        for (Item item : cart.orderItems) {
            if (item != null) {
                System.out.println(item.getName() + " - $" + item.getPrice() + " - Quantity: " + item.getQuantity());
            }
        }

        String method = JOptionPane.showInputDialog("choose a payment method (PayPal or CreditCard)");

        if (method.equalsIgnoreCase("PayPal")) {
            System.out.println("Email, Password, and Balance");
            String Pemail = input.next();
            String Ppassword = input.next();
            int Pbalance = input.nextInt();

            PayPal obj1 = new PayPal(Pemail, Ppassword, Pbalance);

        } else {
            System.out.println("Name, CardNumber, Cvv, ExpiryDate, and Balance ");
            String Cname = input.next();
            String Cnumber = input.next();
            int Cccv = input.nextInt();
            String Cdate = input.next();


            // Parse the input date using SimpleDateFormat
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            Date date = sdf.parse(Cdate);
            
            int Cbalance = input.nextInt();

            CreditCard obj2 = new CreditCard(Cname, Cnumber, Cccv, date);
        }
    }
}
