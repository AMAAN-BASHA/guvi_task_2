import java.util.Scanner;
class Product {// program for calculate and return the total amount spent on all products
    int pid;
    double price;
    int quantity;


    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}
class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number's of are there in the pid : ");
        int n = scanner.nextInt();
        Product[] products = new Product[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Enter product ID, price, and quantity for product " + (i + 1) + ":");
            int pid = scanner.nextInt();
            double price = scanner.nextDouble();
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }


        int highestPricePid = findHighestPriceProduct(products);
        System.out.println("Product ID with the highest price: " + highestPricePid);


        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);
    }


    public static int findHighestPriceProduct(Product[] products) {
        int highestPricePid = products[0].pid;
        double highestPrice = products[0].price;

        for (Product product : products) {
            if (product.price > highestPrice) {
                highestPrice = product.price;
                highestPricePid = product.pid;
            }
        }
        return highestPricePid;
    }


    public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;

        for (Product product : products) {
            totalAmount += product.price * product.quantity;
        }
        return totalAmount;
    }
}

