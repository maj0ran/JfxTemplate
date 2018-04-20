# JfxTemplate
Template for a JavaFx Project with a Base View Class, Controller Interface Class and Window Class

# Usage
Write a View Class which inherits from the Base View. The Generic Parameter of the Base Class is the Model Class. Override the init()-Method to declare all GUI-Objects in the View. set the model and the controller in the Constructor

Write a Controller which implements the IController Interface. The Generic Parameters of the Interface is the concrete view and the Model class. Implement the init()-Method to set the bindings between GUI-Elements and Model-Methods.

Construct a Window-Object with a JavaFX-Layout (JavaFx.Pane) as the Generic Parameter.

Add the views to the layout of the Window via getLayout().

Put it all in the JfxUi class which represents your whole GUI

# TODO:
A Bus for all Controllers to let them communicate

