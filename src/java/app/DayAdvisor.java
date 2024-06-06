package app;

public class DayAdvisor implements Advisor {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("It's a weekday, try to be productive at work!");
                break;
            case FRIDAY:
                System.out.println("Happy friday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend, i recommend visiting a park or a movie theater");
                break;
        }
    }
}

