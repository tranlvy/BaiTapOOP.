public class TestBook {
    public static void main(String[] args){
        Author ahTeck = new Author( " Tan Ah Teck ", " ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);
        ahTeck.setEmail( " paulTan@nowhere.com ");
        System.out.println( " name is: " + ahTeck.getName());
        System.out.println( " email is: " + ahTeck.getEmail());
        System.out.println( " gender is: " + ahTeck.getGender());
        Author[] authors = new Author[] {new Author( " Tan Ah Teck ", " AhTeck@somewhere.com ", 'm'), new Author( " Paul Tan ", " Paul@nowhere.com ", 'm')};
        Book javaDummy = new Book(" Java for Dummy ", authors, 19.99, 99);
        System.out.println(javaDummy);
        System.out.println( javaDummy.getAuthorNames());
    }
}
