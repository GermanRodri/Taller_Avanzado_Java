package co.com.bancolombia.model.animales;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor

public class Animales {
    private String id;
    private int numPatas;
    private char genero;
    private String especie;
    private String habitat;
    private boolean domestico;
    public boolean getDomestico() {
        return domestico;
    }
}
