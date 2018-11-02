package joao.groupsoftware.forms;

import lombok.Data;

@Data
public class Circle extends Figure {

    private static Double PI = 3.14;

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return PI * (Math.pow(this.getRadius(), 2));
    }
}
