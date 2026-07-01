###### **FACTORY METHOD**



import java.util.\*;

public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;

&#x20;       Scanner sc = new Scanner(System.in);

&#x20;       String pa = sc.next();

&#x20;

&#x20;       Payment p = PaymentFactory.paymentOption(pa);

&#x20;       p.pay();

&#x20;

&#x20;       // Payment p1 = PaymentFactory.paymentOption("upi");

&#x20;       // p1.pay();



&#x20;       // Payment p2 = PaymentFactory.paymentOption("creditcard");

&#x20;       // p2.pay();

&#x20;

&#x20;       // Payment p3 = PaymentFactory.paymentOption("paypal");

&#x20;       // p3.pay();

&#x20;   }

}



interface Payment {

&#x20;   void pay();

}



class CreditCardPayment implements Payment{

&#x20;   public void pay() { System.out.println("Done Payment in CreditCard"); }

}



class PayPalPayment implements Payment {

&#x20;   public void pay() { System.out.println("Done Payment in PayPal"); }

}



class UPIPayment implements Payment {

&#x20;   public void pay() { System.out.println("Done Payment in UPI"); }

}



class PaymentFactory {

&#x20;   public static Payment paymentOption(String type) {

&#x20;       if(type.equalsIgnoreCase("CreditCard")) {

&#x20;           return new CreditCardPayment();

&#x20;       } else if(type.equalsIgnoreCase("PayPal")) {

&#x20;           return new PayPalPayment();

&#x20;       }else if(type.equalsIgnoreCase("UPI")) {

&#x20;           return new UPIPayment();

&#x20;       }

&#x20;       return null;

&#x20;   }

}



=======================================================================================



###### **ABSTRACT FACTORY**



class Main {

&#x20;   public static void main(String\[] args){

&#x20;       Factory fac = new WindowsFactory();

&#x20;       Button b1 = fac.createButton();

&#x20;       Checkbox c1 = fac.createCheckbox();

&#x20;

&#x20;       b1.Click();

&#x20;       c1.tick();

&#x20;

&#x20;       fac = new MacFactory();

&#x20;       Button b2 = fac.createButton();

&#x20;       Checkbox c2 = fac.createCheckbox();

&#x20;

&#x20;       b2.Click();

&#x20;       c2.tick();

&#x20;   }

}



// ----------------------------button----------------------------------

interface Button {

&#x20;    public void Click();

}

class WindowsButton implements Button{

&#x20;   public void Click(){

&#x20;       System.out.println("WindowsButton is clicked.......!");

&#x20;   }

}

class MacButton implements Button{

&#x20;   public void Click(){

&#x20;       System.out.println("MacButton is clicked.......!");

&#x20;   }

}



// ----------------------------checkbox----------------------------------

interface Checkbox {

&#x20;   public void tick();

}

class WindowsCheckbox implements Checkbox{

&#x20;   public void tick(){

&#x20;       System.out.println("WindowsCheckbox is ticked.......!");

&#x20;   }

}

class MacCheckbox implements Checkbox{

&#x20;   public void tick(){

&#x20;       System.out.println("MacCheckbox is ticked.......!");

&#x20;   }

}



// ----------------------------factory----------------------------------

interface Factory{

&#x20;   public Button createButton();

&#x20;   public Checkbox createCheckbox();

}

class WindowsFactory implements Factory{

&#x20;   public Button createButton(){

&#x20;       return new WindowsButton();

&#x20;   }

&#x20;   public Checkbox createCheckbox(){

&#x20;       return new WindowsCheckbox();

&#x20;   }

}

class MacFactory implements Factory{

&#x20;   public Button createButton(){

&#x20;       return new MacButton();

&#x20;   }

&#x20;   public Checkbox createCheckbox(){

&#x20;       return new MacCheckbox();

&#x20;   }

}



=======================================================================================



###### **SINGLETON**



import java.util.\*;



class Main{

&#x20;   public static void main(String\[] args){

&#x20;       DatabaseConnection dc = DatabaseConnection.getInstance();

&#x20;       dc.addWords("Apple");

&#x20;       dc.addWords(" Banana");

&#x20;   }

}



class DatabaseConnection {

&#x20;   private static DatabaseConnection instance;

&#x20;   StringBuilder s = new StringBuilder("");

&#x20;   private DatabaseConnection(){

&#x20;       System.out.println("Appending Strings");

&#x20;   }

&#x20;   public static DatabaseConnection getInstance(){

&#x20;       if(instance == null)

&#x20;           instance = new DatabaseConnection();

&#x20;       return instance;

&#x20;   }

&#x20;   public void addWords(String str){

&#x20;       s.append(str);

&#x20;       System.out.println(s);

&#x20;   }

}





==========================================================================

