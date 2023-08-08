public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println("This notebook is very light.");
        } else if (this.weight > 600 && this.weight < 2000) {
            System.out.println("The notebook is not very heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }

    }
    public void checkYearAndPrice() {
        if (this.year < 2006 && this.price < 600) {
            System.out.println("This notebook is mediocre.");
        } else if (this.year < 2019 && this.price > 1000) {
            System.out.println("This notebook is great.");
        } else {
            System.out.println("This notebook is not very good");
        }
    }

}
