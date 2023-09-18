package enumclass;

public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public static boolean printTodaysThought(Day theDay) {
        switch (theDay) {
            case MONDAY:
                return true;
            case TUESDAY:
                break;
            case WEDNESDAY:
                return false;
            case THURSDAY:
                return true;
            case FRIDAY:
                return false;
            case SATURDAY:
                return true;
            default:
                return true;
        }
        return false;
    }
    }
