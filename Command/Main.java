public class Main {

    public static void main(String[] args)

    {

        RemoteControl rctrl = new RemoteControl();

        Light q1_light = new Light();

        rctrl.setCommand(new LightOnCommand(q1_light));

        rctrl.buttonPress();

        Soundbox beats = new Soundbox();

        rctrl.setCommand(new SboxOnCommand(beats));

        rctrl.buttonPress();

    }

}