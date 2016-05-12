package predictions3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "prediction")
public class Prediction implements Comparable<Prediction> {
    private String who; // person
    private String what; // his/her prediction
    private int id;

    public Prediction() {
    }

    @Override
    public String toString() {
	return String.format("%2d: ", id) + who + " ==> " + what + "\n";
    }

    public void setWho(String who) {
	this.who = who;
    }

    @XmlElement
    public String getWho() {
	return who;
    }

    public void setWhat(String what) {
	this.what = what;
    }

    @XmlElement
    public String getWhat() {
	return what;
    }

    public void setId(int id) {
	this.id = id;
    }

    @XmlElement
    public int getId() {
	return id;
    }

    public int compareTo(Prediction other) {
	return this.id - other.id;
    }
}
