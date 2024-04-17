package br.edu.unifei.ecoi2205.console;
public class JoystickController extends Controller {
    public JoystickController(String id) {
        super(id, "joystick");
        super.setConnected(true);
    }
    @Override
    public String testJumpKey() {
        return new String(getIdentifier() + " X key tested...");
    }
    @Override
    public String testRightKey() {
        return new String(getIdentifier() + " right key tested...");
    }
    @Override
    public String testLeftKey() {
        return new String(getIdentifier() + " left key tested...");
    }
}
