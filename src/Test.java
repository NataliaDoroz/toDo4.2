//Napisz aplikację z listą do zarządzania zadaniami. Każde zadanie ma nazwę, opis, priorytet oraz osobę odpowiedzialną
// za wykonanie (osoba reprezentowana jest jako osobna klasa). W klasie powinny znajdować się konstruktory:
//
//pozwalający zainicjować wszystkie pola,
//pozwalający zainicjować wszystkie pola oprócz osoby,
//pozwalający zainicjować wszystkie pola oprócz osoby i priorytetu
//W zadaniu wykorzystaj dwa poznane zastosowania słowa kluczowego this.
//
//Zdefiniuj 3 metody:
//
//highPriority() zwraca true, jeśli priorytet zadania jest wysoki
//mediumPriority() zwraca true, jeśli priorytet zadania jest normalny
//lowPriority() zwraca true, jeśli priorytet zadania jest niski
//Zadanie ma priorytet wysoki, jeśli do pola priorytet przypisana jest wartość dodatnia, normalny oznacza wartość 0, a niski wartość ujemną.
//
//Utwórz kilka przykładowych obiektów reprezentujących zadania i przetestuj stworzone metody wyświetlając wartości ich priorytetów.
//
//*Jeżeli konstruktory zapisałeś samodzielnie, to je usuń i wygeneruj ponownie korzystając ze środowiska (Alt + Insert / ⌘ + N)
public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Natalia");
        Person person2 = new Person("Grzesiek");
        ToDo toDo1 = new ToDo("Homework1", "make homework", 2, person1);
        ToDo toDo2 = new ToDo("Homework2", "make homework", 1, person2);
        ToDo toDo3 = new ToDo("Homework3", "make homework", 0, person1);
        ToDo toDo4 = new ToDo("extra hom.", "make homework", -3, person1);

        System.out.println(toDo1.highPriority(toDo1.priority));
        System.out.println(toDo1.mediumPriority(toDo1.priority));
        System.out.println(toDo1.lowPriority(toDo1.priority));
        System.out.println();
        System.out.println(toDo3.mediumPriority(toDo3.priority));
        System.out.println(toDo4.lowPriority(toDo4.priority));
        ;
        System.out.println(toDo4.mediumPriority(toDo4.priority));
        ;
        System.out.println(toDo4.highPriority(toDo4.priority));
        ;

        System.out.println(toDo1.toString());
        System.out.println(person1.toString());


    }
}
