public class Main {
    public static void main(String[] args) {
        //Создаем первую книгу и его клон
        Author agataKrist = new Author("Агата", "Кристи");
        Book tenLittleNiggers = new Book("Десят негретят", agataKrist, 1939);
        Book klon = new Book("Десят негретят", agataKrist, 1939);

        //Создаем вторую книгу
        Author michelLermontov = new Author("Михаил", "Лермонтов");
        Book borodino = new Book("Бородино", michelLermontov, 1850);

        // метод toString
        System.out.println(tenLittleNiggers);
        System.out.println(agataKrist);

        // метод equals
        System.out.println(tenLittleNiggers.equals(borodino));
        System.out.println(tenLittleNiggers.equals(klon));

        // метод hashCode()
        System.out.println(borodino.hashCode());
        System.out.println(tenLittleNiggers.hashCode());
        System.out.println(klon.hashCode());


    }
}