package joao.groupsoftware.forms;

import lombok.Data;

@Data
public class Square extends Figure{

    public Square(Double side) {
        this.setBase(side);
        this.setHeight(side);
    }

    @Override
    public Double area() {
        return super.area();
    }
}
