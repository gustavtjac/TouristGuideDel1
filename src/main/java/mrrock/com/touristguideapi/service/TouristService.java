package mrrock.com.touristguideapi.service;

import mrrock.com.touristguideapi.model.TouristAttraction;
import mrrock.com.touristguideapi.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {
private final TouristRepository touristRepository;

    public TouristService() {
        this.touristRepository = new TouristRepository();
    }



    public List<TouristAttraction> getAllTouristAttractions(){
        return touristRepository.getAllTouristAttractions();
    }

    public TouristAttraction getTouristAttractionByName(String name){
        return touristRepository.getTouristAttractionByName(name);
    }
    public TouristAttraction addAttraction(TouristAttraction touristAttraction){
        return touristRepository.addAttraction(touristAttraction);
    }
    public TouristAttraction updateAttraction(TouristAttraction touristAttraction){
        return  touristRepository.updateAttraction(touristAttraction);
    }
    public TouristAttraction deleteAttraction(String name){
       return touristRepository.deleteAttraction(name);
    }
}
