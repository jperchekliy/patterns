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
 class MyTopic implements Subject {
	 
    private List<Observer> observers;
    private String message;
   

    public MyTopic(){
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
     
    //method to post message to the topic
    public void postMessage(String msg){
        
        this.message=msg;
       
        getUpdate();
    }
 
}
 class Subscriber implements Observer {
    
    private String message;
    private Subject topic;
     
    public Subscriber(Subject topic){
        this.topic=topic;
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
	    private Subject topic;
	     
	    public Subscriber1(Subject topic){
	        this.topic=topic;
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
        //create subject
        MyTopic topic = new MyTopic();
         
        //create observers
        Observer obj1 = new Subscriber(topic);
        Observer obj2 = new Subscriber1(topic);
         
        //register observers to the subject
       topic.register(obj1);
       topic.register(obj2);
         
        
         
        //now send message to subject
        topic.postMessage("New Message1");
        topic.postMessage("New Message2");
        topic.postMessage("New Message3");
    }
}
