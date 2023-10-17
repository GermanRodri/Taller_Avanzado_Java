package co.com.bancolombia.model.animales.gateways;

import co.com.bancolombia.model.animales.Animales;
import java.util.List;

public interface AnimalesRepository {
    Animales read(String id);
    void create(Animales animal);

    default Animales update(String id, Animales animal) throws Exception{
        return animal;
    }

    void delete(String id);

    List<Animales> getAll();
}
