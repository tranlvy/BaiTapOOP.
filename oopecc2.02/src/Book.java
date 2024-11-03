public class Book {
    private String name;
    private double price;
    private int qty = 0;
    private Author[] authors;

    public Book(String name, Author[] authors, double price){
         this.name = name;
         this.authors = authors;
         this.price = price;
     }

     public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.authors = authors;
     }

     public String getName(){
        return name;
     }

     public Author[] getAuthors(){
        return authors;
     }

     public double getPrice(){
        return price;
     }

     public void setPrice(double price){
        this.price =price;
     }

     public int getQty(){
        return qty;
     }

     public void setQty(int qty){
        this.qty = qty;
     }

     public String toString(){
        return " Book[name=" + name + "authors={" + authors[0] + "," + authors[1] + "},price=" + price + ",qty=" + qty + "]";
     }

     public String getAuthorNames(){
        return authors[0].getName() + "," + authors[1].getName();
     }

}
