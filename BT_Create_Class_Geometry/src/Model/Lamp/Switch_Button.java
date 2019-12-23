package Model.Lamp;

public class Switch_Button {
    private boolean switchOn = true;
    private boolean switchOff = false;
    private boolean connecttoLamp;

    public Switch_Button(){}

    public Switch_Button(boolean switchOn, boolean switchOff, boolean connecttoLamp) {
        this.switchOn = switchOn;
        this.switchOff = switchOff;
        this.connecttoLamp = connecttoLamp;
    }

    public boolean isSwitchOn() {
        return switchOn;
    }

    public void setSwitchOn(boolean switchOn) {
        this.switchOn = switchOn;
    }

    public boolean isSwitchOff() {
        return switchOff;
    }

    public void setSwitchOff(boolean switchOff) {
        this.switchOff = switchOff;
    }

    public boolean isConnecttoLamp() {
        return connecttoLamp;
    }

    public void setConnecttoLamp(boolean connecttoLamp) {
        this.connecttoLamp = connecttoLamp;
    }
    public boolean bat(){
        return this.switchOff = true;
    }
    public boolean tat(){
        return this.switchOn = false;
    }
    @Override
    public String toString() {
        return "Switch_Button : " +
                "SwitchOn = " + switchOn + "\n" + "SwitchOff = " + switchOff + "\n" + "ConnecttoLamp = " + connecttoLamp;
    }
}
