public class CppDeveloperFactory implements FactoryMethod{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
