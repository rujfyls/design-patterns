package feduncov.website;

import feduncov.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer working on a website...");
    }
}
