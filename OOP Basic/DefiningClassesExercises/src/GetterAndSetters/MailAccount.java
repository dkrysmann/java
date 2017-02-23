package GetterAndSetters;


public class MailAccount {
    private String username;
    private int userId;

    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }

 public int getUserId(){
     return this.userId;
 }
 public void setUserId(int userId){
     this.userId = userId;
 }
 public void showInfo(String username,int userId){
     this.username = username;
     this.userId = userId;
     System.out.printf("Username:%s%nUserId:%d",username,userId);
 }

}
