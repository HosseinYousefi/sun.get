package space.harbour.sunget;

import io.realm.RealmObject;

public class Distance extends RealmObject implements Measurement {
    int value;

    public Distance(int value) {
        this.value = value;
    }

    @Override
    public Integer getMetric() {
        return null;
    }

    @Override
    public Integer getImperial() {
        return null;
    }
}
