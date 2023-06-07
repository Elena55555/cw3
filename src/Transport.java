public abstract class Transport implements Checkable {

    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }


    public void updateTyre() {
        System.out.println(" Обслуживаем " + this.getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println(" Меняем покрышку ");


        }
    }

    public void checkEngine () {
        System.out.println(" Обслуживаем " + this.getModelName());
        for (int i = 0; i <  1; i++) {
            System.out.println(" Проверяем двигатель ");


        }

    }
    public void checkTrailer () {
        System.out.println(" Обслуживаем " + this.getModelName());
        for (int i = 0; i < 1; i++) {
            System.out.println(" Проверяем прицеп ");

        }
    }











}




