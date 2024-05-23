package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MyArray array = new MyArray();

        // кладемо 5 елементів (все примечания далее взяты из дз)
        array.put("1st");
        array.put("2nd");
        array.put("3rd");
        array.put("4th");
        array.put("5th");

        System.out.println("Довжина: " + array.length());
        System.out.println(array.get()); // виводимо перший елемент
        System.out.println(array.get()); // виводимо 2й елемент
        System.out.println(array.get()); // виводимо 3й елемент
        System.out.println(array.get()); // виводимо 4й елемент
        System.out.println(array.get()); // виводимо 5й елемент
        System.out.println("Довжина: " + array.length());

        // Двічи перевіримо, що немає елементів
        System.out.println(array.get());
        System.out.println(array.get());

        System.out.println("Довжина перед тим як покласти елемент: " + array.length());
        array.put("new Elem");
        System.out.println("Довжина після того, як поклали: " + array.length());
        System.out.println(array.get()); // виводимо перший елемент
    }
}