public class Earth {

    private static Earth earth=null ;
    public int mass;

    private Earth(){
        mass = 20000;
    }

    public static Earth createearth(){
        if (earth==null){
            earth= new Earth();
            System.out.println("One and only Earth Created");
            
        }

        else{
            System.out.println("Earth Already Exists! ");
        }

        return earth;
    }



}