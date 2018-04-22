package mrn.ui.base;

import mrn.data.Model;

/**
 * The Interface that represents a controller. Implement this interface and set all
 * the model<->view bindings in the init method.
 * @param <M> Concrete Model
 * @param <V> Concrete View
 */
public interface IController<M, V extends View<M>> {

    public void init(M model, V view);

}
