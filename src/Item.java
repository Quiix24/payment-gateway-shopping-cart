public class Item{
    
    private String name;
    private int quantity;
    private double price;
    
    public Item(String name ,double price, int quantity ){
        
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    Item() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    } 
}
