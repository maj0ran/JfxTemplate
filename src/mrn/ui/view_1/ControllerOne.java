package mrn.ui.view_1;

import javafx.event.Event;
import javafx.scene.input.MouseEvent;
import mrn.data.Model;
import mrn.ui.base.IController;

public class ControllerOne implements IController<Model, SampleViewOne> {
    public ControllerOne(Model model, SampleViewOne view) {
        init(model, view);
    }

    public void init(Model model, SampleViewOne view) {
        view.update();

        view.btn.addEventHandler(MouseEvent.MOUSE_CLICKED, (Event e) -> {
                    model.incValue();
                    System.out.println("Value: " + model.getValue());
                    view.update();
                }
        );
    }
}
