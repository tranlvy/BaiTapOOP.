public class Book {
    private String name;
    private double price;
    private int qty = 0;
    Author author;

    public Book(String name, Author author, double price){
        this.name=name;
        this.author=author;
        this.price=price;
    }

    public Book(String name, Author author, double price, int qty){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public Integer getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty=qty;
    }
    public String toString(){
        return " Book[name=" + name + ",Author[name=" + author.getName() + ",email=" + author.getEmail() + ",gender=" + author.getGender() + "],price=" + price + ",qty=" + qty + "]";
    }

    public String getAuthorName(){
        return author.getName();
    }

    public String getAuthorEmail(){
        return author.getEmail();
    }

    public char getAuthorGender(){
        return author.getGender();
    }



}
