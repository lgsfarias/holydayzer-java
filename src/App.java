public class App {
    public static void main(String[] args) throws Exception {
        Calendar calendar = new Calendar(new Holiday[] {
                new Holiday("Confraternização mundial", "1/1/2022"),
                new Holiday("Carnaval", "1/3/2022"),
                new Holiday("Páscoa", "4/17/2022"),
                new Holiday("Tiradentes", "4/21/2022"),
                new Holiday("Dia do trabalho", "5/1/2022"),
                new Holiday("Corpus Christi", "6/16/2022"),
                new Holiday("Independência do Brasil", "9/7/2022"),
                new Holiday("Nossa Senhora Aparecida", "10/12/2022"),
                new Holiday("Finados", "11/2/2022"),
                new Holiday("Proclamação da República", "11/15/2022"),
                new Holiday("Natal", "12/25/2022"),
        });

        Holiday[] holidays = calendar.getHolidays();

        for (int i = 0; i < holidays.length; i++) {
            System.out.println(holidays[i].getName() + " - " + holidays[i].getDate());
        }
    }
}
