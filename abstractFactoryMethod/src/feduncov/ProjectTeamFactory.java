package feduncov;

public interface ProjectTeamFactory {
    //сущность для создания сразу всей команды
    Developer getDeveloper();
    Tester getTester();
    PM getPM();
}
