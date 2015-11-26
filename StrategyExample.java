interface Strategy {
    void execute(); 
}


class Strategy1 implements Strategy {
 
    public void execute() {
        System.out.println("Strategy1");
   
    }
}
 
class Strategy2 implements Strategy {
 
    public void execute() {
        System.out.println("Strategy2");
      
    }
}
 
class Strategy3 implements Strategy {
 
    public void execute() {
        System.out.println("Strategy3");
       
    }    
}


abstract class Context {
 
    public Strategy strategy;
 
 
    public Context() {
    }

    public void executeStrategy() {
         strategy.execute();
    }
    public void displey(){
		System.out.println("Context:");
	}
}

class Context1 extends Context{
	public Context1(){
		strategy = new Strategy1();
	}
	public void displey(){
		System.out.println("Context1:");
	}
}
class Context2 extends Context{
	public Context2(){
		strategy = new Strategy2();
	}
	public void displey(){
		System.out.println("Context2:");
	}
}
class Context3 extends Context{
	public Context3(){
		strategy = new Strategy3();
	}
	public void displey(){
		System.out.println("Context3:");
	}
}
 

class StrategyExample {
 
    public static void main(String[] args) {
 
        Context context = new Context1();
        context.displey();
        context.executeStrategy();
        
        Context context1 = new Context2();
        context1.displey();
        context1.executeStrategy();
        
        Context context2 = new Context3();
        context2.displey();
        context2.executeStrategy();
    }
}