import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        while (true) {
            System.out.print("Write days: ");
            int day = scan.nextInt();

            System.out.print("Write language: ");
            String lang = scan1.nextLine().toLowerCase().replace(" ", "");


            switch (day) {
                case 1 -> System.out.println(Days.MONDAY.languages(lang) + " куну сабака саат 5-те барыш керек!");
                case 2 -> System.out.println(Days.TUESDAY.languages(lang) + " куну практикалык сабактар болот.");
                case 3 -> System.out.println(Days.WEDNESDAY.languages(lang) + "куну Soft skills сабагы болот");
                case 4 -> System.out.println(Days.THURSDAY.languages(lang) + " куну англис тили сабагы отулот");
                case 5 -> System.out.println(Days.FRIDAY.languages(lang) + " куну 'Мафия' ойнойбуз");
                case 6 -> System.out.println(Days.SATURDAY.languages(lang) + " куну досторум менен эс алам");
                case 7 -> System.out.println(Days.SUNDAY.languages(lang) + "куну уйдогу жумуштар менен алек болом");

                default -> throw new IllegalStateException("Unexpected value: " + day);
            }
        }
    }
}