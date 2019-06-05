# Dynamic STate Machine (DSTM) - Editor

This folder containts the Java projects that implement a textual editor for the DSTM formalism.

Prerequisites:
- Eclipse Xtext 2.18.0 and the required components
You have to install all the components directly from Eclipse (Click on Help (from the top menu) -> Eclipse Marketplace, then search for Xtext)

HowTo:
The 11 subfolder have to be imported in Eclipse as Eclipse Projects. Then: Right click on a project from the Project Explorer View -> Run As -> Eclipse Application.
After the complete startup of a new Eclipse instance you have to create an Empty Project, then two files with extenstion .xdstm (to model the control flow), and .xdstmdata (to model the data flow). The editor will be automatically executed.

If you need assistance or if you want to contribute please contact roberto.nardone@unina.it
