package joao.groupsoftware.forms;

import lombok.Data;

@Data
public class Triangule extends Figure {

    public Triangule(Double base, Double height) {
        this.setBase(base);
        this.setHeight(height);
    }

    @Override
    public Double area() {
        return (this.getBase() * this.getHeight()) / 2 ;
    }
}
