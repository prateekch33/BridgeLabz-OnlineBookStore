package org.example;

public class OrderProcessing {
    private String selectedBookName;
    private int quantity;

    public int getQuantity() {
        return this.quantity;
    }

    public String getSelectedBookName() {
        return this.selectedBookName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setSelectedBookName(String selectedBookName) {
        this.selectedBookName = selectedBookName;
    }

    public boolean orderBook(int bookCount) {
        if(quantity<bookCount) {
            return false;
        }
        quantity-=bookCount;
        return true;
    }
}
