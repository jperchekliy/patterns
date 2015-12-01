class A {
    public void A1() { System.out.println("A1"); }
    public void A2() { System.out.println("A2"); }
    
}

class B {
    public void B1() { System.out.println("B1"); }
}

class C {
    public void C1() { System.out.println("C1"); }
}

class Facade {
    private A a;
    private B b;
    private C c;

    public Facade(A a,B b,C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void start() {
    	System.out.println("Start");
    	a.A1();
    	a.A2();
    	b.B1();
    	c.C1();
    }
}

class FacadeExample {
    public static void main(String[] args) {
    	A a = new A();
    	B b = new B();
    	C c = new C();
    	Facade facade = new Facade(a, b, c);
	    facade.start();
    }
}