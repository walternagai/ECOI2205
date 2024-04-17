package br.edu.unifei.ecoi2205.console;
public class ControllerAdapter implements IControllerCommands {
    private Controller controllerAdaptee;
    public ControllerAdapter(Controller controller) {
        this.controllerAdaptee = controller;
    }
    public Controller getController() {
        return this.controllerAdaptee;
    }
    @Override
    public String status() {
        String msg = controllerAdaptee.getIdentifier() + " disconnected";
        if (controllerAdaptee.isConnected()) {
            msg = controllerAdaptee.getIdentifier() + " connected\n";
            msg += testJumpCommand() + "\n";
            msg += testRightCommand() + "\n";
            msg += testLeftCommand();
            return new String(msg);
        }
        return msg;
    }
    @Override
    public String testJumpCommand() {
        return controllerAdaptee.testJumpKey();
    }
    @Override
    public String testRightCommand() {
        return controllerAdaptee.testRightKey();
    }
    @Override
    public String testLeftCommand() {
        return controllerAdaptee.testLeftKey();
    }
}