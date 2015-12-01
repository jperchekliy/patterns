interface Pig {

	public void Hry();
	
}
class Piggy implements Pig{

	public void Hry() {
		System.out.println("Hry");
	}
}
interface Dog {

	public void Gav();
	
}
class Pug implements Dog{

	public void Gav(){
		System.out.println("Gav");
	}
		
}

class PugAdapter implements Dog{
	private Pig pig;
	public PugAdapter(Pig pig){
		this.pig=pig;
	}
	public void Gav() {
		 pig.Hry();
		}

}

public class AdapterExample {
	public static void main (String [] args){
		Piggy pig = new Piggy();
		Dog pug = new PugAdapter(pig);
		
		pug.Gav();
	}
}
