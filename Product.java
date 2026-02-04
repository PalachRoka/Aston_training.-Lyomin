public class Product {
    public String name;
    public String date;
    public String producer;
    public String country;
    public int price;
    public boolean reservation;

    public Product (String name, String date, String producer, String country,
                    int price, boolean reservation) {
        this.name = name;
        this.date = date;
        this.producer = producer;
        this.country = country;
        this.price = price;
        this.reservation = reservation;
        System.out.println("Название: " + name + "; Дата производства: " + date +
                "; Производитель: " + producer + "; Страна происхождения: " + country + "; Цена: " + price +
                "; Состояние бронирования покупателем: " + reservation);
    }

}
