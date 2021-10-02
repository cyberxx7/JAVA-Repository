package chapterThreeExercises;

public class Bike {

    private boolean isOn;
    private int speed;
    private int gear;

    public Bike(boolean isOn, int speed, int gear) {

        this.isOn = isOn;
        this.speed = speed;
        this.gear = gear;
    }


    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate() {
        if (gear == 1) {
            speed = 1 + speed;
        }
        if (gear == 2) {
            speed = speed + 2;
        }
        if (gear == 3) {
            speed = speed + 3;
        }
        if (gear == 4) {
            speed = speed + 4;
        }

    }

        public void setGear ( int gear){
            this.gear = gear;
        }

        public int getGear () {
            return gear;
        }

    }












