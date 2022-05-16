public class JavaDeveloperFactory implements FactoryMethod{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
