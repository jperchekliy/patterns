 interface InternetAccess {  
    public void InternetAccess();  
}  
  class Real implements InternetAccess {  
	    private String Name;  
	    public Real(String Name) {  
	        this.Name = Name;  
	    }  
	    @Override  
	    public void InternetAccess() {  
	        System.out.println("Internet Access "+ Name);  
	    }  
	}  
  class Proxy implements InternetAccess {  
      private String Name;  
      private Real  real;  
          public Proxy(String Name) {  
       this.Name = Name;  
   }  
   @Override  
   public void InternetAccess()   
   {  
       if (Role(Name).equals("Boss"))   
       {  
           real = new Real(Name);  
           real.InternetAccess();  
       }   
       else   
       {  
           System.out.println("No Internet");  
       }  
   }  
   public String Role(String Name) {  
       return Name;  
   }  
}  
  class ProxyExample {  
	    public static void main(String[] args)   
	    {  
	    	InternetAccess access = new Proxy("ttt");  
	        access.InternetAccess();  
	        InternetAccess access1 = new Proxy("Boss");  
	        access1.InternetAccess();  
	    }  
	}  