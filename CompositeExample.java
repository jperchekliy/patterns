import java.util.ArrayList;
import java.util.List;

interface Composite_inter {
	public void Output();
}
class Elem implements Composite_inter {

	String elem;
	public Elem(String name) {
		this.elem = name;
	}

	@Override
	public void Output() {
		System.out.println(elem + " elem output ");
	}
	
}
class Composite implements Composite_inter {

	List<Composite_inter> elements = new ArrayList<Composite_inter>();

	@Override
	public void Output() {
		for (Composite_inter element : elements) {
			element.Output();
		}
	}

	public void add(Composite_inter element) {
		elements.add(element);
	}

	public void remove(Composite_inter element) {
		elements.remove(element);
	}

	public List<Composite_inter> getComponents() {
		return elements;
	}
	
}
public class CompositeExample {
	public static void main(String[] args) {

		Elem elem1 = new Elem("A");
		Elem elem2 = new Elem("B");
		Elem elem3 = new Elem("C");
		Elem elem4 = new Elem("D");
		
		Composite comp1 = new Composite();
		comp1.add(elem1);
		comp1.add(elem2);
		Composite comp2 = new Composite();
		comp2.add(elem3);
		comp2.add(elem4);
		Composite comp3 = new Composite();
		comp3.add(comp1);
		comp3.add(comp2);
		System.out.println("comp1:");
		comp1.Output();
		System.out.println("comp2:");
		comp2.Output();
		System.out.println("comp3:");
		comp3.Output();

	}
}
