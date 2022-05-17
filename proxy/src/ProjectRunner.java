public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("http://localhost:8080/start");

        project.run();
    }
}
