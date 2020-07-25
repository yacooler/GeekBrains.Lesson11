import java.util.*;

public class MainApp {

    //По условиям задачи - массив
    private static final String[] WORDS = {"Окунь", "Камбала", "Минтай", "Кета", "Форель", "Палтус", "Бычок", "Карась",
            "Карп", "Окунь", "Форель", "Сибас", "Минтай", "Карась", "Окунь", "Осётр", "Хек", "Плотва", "Иваси", "Луна"};

    public static void main(String[] args) {
        testTasks();
    }

    private static void testTasks(){
        testTaskDistinctStringValue();
        testTaskDistinctWordsCount();
        testPhoneBook();
    }

    private static void testTaskDistinctStringValue(){
        Set<String> set = ArrayHomework.getDistinctWords(WORDS);
        System.out.println(set);
    }

    private static void testTaskDistinctWordsCount(){
        Map<String, Integer> hashMap = ArrayHomework.getDistinctWordsCount(WORDS);
        System.out.println(hashMap);
    }

    private static void testPhoneBook(){
        PhoneBook book = new PhoneBook();
        book.add("Иванов", "+79018234091");
        book.add("Серов", "+79134002324");
        book.add("Хазанов", "+79261215899");
        book.add("Листов", "+79053121114");
        book.add("Лаптев", "+79172966431");
        book.add("Иванов", "+79284650800");

        book.printAll();

        List<PhoneBookRecord> empty = book.get("Вязанкин");
        if (empty.isEmpty()) {
            System.out.println("Книга не содержит записи с указанным ФИО");
        } else {
            PhoneBook.print(empty);
        }


        List<PhoneBookRecord> filled = book.get("Иванов");
        if (filled.isEmpty()) {
            System.out.println("Книга не содержит записи с указанным ФИО");
        } else {
            PhoneBook.print(filled);
        }

    }

}


