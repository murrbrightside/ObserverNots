import java.util.Scanner;

public class SmartPhone implements Observer{
    private String version;
    @Override
    public void update(String version) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите ли вы обновить версию? ");
        String input = scanner.nextLine();
        if (input.equals("Yes")) this.version = version;
        scanner.close();

    }
}
