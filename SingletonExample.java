class Single {
   private static Single Instance ;
   private Single(){}
   public static Single getInstance(){
      return Instance = new Single();
   }
   public void Message(){
      System.out.println("Hello World!");
   }
}
public class SingletonExample {
	public static void main(String[] args) {
	      Single object = Single.getInstance();
	      object.Message();
	   }
}
