package exercises;

import java.io.NotActiveException;
import java.util.*;

public class DailyPlanner {

    private final List<DaySchedule> days;

    public DailyPlanner(){
        this(new ArrayList<>());
    }

    public DailyPlanner(List<DaySchedule> days){
        this.days= days == null
                ? new ArrayList<>()
                : new ArrayList<>(days);
    }

    public Map<DaysEnum, List<String>> getActivitiesForDayOfTheWeek(DaysEnum day){
        Map<DaysEnum, List<String>> result = new HashMap<>();
        if(day != null) {

            for (DaySchedule daySchedule : days) {
                if (daySchedule.getDay().equals(day)) {
                    result.put(day, daySchedule.getActivities());
                }
            }
        }

        return result;
    }

    public Map<DaysEnum, List<String>> addActivity(DaysEnum day, String activityToAdd) throws NoActivityException {
        Map<DaysEnum, List<String>> result = new HashMap<>();
        if( activityToAdd==null){
            throw new NoActivityException("Nicio activitate");
        }else{
            for (DaySchedule daySchedule : days){
                if (daySchedule.getDay().equals(day)){
                    result.put(day, Collections.singletonList((activityToAdd)));
                    daySchedule.getActivities().add(activityToAdd);
                }
            }
            return result;
        }

   }
}
