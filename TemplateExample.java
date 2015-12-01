abstract class Template {
   abstract void init();
   abstract void start();
   abstract void end();

   public final void prepare(){
	   init();
	   start();
	   end();
   }
}
class A extends Template {

	@Override
	void init() {
		System.out.println("A init");
		
	}

	@Override
	void start() {
		System.out.println("A start");
		
	}

	@Override
	void end() {
		System.out.println("A end");
		
	}

	 
	}
class B extends Template {

	@Override
	void init() {
		   System.out.println("B init");
		
	}

	@Override
	void start() {
		System.out.println("B start");
		
	}

	@Override
	void end() {
		System.out.println("B end");
		
	}

	  
	}
public class TemplateExample {
	   public static void main(String[] args) {

		   Template template = new A();
		   template.prepare();
	     
	      template = new B();
	      template.prepare();		
	   }
}