package space.harbour.sunget;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Public class to set and get
 * condition and forecast
 */
public class Item extends RealmObject {
    Condition condition;
    RealmList<Forecast> forecast;

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public RealmList<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(RealmList<Forecast> forecast) {
        this.forecast = forecast;
    }
}
