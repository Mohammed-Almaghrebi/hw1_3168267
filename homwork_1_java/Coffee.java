
package homwork_1_java;


    public class Coffee<T> {

    String name;

    T price;

    public Coffee(String name, T price) {

        this.name = name;

        this.price = price;

    }

    public void display() {

        System.out.println("Coffee: " + name);

        System.out.println("Price: " + price);

    }

}
    
