 
 import java.util.ArrayList;
 import java.util.Collection;
 import java.util.Collections;


 class ArrayList1 {
    public static void main(String[] args) {
       ArrayList<String> ar = new ArrayList<>(); 
       ar.add( "kanita");
       ar.add("verma");
       ar.add( "Ana");
       
       System.out.println(ar);
        
           Collection<String> cs = new ArrayList<>();
        Collections.addAll( cs, "kamala","vimal","sagar");
        cs.removeAll(cs);
        cs.addAll(cs);
        System.out.println(cs);
        System.out.println(ar.clone());
    
               


    //    for(int i=0;i<ar.size();i++){ 
    //     System.out.println(ar.get(i));

    //    }

    //    System.out.println(ar);
    //    for(String str:ar){
    //    System.out.println(str);
    //    }
        




    //    System.out.println(ar);//print array list
    //    System.out.println(ar.get(2));//print 2 value
    //    ar.set(1, "golang");//replace
    //    System.out.println(ar);//print replace value
    //    ar.add(1, "dipika");//index add
    //    System.out.println(ar);//shift add
    //    ar.remove(3);//remove index
    //    System.out.println(ar);//print remove array list
    //   System.out.println(ar.contains( "kanita"));//chack value h ya nhi 
    //    System.out.println(ar);
    //    //ar.clear();//c list
    //    System.out.println(ar);
    //    ar.removeAll(ar);
    //    System.out.println(ar);
    //    //System.out.println(ar.isEmpty());




    }
}
