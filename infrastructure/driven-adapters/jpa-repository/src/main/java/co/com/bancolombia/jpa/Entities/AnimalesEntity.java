package co.com.bancolombia.jpa.Entities;

import lombok.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name= "Animales")

public class AnimalesEntity {
    @Id private String id;
    @Column private int numeropatas;
    @Column private char genero;
    @Column private String especie;
    @Column private String habitat;
    @Column private boolean domestico;
}
