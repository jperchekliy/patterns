interface IcecreamIngredientFactory {
	
   public Chocolate createChocolate();
   public Candies createCandis();
   
}
interface Chocolate {
	public String getName();
}
interface Candies {
	public String getName();
}
class IcecreamFactory1 implements IcecreamIngredientFactory{

	@Override
	public Chocolate createChocolate() {
		// TODO Auto-generated method stub
		return new ChocolateDark();
	}

	@Override
	public Candies createCandis() {
		// TODO Auto-generated method stub
		return new CandiesRed();
	}
	
}
class IcecreamFactory2 implements IcecreamIngredientFactory{

	@Override
	public Chocolate createChocolate() {
		// TODO Auto-generated method stub
		return new ChocolateMilk();
	}

	@Override
	public Candies createCandis() {
		// TODO Auto-generated method stub
		return new ChocolateGreen();
	}
	
}
class ChocolateDark implements Chocolate{
	public ChocolateDark(){
		System.out.println("ChocolateDark");
	}
	@Override
	public String getName() {
		return "ChocolateDark";
	}
	
}
class ChocolateMilk implements Chocolate{
	public ChocolateMilk(){
		System.out.println("ChocolateMilk");
	}
	@Override
	public String getName() {
		
		return "ChocolateMilk";
	}
	
}
class CandiesRed implements Candies{
	public CandiesRed(){
		System.out.println("CandiesRed");
	}
	@Override
	public String getName() {
		
		return "CandiesRed";
	}
	
}
class ChocolateGreen implements Candies{
	public ChocolateGreen(){
		System.out.println("ChocolateGreen");
	}
	@Override
	public String getName() {

		return "ChocolateGreen";
	}
	
}
abstract class Icecream { 
	String name;
	Chocolate chocolate;
	Candies candies;
	
	public String getName(){
		return name;
	}

}

class IcecreamA extends Icecream { 
	IcecreamIngredientFactory icecreamIngredientFactory;
	public IcecreamA(IcecreamIngredientFactory icecreamIngredientFactory){
		this.icecreamIngredientFactory = icecreamIngredientFactory;
		name = "A";
		chocolate=icecreamIngredientFactory.createChocolate();
		candies=icecreamIngredientFactory.createCandis();
	}

	
}

class IcecreamB extends Icecream { 
	IcecreamIngredientFactory icecreamIngredientFactory;
	public IcecreamB(IcecreamIngredientFactory icecreamIngredientFactory){
		this.icecreamIngredientFactory = icecreamIngredientFactory;
		name = "B";
		chocolate=icecreamIngredientFactory.createChocolate();
		candies=icecreamIngredientFactory.createCandis();
		}

	
}
abstract class Cafe {
    public abstract Icecream factoryMethod();
}

class CafeA extends Cafe {

    @Override
    public Icecream factoryMethod() { 
    	
    	IcecreamIngredientFactory ingredientFactory = new IcecreamFactory1();
    	return new IcecreamA(ingredientFactory); 
    	}
}

class CafeB extends Cafe {
    @Override
    public Icecream factoryMethod() {
    	IcecreamIngredientFactory ingredientFactory = new IcecreamFactory2();
    	return new IcecreamB(ingredientFactory); 
    	}
}
public class AbstractFactoryExample {
	 public static void main(String[] args) {
	        
	    	Cafe cafe = new CafeA(); 
	    	Cafe cafe1 =new CafeB();
	        
	       
	            Icecream icecream = cafe.factoryMethod();
	            System.out.printf(icecream.getName()+"\n");
	            Icecream icecream1 = cafe1.factoryMethod();
	            System.out.printf(icecream1.getName()+"\n");
	        
	    }

}
