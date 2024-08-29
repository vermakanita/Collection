class CCons{
    String name;
    int id;

    public void info(){
        System.out.println(this.name);
        System.out.println(this.id);
    }
    CCons(CCons c2){
        this.name= c2.name;
        this.id= c2.id;
        
    }
    CCons(){

    }
}




public class CopyCons {
    CCons c1= new  CCons();
    c1.name="kanita";
    c1.id=23;


    CCons c2 = new CCons(c1);
    c2.info();

    
     
    
    
}
