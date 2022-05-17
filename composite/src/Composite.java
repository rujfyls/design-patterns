public class Composite {
    /*
    Группирует несколько объектов в древовидную структуру используя один класс.
     Позволяет работать с несколькими классами через один объект.
     */

    public static void main(String[] args) {
        Team team = new Team();

        Developer one = new JavaDeveloper();
        Developer two = new JavaDeveloper();
        Developer three = new CppDeveloper();

        team.addDeveloper(one);
        team.addDeveloper(two);
        team.addDeveloper(three);

        team.everyoneWriteCode();
    }
}
