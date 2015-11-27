abstract class Icecream { 
	String name;
	public String getName(){
		return name;
	}
}

class IcecreamA extends Icecream { 
	public IcecreamA(){
	name = "A";
	}
}

class IcecreamB extends Icecream { 
	public IcecreamB(){
		name = "B";
		}
}

abstract class Cafe {
    public abstract Icecream factoryMethod();
}

class CafeA extends Cafe {
    @Override
    public Icecream factoryMethod() { return new IcecreamA(); }
}

class CafeB extends Cafe {
    @Override
    public Icecream factoryMethod() { return new IcecreamB(); }
}

public class FactoryExample {
    public static void main(String[] args) {
        
    	Cafe creator = new CafeA(); 
    	Cafe creator1 =new CafeB();
        
       
            Icecream icecream = creator.factoryMethod();
            System.out.printf(icecream.getName()+"\n");
            Icecream icecream1 = creator1.factoryMethod();
            System.out.printf(icecream1.getName()+"\n");
        
    }
}