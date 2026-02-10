import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;

public class CreditCard implements PaymentMethod{
    
    private String holderName;
    private String cardNumber;
    private int cvv;
    Date expiryDate;
    private int balance;
    
    public CreditCard(String holderName, String cardNumber, int cvv, Date expiryDate){
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
        balance =0;
    }
    
    public String getHolderName(){
        return holderName;
    }
    public void setHolderName(String holderName){
        this.holderName = holderName;
    }
    
    public String getCardNumber(){
        return cardNumber;
    }
    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }
    
    public int getCvv(){
        return cvv;
    }
    public void setCvv(int cvv){
        this.cvv = cvv;
    }
    
    public Date getExpiryDate(){
        return expiryDate;
    }
    public void setExpiryDate(Date expiryDate){
        this.expiryDate = expiryDate;
    }
    
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    
@Override
public boolean isValid() {
    LocalDate currentDate = LocalDate.now();
    //converts the Date to LocalDate
    LocalDate expiryLocalDate = expiryDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    return expiryLocalDate.isAfter(currentDate);
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
