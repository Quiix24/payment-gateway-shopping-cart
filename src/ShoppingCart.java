import java.util.Scanner;

public class ShoppingCart {
    Item[] orderItems;
    // da be4oof ana fe el talb el olany wla laa
    private int currentIndex;

    public ShoppingCart() {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter number of items:");
        int x = i.nextInt();
        orderItems = new Item[x];
        currentIndex = 0;
    }

    public void add(Item item) {
        if (currentIndex < orderItems.length) {
            orderItems[currentIndex] = item;
            currentIndex++;

            System.out.println(item.getName() + " added to the cart.");
        } else {
            System.out.println("Sorry, the cart is full. Cannot add more items.");
        }
    }
    
    public void remove(Item item){
         for (int i = 0; i < orderItems.length; i++) {
               if (orderItems[i] == item) {
                    orderItems[i] = null;
                    System.out.println(item.getName() + " removed from the cart.");
                    break;
               }
         }
    }
    
     public double getTotalAmount() {
        double totalAmount = 0;
        for (int i = 0; i < 10; i++) {
            totalAmount += orderItems[i].getPrice();
        }
        return totalAmount;
    }
}


