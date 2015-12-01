interface Command{
    void execute();
}
class OnSoundCommand implements Command{
   private Sound Sound;

   public OnSoundCommand(Sound sound){
        this.Sound=sound;
       }

   public void execute(){
	   Sound.On();
   }
}

class OffSoundCommand implements Command{
   private Sound Sound;

   public OffSoundCommand(Sound sound){
        this.Sound=sound;
       }

   public void execute(){
	   Sound.Off();
   }
}
class Control {
    private Command OnCommand;
    private Command OffCommand;

    public Control(Command onCommand,Command offCommand){
         this.OnCommand=onCommand;
         this.OffCommand=offCommand;
    }

    public void On(){
    	OnCommand.execute();
    }
    
    public void Off(){
    	OffCommand.execute();
    }
}
class Sound{
     public Sound(){  }
   
     public void On(){
        System.out.println("Sound on");
     }

     public void Off(){
        System.out.println("Sound off");
     }
}
public class CommandExample{
   public static void main(String[] args){
	   Sound sound=new Sound();
       Command On=new OnSoundCommand(sound);
       Command Off=new OffSoundCommand(sound);
       Control control=new Control(On,Off);
       control.On();
       control.Off();
   }
}