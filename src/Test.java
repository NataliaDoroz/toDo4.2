public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Natalia");
        Person person2 = new Person("Grzesiek");
        ToDo toDo1 = new ToDo("Homework1", "make homework", 2, person1);
        ToDo toDo2 = new ToDo("Homework2", "make homework", 1, person2);
        ToDo toDo3 = new ToDo("Homework3", "make homework", 0, person1);
        ToDo toDo4 = new ToDo("extra hom.", "make homework", -3, person1);
        ToDo toDo5 = new ToDo("extra2", "extra homework", -3);
        ToDo toDo6 = new ToDo("extra3", "extra homework");

        System.out.println(toDo1.highPriority());
        System.out.println(toDo1.mediumPriority());
        System.out.println(toDo1.lowPriority());
        System.out.println();
        System.out.println(toDo2.highPriority());

        System.out.println(toDo3.mediumPriority());
        System.out.println(toDo4.lowPriority());
        System.out.println(toDo4.mediumPriority());
        System.out.println(toDo4.highPriority());

        System.out.println(toDo5.lowPriority());

        System.out.println(toDo6.toString());

        System.out.println(toDo1.toString());
        System.out.println(person1.toString());

        System.out.println(toDo2.toString());
    }
}
