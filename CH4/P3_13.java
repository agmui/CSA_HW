package CH4;

public class P3_13 {
    String name;
    public P3_13(String name){
        this.name = name;
    }
    public String sayHello(){
        return "hi "+this.name;
    }
    public String sayGoodBye(){
        return "bye "+this.name;
    }
    public String refuseHelp(){
        return "I am sorry, "+this.name+". I amd affraid I can't do that.";
    }
}
