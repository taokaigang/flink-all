package self.day9.one;

public class NetworkUser {
    int ID;
    int password;
    String email;


    NetworkUser(int ID,int password) {
        /*this.ID=ID;
        this.password=password;
        email=ID+"@qf.com";*/
        this(ID,password,ID+"@qf.com");
    }

    NetworkUser(int ID,int password,String email){
        this.ID=ID;
        this.password=password;
        this.email=email;
    }




}
