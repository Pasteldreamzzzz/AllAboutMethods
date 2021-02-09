class Main {
  static void happyValentines(String name) {
 System.out.println("Hey! " + name + " I love you!!");
  }

  public static void main(String[] args ){
    happyValentines("Lisa"); 
    happyValentines("Rosline"); 
    happyValentines("Stephanie"); 
  }

  public static void main(String[] args ){
   myMethod("Lisa", 14);
   myMethod("Rosline", 18);
   myMethod("Stephanie", 21);
  }
  
  
  
  static void myMethod(String name, int grams  ){ 
    System.out.println("Congrats " + name + " you have " + grams + " number of Valentines candy grams");
  }
}  