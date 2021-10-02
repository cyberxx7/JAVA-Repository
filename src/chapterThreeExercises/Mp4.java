package chapterThreeExercises;

public class Mp4 {
    private boolean Ison;
    private int volume;

    public void setOn(boolean turnOn) {
    Ison = turnOn;
    }

    public boolean getIson() {
        return Ison;
    }

    public void increaseVolume() {
    volume = volume + 1;
    }

    public int getVolume() {
    return volume;
    }

    public void decreaseVolume() {
    volume = volume - 1;
    }
}
