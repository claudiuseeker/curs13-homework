package exercises;

import java.util.Arrays;
import java.util.List;

import static exercises.DaysEnum.*;

public class Main {
    public static void main(String[] args) throws NoActivityException {

        DailyPlanner dailyPlanner = new DailyPlanner(List.of(
                new DaySchedule(MONDAY, Arrays.asList("Swimming", "Cooking", "GoToSchool")),
                new DaySchedule(TUESDAY,Arrays.asList("Eating", "GoToSchool", "Running")),
                new DaySchedule(WEDNESDAY,Arrays.asList("Eating","GoToSchool", "Running")),
                new DaySchedule(THURSDAY,Arrays.asList("Eating", "GoToSchool", "Running")),
                new DaySchedule(FRIDAY,Arrays.asList("Eating","GoToSchool", "Running")),
                new DaySchedule(SATURDAY,Arrays.asList("Eating", "Running")),
                new DaySchedule(SUNDAY,Arrays.asList("Sleeping", "Walking"))
        ));

        System.out.println(dailyPlanner.getActivitiesForDayOfTheWeek(MONDAY));
        System.out.println(dailyPlanner.getActivitiesForDayOfTheWeek(SUNDAY));
        try{
            dailyPlanner.addActivity(SATURDAY,"");

        }catch (NoActivityException ex){
            System.err.println(ex.getMessage());
        }
        dailyPlanner.addActivity(SATURDAY,"Dance");
        System.out.println(dailyPlanner.getActivitiesForDayOfTheWeek(SATURDAY));
    }
}
