public class Calendar {
  private Holiday[] holidays;

  public Calendar(Holiday[] holidays) {
    this.holidays = holidays;
  }

  public Holiday[] getHolidays() {
    return holidays;
  }

  public String getHolidayByDate(String date) {
    for (int i = 0; i < holidays.length; i++) {
      if (holidays[i].getDate().equals(date)) {
        return holidays[i].getName();
      }
    }
    return "No holiday found";
  }
}