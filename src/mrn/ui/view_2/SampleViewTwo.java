package mrn.ui.view_2;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import mrn.data.Model;
import mrn.ui.base.View;

import java.util.Random;

public class SampleViewTwo extends View<Model> {

    public VBox layout;
    public Circle c;
    public Button btn;

    public SampleViewTwo (Model model) {
        this.setModel(model);
        this.setController(new ControllerTwo(this, model));
    }

    @Override
    protected void init() {
        layout = new VBox();
        c = new Circle(50, Paint.valueOf("Red"));
        btn = new Button("Click Me!");

        this.layout.getChildren().addAll(c, btn);
        this.getRoot().getChildren().add(layout);
    }

    public void update() {
        Random rnd = new Random();
        float r = rnd.nextFloat();
        float g = rnd.nextFloat();
        float b = rnd.nextFloat();
        Color color = Color.color(r, g, b);
        c.setFill(color);
    }


}

