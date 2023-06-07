
public class Truck extends Transport implements Checkable  {
    public Truck (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        this.updateTyre();
        this.checkEngine();
        this.checkTrailer();

    }
}

