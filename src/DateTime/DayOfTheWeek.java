package DateTime;

public class DayOfTheWeek {

  public String dayOfTheWeek(int day, int month, int year) {

    String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    int[]t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6,2,4 };

    if(month<3){
      --year;
    }

    int d = (year + year/4 - year/100 + year/4 + t[month-1] + day) %7;

    return days[d-1];
  }

  public static void main(String[] args) {

  }

}
