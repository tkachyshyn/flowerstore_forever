package order;

public interface User {
    String status = "";
    String id = Order.generateID();

    void update(String str);
}
