package feduncov.website;

import feduncov.Developer;
import feduncov.PM;
import feduncov.ProjectTeamFactory;
import feduncov.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public PM getPM() {
        return new WebsitePM();
    }
}
