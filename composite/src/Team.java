import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<Developer> devs = new ArrayList<>();
    public void addDeveloper(Developer dev) {
        devs.add(dev);
    }

    public void everyoneWriteCode() {
        for (Developer developer : devs) {
            developer.writeCode();
        }
    }
}
