package mrn.ui.view_2;

import javafx.event.Event;
import javafx.scene.input.MouseEvent;
import mrn.data.Model;
import mrn.ui.base.Controller;

import java.beans.PropertyChangeEvent;

public class ControllerTwo extends Controller<Model, SampleViewTwo> {
    public ControllerTwo(Model model, SampleViewTwo view) {
        super(model, view);
    }

    protected void init(Model model, SampleViewTwo view) {
        view.btn.addEventHandler(MouseEvent.MOUSE_CLICKED, this::pressButton);
    }

    private void pressButton(Event e) {
        view.update();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.pressButton(null);

    }
}
