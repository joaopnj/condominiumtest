package joao.groupsoftware.condominium;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Apartament {

    private Double totalUnitysArea;

    private Double totalArea;

    private Double unityArea;

    private Double totalOfDispenses;

    private Double idealFraction() {
        return (totalArea * unityArea) / totalUnitysArea;
    }

    public Double condominiumValue(){
        return getTotalOfDispenses() + idealFraction();
    }
}
