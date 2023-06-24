
public class Time {
    private int hour;
    private int minute;
    private boolean isAM;

    public Time(int hour, int minute, boolean isAM) {
        this.hour = hour;
        this.minute = minute;
        this.isAM = isAM;
    }

    public String to12HourString() {
        String timeString = "";
        int displayHour = hour;
        if (displayHour == 0) {
            timeString = "12:";
        } else if (displayHour > 12) {
            displayHour -= 12;
            timeString = displayHour + ":";
        } else {
            timeString = displayHour + ":";
        }

        if (minute < 10) {
            timeString += "0" + minute;
        } else {
            timeString += minute;
        }

        if (isAM) {
            timeString += " AM";
        } else {
            timeString += " PM";
        }

        return timeString;
    }

    public String to24HourString() {
        String timeString = "";
        if (isAM && hour == 12) {
            timeString = "00:";
        } else if (isAM) {
            timeString = String.format("%02d", hour) + ":";
        } else if (!isAM && hour == 12) {
            timeString = "12:";
        } else {
            timeString = String.format("%02d", hour + 12) + ":";
        }

        if (minute < 10) {
            timeString += "0" + minute;
        } else {
            timeString += minute;
        }

        return timeString;
    }
}

public class ProTime {
    public static void main(String[] args) {
        Time time1 = new Time(12, 30, true);
        System.out.println("12-hour format: " + time1.to12HourString());
        System.out.println("24-hour format: " + time1.to24HourString());

        Time time2 = new Time(17, 45, false);
        System.out.println("12-hour format: " + time2.to12HourString());
        System.out.println("24-hour format: " + time2.to24HourString());
    }
}
