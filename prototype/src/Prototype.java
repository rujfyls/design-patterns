public class Prototype {
    /*
    Prototype (Прототип) - помогает создать дублированный объект с лучшей производительностью,
    вместо нового создается возвращаемый клон существующего объекта.

    т.е. создавать новые объекты копируя созданный прототип

    интерфейс Clonable как раз реализация данного паттерна
     */

    public static void main(String[] args) {

        Project prototype = new Project(1, "Java", "Hello world!");
        Project clone = (Project) prototype.clone();

        System.out.println(prototype == clone); //fasle так как разные объекты
    }
}
