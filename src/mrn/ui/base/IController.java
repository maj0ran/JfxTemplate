package mrn.ui.base;

/**
 * The Interface that represents a controller. Implement this interface and set all
 * the model<->view bindings in the init method.
 * @param <V> Concrete View
 * @param <M> Concrete Model
 */
public interface IController<V extends View, M> {

    public void init(V view, M model);

}
