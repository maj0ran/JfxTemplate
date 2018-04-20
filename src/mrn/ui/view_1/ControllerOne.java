package mrn.ui.view_1;

import javafx.event.Event;
import javafx.scene.input.MouseEvent;
import mrn.data.Model;
import mrn.ui.base.IController;

public class ControllerOne implements IController<SampleViewOne, Model> {
    public ControllerOne(SampleViewOne view, Model model) {
        init(view, model);
    }

    public void init(SampleViewOne view, Model model) {
        view.update();

        view.btn.addEventHandler(MouseEvent.MOUSE_CLICKED, (Event e) -> {
                    model.incValue();
                    System.out.println("Value: " + model.getValue());
                    view.update();
                }
        );
    }
}
