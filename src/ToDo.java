//w klasie ToDOmetody z priorytetem powinny sprawdzic wartosc pola z klasy a nie z argumenty
//Czyli zmaiast
//    boolean highPriority(int priority) {
//        return priority > 0;
//    }
//powinno byc
//    boolean highPriority() {
//        return priority > 0;
//    }
public class ToDo {
    String name;
    String description;
    int priority;
    Person person;

    public ToDo(String name, String description, int priority, Person person) {
        this(name, description);
        this.priority = priority;
        this.person = person;
    }

    public ToDo(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public ToDo(String name, String description) {
        this.name = name;
        this.description = description;
    }


    boolean highPriority() {
        return this.priority > 0;
    }

    boolean mediumPriority() {
        return this.priority == 0;
    }

    boolean lowPriority() {
        return this.priority < 0;
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
