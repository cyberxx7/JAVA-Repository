package Mp3OOP;

public class Mp3 {

    private boolean isOn;


    public void turnOn() {
        isOn = true;
    }


    public boolean isOn() {
        return isOn;
    }

    public void turnOff() {
        isOn = false;
    }

    public DefaultPlaylist haveDefaultPlaylist() {
        return new DefaultPlaylist();
    }
}
