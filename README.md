# JfxTemplate
Template for a JavaFx Project with a Base View and Base Controller and a Window for View-Composition

The pattern is a MVC where there are multiple Views and multiple Controllers. Every View has its own Controller. So I guess it is a MV<sup>n</sup>C<sup>n</sup>.

A View may contain of several GUI-Elements which belong logical together.

All Controllers are bound together with a bus realized with a static PropertyChangeSupport from the JavaBeans.

# Usage

### View
Write a View Class which inherits from the Base View. The Generic Parameter of the Base Class is the Model Class. Override the init()-Method to initialize all GUI-Objects in the View. set the model and the controller in the Constructor

### Controller
Write a Controller which inherits from the Base Controller. The Generic Parameters of the Base class is the concrete view and the Model class. Create a constructor with the model and the view as arguments and call super(model, view).
Implement the init()-Method to set the bindings between GUI-Elements and Model-Methods.

### Window
Construct a Window-Object with a JavaFX-Layout (JavaFx.Pane) as the Generic Parameter.

Add the views to the layout of the Window via getLayout().

Put it all in the JfxUi class which represents your whole GUI


# TODO:

Test it in some real projects.