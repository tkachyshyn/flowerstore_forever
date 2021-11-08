package order;

public class Receiver implements User{
    private String status;
    private String id;
    public void update(String str){
        status = str;
    }
    public String getStatus(){
        return status;
    }

}
