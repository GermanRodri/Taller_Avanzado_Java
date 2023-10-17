package co.com.bancolombia.usecase.casosanimales;

import co.com.bancolombia.model.animales.Animales;
import co.com.bancolombia.model.animales.gateways.AnimalesRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CasosAnimalesUseCase {
    private AnimalesRepository animalesRepository;
    public Animales read(String id) {
        return animalesRepository.read(id);
    }
    public void create(Animales animal){
        animalesRepository.create(animal);
    }
    public Animales update(String id, Animales animal) throws Exception{
        animalesRepository.update(id,animal);
        return animal;
    }

    public void delete(String id){
        animalesRepository.delete(id);
    }

    public List<Animales> getAll(){
        return animalesRepository.getAll();
    }
}
