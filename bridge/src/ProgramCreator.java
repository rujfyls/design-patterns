public class ProgramCreator {

    public static void main(String[] args) {
        Program[] programs = {new BankSystem(new JavaDeveloper())};
//        Program[] programs = {new BankSystem(new CppDeveloper())};

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
