package one.digitalinnovation.personapi.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity // é uma entidade
@Data //adicionou os getters e setters
@Builder // padronizo o padrao de projeto e facilitou o build da classe
@AllArgsConstructor //adicionou construtotes
@NoArgsConstructor //adicionou construtores
public class Phone {

    @Id //chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // incremental a geraca de ID no banco
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false) // este campo não pode ser null no banco
    private PhoneType type;

    @Column(nullable = false)
    private String number;
}
