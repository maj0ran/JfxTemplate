package mrn.ui.view_1;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import mrn.data.Model;
import mrn.ui.base.Controller;

import java.beans.PropertyChangeEvent;

public class ControllerOne extends Controller<Model, SampleViewOne>  {

    public ControllerOne(Model model, SampleViewOne view) {
        super(model, view);
    }

    protected void init(Model model, SampleViewOne view) {

        view.update();
        view.btn.addEventHandler(MouseEvent.MOUSE_CLICKED, (EventHandler<Event>) this::pressButton
        );
    }

    public void pressButton(Event e) {

        System.out.println(e.getSource().toString());
        model.incValue();
        view.update();
        change.firePropertyChange(null, null, null);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(evt.getPropertyName());
        System.out.println("CTRL ONE: " + evt.getOldValue());
    }
}
