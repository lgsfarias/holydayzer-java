public class Calendar {
  private Holiday[] holidays;

  public Calendar(Holiday[] holidays) {
    this.holidays = holidays;
  }

  public Holiday[] getHolidays() {
    return holidays;
  }
}