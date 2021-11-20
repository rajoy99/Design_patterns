public class Main {

    public static void main(String[] args){


        Bird rfid190 = new Pelican();

        Toy batchno_ea6b = new ToyPelican();

        rfid190.fly();

        rfid190.chrip();

        batchno_ea6b.cring();

        System.out.println("     Adapter Pattern Testing : ");

        System.out.println(" --   - I am using a real Bird to make the sound of a Toy  XD XD XD  ---- ");

        Toy adapter_ea6b = new BirdAdapter(rfid190);

        adapter_ea6b.cring();



    }


}