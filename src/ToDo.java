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
public class ToDo {
    String name;
    String description;
    int priority;
    Person person;

    public ToDo(String name, String description, int priority, Person person) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.person = person;
    }

    public ToDo(String name, String description) {
        this.name = name;
        this.description = description;
    }

    boolean highPriority(int priority) {
        if (priority > 0)
            return true;
        else
            return false;
    }

    boolean mediumPriority(int priority) {
        if (priority == 0)
            return true;
        else
            return false;
    }

    boolean lowPriority(int priority) {
        if (priority < 0)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", person=" + person +
                '}';
    }


}
