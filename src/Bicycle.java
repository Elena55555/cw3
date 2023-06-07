public class Bicycle extends Transport implements Checkable  {
    public Bicycle (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        this.updateTyre();


    }
}
