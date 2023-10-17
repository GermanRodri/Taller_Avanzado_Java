package co.com.bancolombia.jpa;


import co.com.bancolombia.model.animales.Animales;
import co.com.bancolombia.model.animales.gateways.AnimalesRepository;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
@Component
@AllArgsConstructor
public class JpaAnimalImpl implements AnimalesRepository {

    private JPARepositoryAdapter jpaRepositoryAdapter;

    @Override
    public void create(Animales animales){
        String id = UUID.randomUUID().toString();
        animales.setId(id);
        jpaRepositoryAdapter.save(animales);
    }

    @Override
    public Animales read(String id) {
        return jpaRepositoryAdapter.findById(id);
    }

    @Override
    public Animales update(String id, Animales animales) throws Exception{
        Animales animalesBd = jpaRepositoryAdapter.findById(id);

        if(animalesBd == null) throw new Exception("Animal no encontrado: " + id);

        animalesBd.setNumPatas(animales.getNumPatas());
        animalesBd.setGenero(animales.getGenero());
        animalesBd.setEspecie(animales.getEspecie());
        animalesBd.setHabitat(animales.getHabitat());
        animalesBd.setDomestico(animales.getDomestico());

        jpaRepositoryAdapter.save(animalesBd);
        return animalesBd;
    }

    @Override
    public void delete(String id){
        jpaRepositoryAdapter.deleteById(id);
    }

    @Override
    public List<Animales> getAll(){
        return jpaRepositoryAdapter.findAll();
    }
}
