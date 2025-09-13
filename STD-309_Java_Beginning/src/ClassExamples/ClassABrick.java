package ClassExamples;

public class ClassABrick {

    // instance variable
    public String shape = "Squre";
    public String design = "No Design";
    public int volume = 20;


    public ClassABrick() {
    }

    public ClassABrick(String shape, String design, int volume) {
        this.shape = shape;
        this.design = design;
        this.volume = volume;
    }

    public String getShape() {
        return shape;
    }

    public String getDesign() {
        return design;
    }

    public int getVolume() {
        return volume;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
