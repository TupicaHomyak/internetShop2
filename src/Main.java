public class Main {
    public static void main(String[] args) { //главный. сюда напишем вызовы всех нижних методов

        // объекты
//        Basket petyaBasket = new Basket();
//            petyaBasket.add("масличко", 120);
//            petyaBasket.add("лопата", 1200);
//            petyaBasket.add("бочка", 600);
//        Basket mashaBasket = new Basket("Стол", 666);
//        Basket olgaBasket = new Basket(100);
//
//            petyaBasket.print("Корзина Пети: ");
//            mashaBasket.print("Корзина Маши: ");
//            olgaBasket.print("Корзина  Ольги: ");

        Product product = new Product("milk", 56);
        Order order = new Order();
        order.addProduct(product);
        System.out.println(product);


        DeliveryOrder order1 = new DeliveryOrder(DeliveryType.AUTO, Fragile.YES, Cold.NO);
    }
}