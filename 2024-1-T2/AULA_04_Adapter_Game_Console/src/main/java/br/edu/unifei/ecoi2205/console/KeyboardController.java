package br.edu.unifei.ecoi2205.console;
public class KeyboardController extends Controller {
    public KeyboardController(String id) {
        super(id, "keyboard");
        super.setConnected(true);
    }
    @Override
    public String testJumpKey() {
        return new String(getIdentifier() + " space key tested...");
    }
    @Override
    public String testRightKey() {
        return new String(getIdentifier() + " D key tested...");
    }
    @Override
    public String testLeftKey() {
        return new String(getIdentifier() + " A key tested...");
    }
}