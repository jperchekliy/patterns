class Model {
   private String id;
   private String name;
   
   public String getid() {
      return id;
   }
   
   public void setid(String id) {
      this.id = id;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
}
class PersonView {
	   public void print(String PersonName, String Personid){
	      System.out.println("Person: ");
	      System.out.println("id: " + Personid);
	      System.out.println("Name: " + PersonName);
	   }
	}
class PersonController {
	   private Model model;
	   private PersonView view;

	   public PersonController(Model model, PersonView view){
	      this.model = model;
	      this.view = view;
	   }

	   public void setName(String name){
	      model.setName(name);		
	   }

	   public String getName(){
	      return model.getName();		
	   }

	   public void setid(String id){
	      model.setid(id);		
	   }

	   public String getid(){
	      return model.getid();		
	   }

	   public void updateView(){				
	      view.print(model.getName(), model.getid());
	   }	
	}
public class MVCExample {
	 public static void main(String[] args) {
	      Model model  = new Model();
	      PersonView view = new PersonView();
	      PersonController controller = new PersonController(model, view);
	      controller.setName("Name1");
	      controller.setid("1");
	      controller.updateView();
	      controller.setName("Name2");
	      controller.setid("2");
	      controller.updateView();
	   }
	 }
