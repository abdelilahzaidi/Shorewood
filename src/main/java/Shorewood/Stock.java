package Shorewood;

public class Stock {
    public enum StockType{
        cuir,
        or,
    }
    private int quantity;
    private int stock;

    public Stock(int quantity, int stock) {
        this.quantity = quantity;
        this.stock = stock;
    }
}
