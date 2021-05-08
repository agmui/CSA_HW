package AP_FRQ.CH_5;

//FRQ Question 1
public class Invitation {
    private String hostName;
    private String address;
    public Invitation(String n, String a) {
        hostName = n;
        address = a;
    }
    //a
    public String gitHostName(){
        return hostName;
    }
    //b
    public void updateAddress(String new_address){
        address=new_address;
    }
    //c
    public String invite(String name){
        return "Dear "+ name+" , please attend my event at "+address+" . See you\n" + "then, "+hostName+".\n";
    }
    //d
    public Invitation(String address_){
        address = address_;
        hostName = "Host";
    }
}

//FRQ Question 2
class PasswordGenerator{
    String pre;
    int len;
    static int count;
    public PasswordGenerator(int len){
        this.len = len;
        this.pre = "A.";
    }
    public PasswordGenerator(int len, String pre){
        this.len = len;
        this.pre = pre+".";
    }
    public int pwCount(){
        return count;
    }
    public String pwGen(){
        count++;
        return this.pre+(int)Math.floor(Math.random()*((Math.pow(10,len)-1)-Math.pow(10,len-1)+1)+Math.pow(10,len-1));
    }
    public static void main(String[] args) {
        PasswordGenerator pw1 = new PasswordGenerator(4, "chs");
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwCount());
        PasswordGenerator pw2 = new PasswordGenerator(6);
        System.out.println(pw2.pwCount());
        System.out.println(pw2.pwGen());
        System.out.println(pw2.pwCount());
        System.out.println(pw1.pwCount());
    }
}