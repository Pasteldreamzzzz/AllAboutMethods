public class Main {
  static void happyValentines(String name, int grams) {
 System.out.println("Hey! " + name + " I love you!!");
 System.out.println("Congrats " + name + " you have " + grams + " number of Valentines candy grams");
  }

  public static void main(String[] args ){
    happyValentines("Lisa",14); 
    happyValentines("Rosline",18); 
    happyValentines("Stephanie",21); 
  }

 
 static void myMethod(String name, int grams  ){ 
    System.out.println("Congrats " + name + " you have " + grams + " number of Valentines candy grams");
  }
 
 public static void second(String[] args ){
   myMethod("Lisa", 14);
   myMethod("Rosline", 18);
   myMethod("Stephanie", 21);
  }
  
}  