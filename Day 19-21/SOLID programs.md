###### **Problem 1 – SRP**

"You are building a LibraryManager class that handles book inventory, user registration, and fine calculation. The code works but is hard to maintain. Refactor the design so each class has a single responsibility."



class Main{

&#x09;public static void main(String\[] args){

&#x09;	BookInventory b = new BookInventory();

&#x09;	UserRegistration u = new UserRegistration();

&#x09;	FineCalculation f = new FineCalculation();

&#x09;	b.BookInfo("Programming in C", 2000);

&#x09;	u.UserInfo("Shrinidhi", 205);

&#x09;	f.UserFine("Shrinidhi", 205, 200);

&#x09;} 

}

class void BookInventory{

&#x09;public BookInfo(String bn, double ct){

&#x09;	System.out.println(bn + " cost Rs." + ct);

&#x09;}

} 

class void UserRegistration{

&#x09;public UserInfo(String name, int id){

&#x09;	System.out.println(name +" (" + id + ") Registered");

&#x09;}

}

class void FineCalculation{

&#x09;public UserFine(String name, int id, int fn){

&#x09;	System.out.println(name +" (" + id + ") have to pay Rs." + fn + " as a fine");

&#x09;}

}

**OUTPUT:**

Programming in C cost Rs.2000.0

Shrinidhi (205) Registered

Shrinidhi (205) have to pay Rs.200 as a fine



====================================================================================



###### **Problem 2 – OCP**

"Your company introduces new types of discounts every festival season. The current FestivalDiscount class uses if-else chains to handle each case. Redesign the system so new discounts can be added without modifying existing code."





class Main{

&#x20;   public static void main(String\[] args){

&#x20;       System.out.println("Amount of Diwali:" + new DiscountDiwali().calculate(2000));

&#x20;       System.out.println("Amount of New Year:" + new DiscountNewYear().calculate(2000));

&#x20;   }

}

interface Discount{

&#x20;   public double calculate(double amt);

}



class DiscountDiwali implements Discount{

&#x20;   @Override

&#x20;   public double calculate(double amt){

&#x20;       return amt \* 0.9;

&#x20;   }

}

class DiscountNewYear implements Discount{

&#x20;   @Override

&#x20;   public double calculate(double amt){

&#x20;       return amt \* 0.8;

&#x20;   }

}

**OUTPUT:**

Amount of Diwali:1800.0

Amount of New Year:1600.0



===================================================================================



###### **Problem 3 – LSP**

"You have a Shape base class with a calculateArea() method. A Line subclass throws an exception when calculateArea() is called. Redesign the hierarchy so all subclasses can be substituted without breaking functionality."



class Main{

&#x09;public static void main(String\[] args){

&#x09;	Square s = new Square(5);

&#x09;	Rectangle r = new Rectangle(10, 5);

&#x09;	s.calculateArea();

&#x09;	r.calculateArea();

&#x09;}

}

interface Shape{

&#x09;public void calculateArea();

}

class Rectangle implements Shape{

&#x09;int w;

&#x09;int h;

&#x09;public Rectangle(int w, int h){

&#x09;	this.w = w;

&#x09;	this.h = h;

&#x09;}

&#x09;public void calculateArea(){

&#x09;	System.out.println("Area of Rectangle: " + w\*h);

&#x09;}

}

class Square implements Shape{

&#x09;int s;

&#x09;public Square(int s){

&#x09;	this.s = s;

&#x09;}

&#x09;public void calculateArea(){

&#x09;	System.out.println("Area of Square: " + s\*s);

&#x09;}

}

**OUTPUT:**

Area of Square: 25

Area of Rectangle: 50



============================================================================



###### **Problem 4 – ISP**

"You created a SmartDevice interface with methods playMusic(), makeCall(), and browseInternet(). A BasicPhone class implements it but throws exceptions for unsupported features. Split the interface so classes only implement what they actually support."





class Main{

&#x20;   public static void main(String\[] args){

&#x20;       BasicPhone b = new BasicPhone();

&#x20;       SmartPhone s = new SmartPhone();

&#x20;       b.makeCall();

&#x20;       s.makeCall();

&#x20;       s.playMusic();

&#x20;       s.browseInternet();

&#x20;   }

}



interface Phone {

&#x20;   void makeCall();

}



interface AudioPlayer {

&#x20;   void playMusic();

}



interface WebBrowser {

&#x20;   void browseInternet();

}





class BasicPhone implements Phone {

&#x20;   public void makeCall() {

&#x20;       System.out.println("Making a standard voice call...");

&#x20;   }

}





class SmartPhone implements Phone, AudioPlayer, WebBrowser {

&#x20;   public void makeCall() {

&#x20;       System.out.println("Making a video call...");

&#x20;   }

&#x20;   public void playMusic() {

&#x20;       System.out.println("Listening music on Spotify...");

&#x20;   }

&#x20;   public void browseInternet() {

&#x20;       System.out.println("Searching in Google Chrome...");

&#x20;   }

}

**OUTPUT:**

Making a standard voice call...

Making a video call...

Listening music on Spotify...

Searching in Google Chrome...



===================================================================================



###### **Problem 5 – DIP**

"Your OrderService directly depends on a MySQLDatabase class. Later, the team wants to switch to PostgreSQL. Refactor the design so OrderService depends on an abstraction, making database swaps easy.



class Main {

&#x20;   public static void main(String\[] args) {



&#x20;       Database mySql = new MySQLDatabase();

&#x20;       OrderService service1 = new OrderService(mySql);

&#x20;       service1.processOrder("ORD-101");



&#x20;       Database postgres = new PostgreSQLDatabase();

&#x20;       OrderService service2 = new OrderService(postgres);

&#x20;       service2.processOrder("ORD-102");

&#x20;   }

}





interface Database {

&#x20;   void saveOrder(String orderId);

}





class MySQLDatabase implements Database {

&#x20;   public void saveOrder(String orderId) {

&#x20;       System.out.println("Saving order " + orderId + " to MySQL Database.");

&#x20;   }

}



class PostgreSQLDatabase implements Database {

&#x20;   public void saveOrder(String orderId) {

&#x20;       System.out.println("Saving order " + orderId + " to PostgreSQL Database.");

&#x20;   }

}





class OrderService {

&#x20;   private final Database database;





&#x20;   public OrderService(Database database) {

&#x20;       this.database = database;

&#x20;   }



&#x20;   public void processOrder(String orderId) {

&#x20;       System.out.println("Processing order...");

&#x20;       database.saveOrder(orderId);

&#x20;   }

}



**OUTPUT:**

Processing order...

Saving order ORD-101 to MySQL Database.

Processing order...

Saving order ORD-102 to PostgreSQL Database.



======================================================================================



