import airport.LuggageSpace;
import airport.Worker;
import detail.Detail;
import maps.Item;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ex1Runner();
        ex2Runner();
        ex3Runner();
    }

    private static void ex1Runner() {
        LuggageSpace luggageSpace = new LuggageSpace();
        luggageSpace.addWorker(new Worker("Vasya"));
        luggageSpace.addWorker(new Worker("Petya"));
        luggageSpace.addWorker(new Worker("Kolya"));
        luggageSpace.arrival("SU-077");
        luggageSpace.arrival("AO-222");
        luggageSpace.unloadLuggage();
    }

    private static void ex2Runner() {
        HashMap<Item, Integer> magicMap = new HashMap<>();
        magicMap.put(new Item("Яблоко"), 1);
        magicMap.put(new Item("Банан"), 2);
        magicMap.put(new Item("Апельсин"), 5);
        magicMap.put(new Item("Апельсин"), 3);
        System.out.println(magicMap);
        System.out.println(magicMap.get(new Item("Апельсин")));
    }

    private static void ex3Runner() {
        HashMap<Detail, Integer> brokenMap = new HashMap<>();
        //В equals подменяем значение атрибута name
        brokenMap.put(new Detail("Пила"), 1);
        brokenMap.put(new Detail("Молоток"), 2);
        brokenMap.put(new Detail("Отвертка"), 3);
        System.out.println(brokenMap);
    }

}