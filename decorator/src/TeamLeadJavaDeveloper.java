public class TeamLeadJavaDeveloper extends DeveloperDecorator{

    public TeamLeadJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "; team leat is work";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
