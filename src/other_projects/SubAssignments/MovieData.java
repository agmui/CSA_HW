package other_projects.SubAssignments;

import java.util.Scanner;

public class MovieData {
    String print;
    public MovieData(String title, String director, int year, double length){
        this.print = title+director+year+length;
    }
    public static void print(MovieData movie){
        System.out.println(movie.print);
    }
    public static void main(String[] args) {
        MovieData m1 = new MovieData("a", "a", 1,1);
        print(m1);
    }
}

class SpeakersBureau{
    String name, topic;
    int num;
    double fee;
    public SpeakersBureau(String name, int num, String topic, double fee){
        this.name=name;
        this.num=num;
        this.topic=topic;
        this.fee=fee;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpeakersBureau[] l = new SpeakersBureau[10];
        System.out.println("Input Validation: When the data for a new speaker is entered, be sure the user enters data for all the fields/ No negative amounts should be entered for a speaker's fee");
        for (SpeakersBureau i: l) {
            System.out.print("name: ");
            String name = sc.next();
            System.out.print("num: ");
            int num = sc.nextInt();
            System.out.print("topic: ");
            String topic = sc.next();
            System.out.print("fee: ");
            double fee = sc.nextDouble();
            i = new SpeakersBureau(name, num, topic, fee);
        }
    }
}
