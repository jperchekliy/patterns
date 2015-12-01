interface State {
   public void Action();
}
class Start implements State {
	   Main main;
	   public Start(Main main){
		   this.main=main;
	   }
	   public void Action() {
	      System.out.println("Start state!");
	      main.setState(this);	
	   }

	   
	}
class Stop implements State {
	   Main main;
	   public Stop(Main main){
		   this.main=main;
	   }
	   public void Action() {
	      System.out.println("Stop state!");
	      main.setState(this);	
	   }

	   public String toString(){
	      return "Stop State";
	   }
	}
class Main {
	   private State state;

	   public Main(){
	      state = null;
	   }

	   public void setState(State state){
	      this.state = state;		
	   }

	   public State getState(){
	      return state;
	   }
	}
public class StateExample {
	public static void main(String[] args) {
	      Main main = new Main();

	      Start startState = new Start(main);
	      startState.Action();Stop stopState = new Stop(main);
	      stopState.Action();
	      System.out.println(main.getState().toString());
	   }
}
