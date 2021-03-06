package space.harbour.sunget;

import io.realm.RealmObject;

/**
 * Public class to set and get
 * the detailed wind information
 * including speed, direction,
 * and chill (cooling effect)
 */
public class Wind extends RealmObject {
    String chill;
    String direction;
    String speed;

    public String getChill() {
        return chill;
    }

    public void setChill(String chill) {
        this.chill = chill;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
