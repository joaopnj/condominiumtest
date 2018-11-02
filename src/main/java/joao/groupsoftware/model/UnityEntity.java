package joao.groupsoftware.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "unidade")
@Data
public class UnityEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "unidade_id")
    private Integer id;

    @Column(name = "identification_number")
    private Long identificationNumber;

    @ManyToOne
    @JoinColumn(name = "condominio_id", referencedColumnName = "condominio_id")
    private CondominumEntity condominumEntity;

    public UnityEntity(Long identificationNumber, CondominumEntity condominumEntity) {
        this.identificationNumber = identificationNumber;
        this.condominumEntity = condominumEntity;
    }
}
