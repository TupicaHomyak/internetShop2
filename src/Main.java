public class Main {
    public static void main(String[] args) { //главный. сюда напишем вызовы всех нижних методов

        // объекты
        Basket vasyaBasket = new Basket(100);
        vasyaBasket.add("молочко", 55);
        vasyaBasket.add("колбаска", 33);

        Basket petyaBasket = new Basket();
        petyaBasket.add("масличко", 120);
        petyaBasket.add("лопата", 1200);
        petyaBasket.add("бочка", 600);

        Basket mashaBasket = new Basket("Стол", 666);

        Basket olgaBasket = new Basket(100);

        vasyaBasket.print("Корзина Васи: ");
        petyaBasket.print("Корзина Пети: ");
        mashaBasket.print("Корзина Маши: ");
        olgaBasket.print("Корзина  Ольги: ");
    }
}