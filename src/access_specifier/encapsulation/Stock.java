package access_specifier.encapsulation;

/*
 *
 *  15 Shares = Reliance => 1000
 *  => investment = quantity * buyPrice
 *  => 1100 = sellPrice
 * */

public class Stock {
    //?Pratik Sherdiwala (Codelytics)
    private String name;
    private double buyPrice;
    private int quantity;
    private double sellPrice;
    private boolean isProfitable;
    private double totalInvestment;

    Stock(
            String name,
            double buyPrice,
            int quantity,
            double sellPrice
    ) {
        this.name = name;
        this.buyPrice = buyPrice;
        this.quantity = quantity;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double getTotalInvestment() {
        return quantity * buyPrice;
    }

    public boolean isProfitable() {
        double finalPrice = sellPrice - buyPrice;

        //! 1st way
//        if(finalPrice > 0) {
//            return true;
//        } else {
//            return false;
//        }

        //! 2nd way
//        if (finalPrice > 0) return true;
//        else return false;

        //! 3rd Way
        // return (sellPrice - buyPrice) > 0 ? true : false;

        //! 4th Way
        return (sellPrice - buyPrice) > 0;
    }
}
