package order;

public class Sender implements User{
    private String status;
    @Override
    public void update(String str) {
        status = str;
    }
}
