package joao.groupsoftware.forms;

import lombok.Data;

@Data
public abstract class Figure {
    private Double base;
    private Double height;

    public Double area(){
        return getBase() * getHeight();
    }
}
