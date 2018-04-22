package mrn.ui.view_2;

import javafx.scene.input.MouseEvent;
import mrn.data.Model;
import mrn.ui.base.IController;

public class ControllerTwo implements IController<Model, SampleViewTwo> {
    public ControllerTwo(Model model, SampleViewTwo view) {
        init(model, view);
    }

    public void init(Model model, SampleViewTwo view) {
        view.btn.addEventHandler(MouseEvent.MOUSE_CLICKED, (event) -> {
            view.update();
        });
    }
}
