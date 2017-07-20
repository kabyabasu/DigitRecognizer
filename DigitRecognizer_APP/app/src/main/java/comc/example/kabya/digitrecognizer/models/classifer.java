package comc.example.kabya.digitrecognizer.models;

/**
 * Created by kabya on 2/7/17.
 */

//public interface for the classifer
//exposes its name and the recognize function
//which given some drawn pixels as input
//classifies what it sees as an MNIST image
public interface classifer {
    String name();

    classification recognize(final float[] pixels);
}

