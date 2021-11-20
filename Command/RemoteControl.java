public class RemoteControl {

    Command button;

    public RemoteControl() {

    }

    void setCommand(Command command) {
        button= command;

    }
    
    void buttonPress(){
        button.execute();
    }

}