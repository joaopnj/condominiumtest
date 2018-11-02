package joao.groupsoftware.forms;

import lombok.Data;

@Data
public class Rectangle extends Figure {

    public Rectangle(Double base, Double height) {
        this.setBase(base);
        this.setHeight(height);
    }

    @Override
    public Double area() {
        return super.area();
    }
}
