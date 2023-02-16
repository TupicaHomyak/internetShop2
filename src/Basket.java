public class Basket {
    private String items = "";
    private  int totalPrice = 0;
    private int limit;

    // КОНСТРУКТОРЫ
    public Basket () { //это конструктор.для создания объектов без параметров
        items = "Список товаров: ";
        this.limit = 10000000;
    }
    public Basket(int limit) { //это конструктор. нет войда или возврашения. 1 парам
        this(); //здесь вызываем конструктор без параметров верхний
        this.limit = limit; //а потом будет выполняться параметр этого конструктора
    }
    public Basket(String items, int totalPrice) { //это конструктор с 2 парам.
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }
    // ОКОНЧАНИЕ 3 КОНСТРУКТОРОВ


    public void add (String name,  int price) { //метод для добавления товаров
        add(name, price, 1);
    }
    // СОЗДАЕМ ЕЩЕ ОДИН МЕТОД АDD, изучаем перегрузку методов.
    // он будет учитывать количество товаров в корзине

    public void add (String name,  int price, int count) {
        if (contains(name)) {
            return;
        }
        if ((totalPrice + price * count) >= limit) {
            return;
        }
        items = items + "\n" + name + " - " + count + " шт." + price;
        totalPrice = totalPrice + price * count; // отличие в учтении количества
    }

    public void clear () { //метод для очистки корзины
        items = "";
        totalPrice = 0;
    }
    public int getTotalPrice () { //метод возвращения общей стоимости
        return totalPrice;
    }
    public boolean contains(String name) { //метод проверки есть ли в корзине что-то конкр
        return items.contains(name);
    }

    public void print (String title) { //метод для выведения на консоль
        System.out.println(title);
        if (items.isEmpty()) { //этот метод уже включ.в библиотеку.смотрит пуста ли строка
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}