package chapterThreeExercises;

public class Mp3 {

    private boolean IsOn;
    private int volume;


    public Mp3(boolean IsOn, int volume){
        this.IsOn = IsOn;
        this.volume = volume;
    }

    public boolean getIsOn() {
    return IsOn;
    }

    public void setIsOn(boolean IsOn) {
    this.IsOn = IsOn;
    }



    public int getvolume() {
    return volume;
    }

    public void increaseVolume() {
    }
}