package br.edu.unifei.ecoi2205.console;
import java.util.ArrayList;
public class Console {
    private ArrayList<ControllerAdapter> controllerAdapters;
    public Console() {
        controllerAdapters = new ArrayList<>();
    }
    public void addController(ControllerAdapter controllerAdapter) {
        controllerAdapters.add(controllerAdapter);
    }
    public void checkControllers() {
        System.out.println("Checking controllers...");
        for(int i = 0; i < controllerAdapters.size(); i++)
            System.out.println(controllerAdapters.get(i).status());
    }
    public void turnOn() {
        System.out.println("Turning the console on...");
    }
    public void turnOff() {
        System.out.println("Turning the console off...\n");
    }
    public void disconnect(String identifier) {
        for(ControllerAdapter controllerAdapter : controllerAdapters)
            if
            (controllerAdapter.getController().getIdentifier().equals(identifier)) {
                controllerAdapter.getController().setConnected(false);
            }
    }
}
