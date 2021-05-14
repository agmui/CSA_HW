package AP_FRQ.CH_9;

public class Book {
    private String title;
    private String author;
    public Book(String t, String a) {
        title = t;
        author = a;
    }
    public void printBookInfo() {
        System.out.print(title + ", written by " + author);
    }
}

class PictureBook extends Book{
    private String illustrator;
    public PictureBook(String t, String a, String i) {
        super(t, a);
        illustrator = i;
    }
    public void printBookInfo(){
        super.printBookInfo();
        System.out.print(" and illustrated by " + illustrator);
    }

    public static void main(String[] args) {
        PictureBook myBook = new PictureBook("Peter and Wendy", "J.M. Barrie", "F.D. Bedford");
        myBook.printBookInfo();
        Book book1 = new Book("Frankenstein", "Mary Shelley");
        PictureBook book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
        BookListing listing1 = new BookListing(book1, 10.99);
        listing1.printDescription();
        BookListing listing2 = new BookListing(book2, 12.99);
        listing2.printDescription();
    }
}

class BookListing{
    Book b;
    PictureBook pb;
    double p;
    public BookListing(Book b, double p){
       this.b = b;
       this.p = p;
    }
    public BookListing(PictureBook b, double p){
        this.pb = b;
        this.p = p;
    }
    public void printDescription(){
        if (b == null) {
            this.pb.printBookInfo();
        } else {
            this.b.printBookInfo();
        }
        System.out.println(", "+this.p);
    }
}


class Animal{
    String type, a, name;
    public Animal(String type, String a, String name){
        this.type = type;
        this.a = a;
        this.name = name;
    }
    public String toString(){
        return name+" the "+a+" is a "+type;
    }

    public static void main(String[] args) {
        Animal lisa = new Animal("carnivore", "lion", "Lisa");
        System.out.println(lisa.toString());
        Herbivore gary = new Herbivore("giraffe", "Gary");
        System.out.println(gary.toString());
        Elephant percy = new Elephant("Percy", 2.0);
        System.out.println(percy.toString());
    }
}
class Herbivore extends Animal{
    public Herbivore(String a, String name){
        super("herbivore", a, name);
    }
}
class Elephant extends Herbivore{
    double len;
    public Elephant(String name, double len){
        super("elephant", name);
        this.len = len;
    }

    @Override
    public String toString() {
        return super.name+" the elephant is a herbivore with tusks "+this.len+" meters long";
    }
}
