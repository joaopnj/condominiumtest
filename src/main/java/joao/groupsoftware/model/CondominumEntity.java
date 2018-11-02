package joao.groupsoftware.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "condominio")
@Data
public class CondominumEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "condominio_id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "endereco")
    private String endereco;

    public CondominumEntity(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
}
