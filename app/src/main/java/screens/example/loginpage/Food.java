package screens.example.loginpage;

public class Food {
    private String amount;
    private String name;
    private String price;
    private String store;

    public Food() {
    }


    public Food(String amount, String name, String price, String store) {
        this.amount = amount;
        this.name = name;
        this.price = price;
        this.store = store;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }
}
