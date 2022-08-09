package nextstep.levelone.lambda;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    public void 이동() {
        Car car = new Car("pobi", 0);
        Car actual = car.move(new MoveStrategy() {
            @Override
            public boolean isMovable() {
                return true;
            }
        });
        assertEquals(new Car("pobi", 1), actual);
    }

    @Test
    public void 정지() {
        Car car = new Car("pobi", 0);
        Car actual = car.move(new MoveStrategy() {
            @Override
            public boolean isMovable() {
                return false;
            }
        });
        assertEquals(new Car("pobi", 0), actual);
    }

    @Test
    public void 이동_람다적용() {
        Car car = new Car("pobi", 0);
        Car actual = car.move(() -> true);
        assertEquals(new Car("pobi", 1), actual);
    }

    @Test
    public void 정지_람다_적용() {
        Car car = new Car("pobi", 0);
        Car actual = car.move(() -> { return false; } );
        assertEquals(new Car("pobi", 0), actual);
    }
}