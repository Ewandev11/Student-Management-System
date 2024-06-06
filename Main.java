
import view.WelcomeView;
import controller.WelcomeController;
import model.ProgressModel;

public class Main {
    public static void main(String[] args) {
        ProgressModel model = new ProgressModel();
        WelcomeView view = new WelcomeView();
        WelcomeController controller = new WelcomeController(model, view);

        controller.updateProgress();
    }
}
