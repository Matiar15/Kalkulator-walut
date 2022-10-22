import java.util.Objects;
import java.util.Scanner;
import java.util.HashMap;
public class Program123 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        HashMap<String, Double> currencies = new HashMap<>();
        String takenFirstCurrency, takenSecondCurrency;
        int i = 0;
        double amountOfCurrency, takenFirstValue = 0, takenSecondValue = 0, finalValue;
        // Tworzenie bazowych walut na potrzebę zmiany waluty
        currencies.put("Euro", 4.7804);
        currencies.put("Lira turecka", 0.2635);
        currencies.put("Dolar amerykański", 4.900);
        currencies.put("Frank szwajcarski", 4.8520);

        System.out.println("Do wyboru spośród tych walut wybierz tą, którą chcesz przewalutować: ");
        // For each loop, żeby ładnie wyświetlić wszystkie możliwości
        for (String key : currencies.keySet()) {
            System.out.println(key);
        } takenFirstCurrency = userInput.nextLine();
        // Pętla, która ma zadanie zmusić Usera do dobrej odpowiedzi
        while (i == 0) {
            for (String key : currencies.keySet()) {
                if (Objects.equals(takenFirstCurrency, key)) {
                    i++;
                }
                }
            if (i == 0) {
                System.out.println("Wprowadź dobrze walutę: ");
                takenFirstCurrency = userInput.nextLine();
                }
            }
        System.out.println("Wprowadź ilość waluty: ");
        amountOfCurrency = userInput.nextDouble();
        userInput.nextLine();
        System.out.println("Wprowadź walutę na którą " + takenFirstCurrency + " zostanie zmieniona: ");
        takenSecondCurrency = userInput.nextLine();
        // Pętla do drugiej wartości
        while (i == 1) {
            for (String key : currencies.keySet()) {
                if (Objects.equals(takenSecondCurrency, key) && !Objects.equals(takenFirstCurrency,
                        takenSecondCurrency)) {
                    takenFirstValue = currencies.get(takenFirstCurrency);
                    takenSecondValue = currencies.get(takenSecondCurrency);
                    i++;
                    }
                }
            if (i == 1) {
                System.out.println("Wprowadź dobrze walutę: ");
                takenSecondCurrency = userInput.nextLine();
            }
            }
        System.out.println("Ilość waluty: " + takenSecondCurrency + " wynosi: ");
        finalValue = (takenFirstValue * amountOfCurrency / takenSecondValue);
        System.out.printf("%.2f", finalValue);
        }
    }




