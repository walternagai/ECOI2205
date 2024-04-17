package br.edu.unifei.ecoi2205.console;

public abstract class Controller {
    private String identifier;
    private boolean connected;
    private String type;
    public Controller(String identifier, String type) {
        this.identifier = identifier;
        this.type = type;
        connected = false;
    }
    public String getIdentifier() {
        return this.identifier;
    }
    public String getType() {
        return this.type;
    }
    public void setConnected(boolean connected) {
        this.connected = connected;
    }
    public boolean isConnected() {
        return this.connected;
    }
    public abstract String testJumpKey();
    public abstract String testRightKey();
    public abstract String testLeftKey();
}