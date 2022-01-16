package exercises;

import java.util.List;
import java.util.Objects;

public class DaySchedule {

    private final DaysEnum day;
    private final List<String> activities;

    public DaySchedule(DaysEnum day, List<String> activities){
        this.day = day;
        this.activities = activities;
    }

    public DaysEnum getDay() {
        return day;
    }

    public List<String> getActivities() {
        return  activities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaySchedule that = (DaySchedule) o;
        return day == that.day && Objects.equals(activities, that.activities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, activities);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "day=" + day +
                ", activities=" + activities +
                '}';
    }
}
