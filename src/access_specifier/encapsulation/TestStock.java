package access_specifier.encapsulation;

import util.ColorCodes;

import java.util.Locale;
import java.util.Scanner;

public class TestStock {
    //?Pratik Sherdiwala (Codelytics)
    public static final String ANSI_RED = "\u001B[31m";

    private static void printStockDetail(Stock stock) {
        String variable = (stock.isProfitable()) ? ColorCodes.GREEN : ColorCodes.RED;
        System.out.println(stock.getName().toUpperCase(Locale.ROOT) + "\t\t\t" + stock.getTotalInvestment());
        System.out.println(variable + "" + (stock.getSellPrice() - stock.getBuyPrice()) * stock.getQuantity() + "" + variable);
        System.out.println(ColorCodes.RESET);
    }

    public static void main(String[] args) {

        //5 Stocks

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            System.out.println(ColorCodes.YELLOW_BOLD + "Enter Stock name" + ColorCodes.YELLOW_BOLD);
            String name = scanner.next();
            System.out.println("Enter quantity");
            int quantity = scanner.nextInt();
            System.out.println("Enter buy price:");
            double buyPrice = scanner.nextDouble();
            System.out.println("Enter Sell price:");
            double sellPrice = scanner.nextDouble();

            printStockDetail(new Stock(name, buyPrice, quantity, sellPrice));
        }
    }
}
