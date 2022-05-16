package feduncov.banking;

import feduncov.Developer;
import feduncov.PM;
import feduncov.ProjectTeamFactory;
import feduncov.Tester;

public class BankingTeanFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public PM getPM() {
        return new BankingPM();
    }
}
