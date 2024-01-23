public class App {
    public static void main(String[] args) throws Exception {
        String dateInput = "12-02-2024";
        int a = -1;
        // Holidays confraternizaçãoMundial = new Holidays("01-01-2024","Confraternização Mundial");
        // Holidays carnaval1 = new Holidays("12-02-2024","Carnaval");
        // Holidays carnaval2 = new Holidays("13-02-2024","Carnaval");
        // Holidays sextafeiraSanta = new Holidays("29-03-2024","Sexta-feira Santa");
        // Holidays tiradentes = new Holidays("21-04-2024","Tiradentes");        

        Holidays[] holidaysArray = {
            new Holidays("01-01-2024", "Confraternização Mundial"),
            new Holidays("12-02-2024", "Carnaval"),
            new Holidays("13-02-2024", "Carnaval"),
            new Holidays("29-03-2024", "Sexta-feira Santa"),
            new Holidays("21-04-2024", "Tiradentes"),
            new Holidays("01-05-2024", "Dia do Trabalho"),
            new Holidays("30-05-2024", "Corpus Christi"),
            new Holidays("07-09-2024", "Independência do Brasil"),
            new Holidays("12-10-2024", "Nossa Senhora Aparecida"),
            new Holidays("02-11-2024", "Finados"),
            new Holidays("15-11-2024", "Proclamação da República"),
            new Holidays("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"),
            new Holidays("25-12-2024", "Natal")
        };
        
        
        for(int i = 0 ; i < holidaysArray.length ; i++){
            if(dateInput == holidaysArray[i].getDate()){
                a = i;
            }
        }
        if(a >=0){
            System.out.println(holidaysArray[a].getDate() + " é feriado de " + holidaysArray[a].getHolidayName());
        } else {
            System.out.println(holidaysArray[a].getDate() + " Não é feriado");
        }

        // System.out.println(holidaysArray);
    }
}
