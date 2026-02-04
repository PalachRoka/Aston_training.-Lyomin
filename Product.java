public class Product {

    public String name;
    public String dateProduction;
    public String producer;
    public String country;
    public int price;
    public boolean reservation;

    public Product (String name, String dateProduction, String producer, String country,
                    int price, boolean reservation) {
        this.name = name;
        this.dateProduction = dateProduction;
        this.producer = producer;
        this.country = country;
        this.price = price;
        this.reservation = reservation;
        System.out.println("Название: " + name + "; Дата производства: " + dateProduction +
                "; Производитель: " + producer + "; Страна происхождения: " + country + "; Цена: " + price +
                "; Состояние бронирования покупателем: " + reservation);
    }


}