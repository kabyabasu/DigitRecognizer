package comc.example.kabya.digitrecognizer.models;

/**
 * Created by kabya on 2/7/17.
 */

public class classification {

    //conf is the output
    private float conf;
    //input label
    private String label;

    classification() {
        this.conf = -1.0F;
        this.label = null;
    }

    void update(float conf, String label) {
        this.conf = conf;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public float getConf() {
        return conf;
    }
}

