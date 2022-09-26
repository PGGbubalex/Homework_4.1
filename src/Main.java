public class Main {
    public static void main(String[] args) {

        int capicity = 102; // общая вместимость
        int sits = 60; //  всего сидячих мест
        int others = capicity - sits; // всего стоячих мест

        int seating = 35; // занято сидячих мест
        int stay = 25; // занято стоячих мест
        int total = seating + stay;
        System.out.println("Всего свободно " + (capicity - total) + " мест, из них " + (sits - seating) + " сидячих и " + (others - stay) + " стоячих");


    }
}