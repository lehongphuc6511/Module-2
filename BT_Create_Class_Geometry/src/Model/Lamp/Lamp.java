package Model.Lamp;

public class Lamp {
    private boolean turnOff = false;
    private boolean turnOn = true;
    private boolean lamp;

    public Lamp(){}

    public Lamp(boolean turnOff, boolean turnOn, boolean lamp) {
        this.turnOff = turnOff;
        this.turnOn = turnOn;
        this.lamp = lamp;
    }

    public boolean isTurnOff() {
        return turnOff;
    }

    public void setTurnOff(boolean turnOff) {
        this.turnOff = turnOff;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public boolean isLamp() {
        return lamp;
    }

    public void setLamp(boolean lamp) {
        this.lamp = lamp;
    }

    public boolean batLamp(){
        return this.turnOff = true;
    }
    public boolean tatLamp(){
        return this.turnOn = false;
    }
    @Override
    public String toString() {
        return "Lamp = "+
                "TurnOff = " + turnOff + "\n" + "TurnOn = " + turnOn;
    }
}
