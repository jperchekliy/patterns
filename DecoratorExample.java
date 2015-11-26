abstract class Car {
	String description = "Unknown";
    public abstract int getPrice();
    public String getDescription() {
		return description;
	}
}

class SimpleCar extends Car {

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public String getDescription() {
        return "SimpleCar";
    }
}

abstract class CarDecorator extends Car {
    
	abstract public String getDescription();
}

class Condish extends CarDecorator {
	Car car;
    public Condish(Car car) {
        this.car=car;
    }
    
    public int getPrice() {
        return car.getPrice() + 200;
    }
    
    public String getDescription() {
        return car.getDescription() + " with conditioner";
    }
}

class Leath extends CarDecorator {
	Car car;
    public Leath(Car car) {
    	this.car=car;
    }
    
    public int getPrice() {
        return car.getPrice() + 300;
    }
    
    public String getDescription() {
        return car.getDescription() + " with leather interior";
    }
}

public class DecoratorExample {
    public static void main(String[] args) {
        Car car = new SimpleCar();
        System.out.println("Price: " + car.getPrice() 
            + ", Description: " + car.getDescription());
        
        car = new Condish(car);
        System.out.println("Price: " + car.getPrice() 
            + ", Description: " + car.getDescription());
        
        car = new Leath(car);
        System.out.println("Price: " + car.getPrice() 
            + ", Description: " + car.getDescription());
    }
}