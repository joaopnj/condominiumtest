package joao.groupsoftware.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "morador")
@Data
public class ResidentEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "morador_id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sobrenome")
    private String sobrenome;

    @ManyToOne
    @JoinColumn(name = "unidade_id", referencedColumnName = "unidade_id")
    private UnityEntity unityEntity;

    public ResidentEntity(String nome, String sobrenome, UnityEntity unityEntity) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.unityEntity = unityEntity;
    }
}
