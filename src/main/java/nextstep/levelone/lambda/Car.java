package nextstep.levelone.lambda;

import java.util.Objects;

public class Car {

    private String name;
    private int position;


    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public Car move(MoveStrategy moveStrategy) {
        if(moveStrategy.isMovable()) position++;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return position == car.position && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
