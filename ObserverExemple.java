import java.util.ArrayList;
import java.util.List;

 interface Subject {
    public void register(Observer obj);
    public void unregister(Observer obj);
    public void notifyObservers();
  
}
 interface Observer {
    public void update(String message);
}
 class MySub implements Subject {
	 
    private List<Observer> observers;
    private String message;
   

    public MySub(){
        observers=new ArrayList<>();
    }
    @Override
    public void register(Observer obj) {
         observers.add(obj);
    }
 
    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }
 
    @Override
    public void notifyObservers() {
        
        for (Observer obj : observers) {
            obj.update(message);
        }
 
    }
 
  
    public void getUpdate() {
    	notifyObservers();
    }
     
    public void postMessage(String msg){
        
        this.message=msg;
       
        getUpdate();
    }
 
}
 class Subscriber implements Observer {
    
    private String message;
    private Subject sub;
     
    public Subscriber(Subject sub){
        this.sub=sub;
        sub.register(this);
    }
    @Override
    public void update(String message) {
    	 this.message=message;
    	 displey();
    }
 
   
    public void displey() {
    	System.out.println("Message Posted: "+message);
    }
 
}
 class Subscriber1 implements Observer {
	    
	    private String message;
	    private Subject sub;
	     
	    public Subscriber1(Subject sub){
	        this.sub=sub;
	        sub.register(this);
	    }
	    @Override
	    public void update(String message) {
	    	 this.message=message;
	    	 displey();
	    }
	 
	   
	    public void displey() {
	    	System.out.println("Message Posted1: "+message);
	    }
	 
	}
public class ObserverExemple {
	public static void main(String[] args) {
        
		MySub sub = new MySub();

        Subscriber obj1 = new Subscriber(sub);
        Subscriber1 obj2 = new Subscriber1(sub);

        sub.postMessage("New Message1");
        sub.postMessage("New Message2");
        sub.postMessage("New Message3");
    }
}
