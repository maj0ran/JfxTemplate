package mrn.ui.view_2;

import javafx.scene.input.MouseEvent;
import mrn.data.Model;
import mrn.ui.base.IController;

public class ControllerTwo implements IController<SampleViewTwo, Model> {
    public ControllerTwo(SampleViewTwo view, Model model) {
        init(view, model);
    }

    public void init(SampleViewTwo view, Model model) {
        view.btn.addEventHandler(MouseEvent.MOUSE_CLICKED, (event) -> {
            view.update();
        });
    }
}
