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

        System.out.println(toDo1.highPriority(toDo1.priority));
        System.out.println(toDo1.mediumPriority(toDo1.priority));
        System.out.println(toDo1.lowPriority(toDo1.priority));
        System.out.println();
        System.out.println(toDo2.highPriority(toDo2.priority));

        System.out.println(toDo3.mediumPriority(toDo3.priority));
        System.out.println(toDo4.lowPriority(toDo4.priority));
        System.out.println(toDo4.mediumPriority(toDo4.priority));
        System.out.println(toDo4.highPriority(toDo4.priority));

        System.out.println(toDo5.lowPriority(toDo5.priority));

        System.out.println(toDo6.toString());

        System.out.println(toDo1.toString());
        System.out.println(person1.toString());

        System.out.println(toDo2.toString());
    }
}
