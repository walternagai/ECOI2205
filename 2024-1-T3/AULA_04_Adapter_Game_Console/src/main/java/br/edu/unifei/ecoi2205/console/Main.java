package br.edu.unifei.ecoi2205.console;

public class Main {
    public static void main(String[] args) {
        Console myConsole = new Console();
        myConsole.addController(new ControllerAdapter(new
                KeyboardController("keyBrand")));
        myConsole.addController(new ControllerAdapter(new
                JoystickController("joy1")));
        myConsole.addController(new ControllerAdapter(new
                JoystickController("joy2")));
        myConsole.addController(new ControllerAdapter(new
                JoystickController("joy3")));
        myConsole.addController(new ControllerAdapter(new
                JoystickController("joy4")));
        myConsole.turnOn();
        myConsole.checkControllers();
        myConsole.turnOff();
        myConsole.disconnect("joy2");
        myConsole.disconnect("joy3");
        myConsole.turnOn();
        myConsole.checkControllers();
        myConsole.turnOff();
    }
}
