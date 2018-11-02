package joao.groupsoftware.calculations;

import joao.groupsoftware.forms.*;
import lombok.Data;

@Data
public class MathResults {

    private Figure figure;

    public void squareArea(Double side){
        setFigure(new Square(side));
        System.out.println("Área do quadrado: "+getFigure().area());
    }

    public void circuleArea(Double radius){
        setFigure(new Circle(radius));
        System.out.println("Área do circulo: "+getFigure().area());
    }

    public void retanguleArea(Double base, Double height){
        setFigure(new Rectangle(base, height));
        System.out.println("Área do retangulo: "+getFigure().area());
    }

    public void trianguleArea(Double base, Double height){
        setFigure(new Triangule(base, height));
        System.out.println("Área do triangulo: "+getFigure().area());
    }

}
