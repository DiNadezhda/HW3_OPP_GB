package OPP.HW3;

public class Main {
    public static void main(String[] args) {

        LinkedUnits<String> linkedUnits = new LinkedUnits<>();
        linkedUnits.add("Строка 1");
        linkedUnits.add("Строка 2");
        linkedUnits.add("Строка 3");
        linkedUnits.add("Строка 4");
        linkedUnits.add("Строка 5");
        linkedUnits.add("Строка 6");
        linkedUnits.add("Строка 7");
        linkedUnits.add("Строка 8");
        linkedUnits.add("Строка 9");
        linkedUnits.add("Строка 10");

        System.out.printf("Размер списка: %d\n", linkedUnits.size());

        System.out.println("---Вывод построчно---");
        for (String value : linkedUnits) {
            System.out.println(value);
        }

        System.out.println("---Вернуть строку с индексом 5---");
        System.out.println(linkedUnits.remove(5));

        System.out.println("---Присвоить нулевому элементу--");
        linkedUnits.set("Новое значение", 0);

        System.out.println("---Вывод элементов нового списка---");
        for (int i = 0; i < linkedUnits.size(); i++) {
            System.out.println(linkedUnits.get(i));
        }

        System.out.println("---Очистить список---");
        linkedUnits.clear();
        System.out.printf("Размер списка: %d\n", linkedUnits.size());
    }
}
