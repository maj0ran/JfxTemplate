package mrn.ui;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import mrn.data.Model;
import mrn.ui.menu.ViewMenu;
import mrn.ui.base.Window;
import mrn.ui.view_1.SampleViewOne;
import mrn.ui.view_2.SampleViewTwo;

public class JfxUi {
    public JfxUi(Stage mainstage) {
        /* Init your model(s) */
        Model data = new Model();

        /* Init a window */
        Window<GridPane> mainwindow = new Window<>(mainstage);
        mainwindow.setLayout(new GridPane());
        mainstage.setTitle("Hello JavaFX");
        GridPane wndw_layout = mainwindow.getLayout();
        wndw_layout.setGridLinesVisible(true);


        /* Init Views and add them to the window layout */
        ViewMenu menu = new ViewMenu(data);
        wndw_layout.add(menu.getRoot(), 0, 0, 2, 1);
        menu.getRoot().prefWidthProperty().bind(mainstage.widthProperty());
        SampleViewOne viewOne = new SampleViewOne(data);
        wndw_layout.add(viewOne.getRoot(), 0, 1);

        SampleViewTwo viewTwo = new SampleViewTwo(data);
        wndw_layout.add(viewTwo.getRoot(), 1, 1);

        /* add the window to the stage */
        mainwindow.getStage().setScene(new Scene(mainwindow.getLayout(), 640, 480));
        mainwindow.getStage().show();

    }
}
