import java.util.Objects;

public class CarClass
{
    private String make;
    private String model;
    private Engine engine;

    public CarClass(String make, String model, Engine engine)
    {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "CarClass{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarClass carClass = (CarClass) o;
        return Objects.equals(make, carClass.make) && Objects.equals(model, carClass.model) && Objects.equals(engine, carClass.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, engine);
    }
}
