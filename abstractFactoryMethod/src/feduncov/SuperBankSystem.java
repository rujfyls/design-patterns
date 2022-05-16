package feduncov;

import feduncov.banking.BankingTeanFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory teamFactory = new BankingTeanFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        PM pm = teamFactory.getPM();

        System.out.println("Start...");
        developer.writeCode();
        tester.testCode();
        pm.manageProject();
    }
}
