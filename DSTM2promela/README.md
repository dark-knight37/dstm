# Dynamic STate Machine (DSTM) - DSTM 2 Promela

This folder containts the Java projects implement the transformation from DSTM specification to Promela model.

Prerequisites:
- ATL 3.5 for Model-to-Model transformations
- Acceleo 3.7 for Model-to-Text transformations
You have to install all the components directly from Eclipse (Click on Help (from the top menu) -> Eclipse Marketplace, then search for ATL and Acceleo)

HowTo:
The 6 subfolder have to be imported in Eclipse as Eclipse Projects. Then open the Java project TCG_complete/src/test/TCG_Test.java and configure the path of the source DSTM specification files. Execute the main method. You will find the .pml file in the /pml folder and all intermediate files in the /temp folder (automatically created when running the code).

If you need assistance or if you want to contribute please contact roberto.nardone@unina.it
