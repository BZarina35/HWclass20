package HWclass20;

/*
Create a class 'Degree' having a method 'getPrerequisite' that prints
""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.
 */
public class Degree {

    public void getPrerequisite() {
        System.out.println("To get a degree you need a high school diploma.");
    }
}

class Bachelors extends Degree {
    // No need to override the 'getPrerequisite' method in this class
}

class Masters extends Degree {
    @Override
    public void getPrerequisite() {
        System.out.println("To get a master's degree you need a bachelor's degree.");
    }
}





