class Single {
   private static Single Instance ;
   private Single(){}
   public static Single getInstance(){
	   if(Instance == null){
      return Instance = new Single();
	   }
	return Instance;
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
