public class Program {
    public static void main(String[] args) {
        FactoryMethod developerFactory = createDeveloperBySpecialty("C ++");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    public static FactoryMethod createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException("Not found specialty = " + specialty);
        }
    }
}
