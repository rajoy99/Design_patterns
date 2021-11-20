public class SboxOnCommand implements Command {

    Soundbox sbox; 

    public SboxOnCommand(Soundbox sbox) {
        this.sbox = sbox;
    }

    public void execute(){
        sbox.on();
    }


}