import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

public class PayPal implements PaymentMethod{
    
    private String email;
    private String password;
    private int balance;
    
    public PayPal(String email , String password , int balance){
        this.email = email; 
        this.password = password;
        this.balance = balance;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password=password;
    }
    
    public int getBalance(){
        return balance;
    }
    
    public void setBalance(int balance){
        this.balance=balance;
    }
    
    @Override
   public boolean isValid() {
        boolean regex;
   return regex = email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+@[a-zA-Z0-9.-]+$")&& password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$");
   }
   
   @Override
   public String pay(int amount){
       if(isValid() && balance >= amount){
           balance = balance - amount ;
           return "Payment Successful \n Balance is:" + balance;
       }
       else{
           return "Payment Falied";
       }
   }
}
