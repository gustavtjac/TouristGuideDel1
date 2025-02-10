package mrrock.com.touristguideapi.repository;

import mrrock.com.touristguideapi.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    private ArrayList<TouristAttraction> attractions;

    public TouristRepository() {
        this.attractions = new ArrayList<>();
        makeAttractions();
    }

    public void makeAttractions(){
        attractions.add(new TouristAttraction("Tivoli","Danmarks fedeste forlystelsespark. Estableret i 1949 og kan holde hele 9149 mennekser"));
        attractions.add(new TouristAttraction("KEA","Skole"));
        attractions.add(new TouristAttraction("SilverBack Sportsgym","Top klasse bodybuilding center hvor man kan få de varmeste legdays"));
    }

    public List<TouristAttraction> getAllTouristAttractions(){
        return attractions;
    }
    public TouristAttraction getTouristAttractionByName(String name){
        for (TouristAttraction t : attractions){
            if (t.getName().equalsIgnoreCase(name)){
                return t;
            }
        }
        return null;
    }
    public TouristAttraction addAttraction(TouristAttraction touristAttraction){
        attractions.add(touristAttraction);
        return touristAttraction;
    }

    public TouristAttraction updateAttraction(TouristAttraction touristAttraction){
        for(TouristAttraction t : attractions){
            if (t.getName().equalsIgnoreCase(touristAttraction.getName())){
                t.setDescription(touristAttraction.getDescription());
                return t;
            }
        }


        return null;
    }

    public TouristAttraction deleteAttraction(String name){
        TouristAttraction temp = new TouristAttraction("","");
        for (TouristAttraction t : attractions){
            if (name.equalsIgnoreCase(t.getName())){
                temp=t;
                attractions.remove(t);
                return temp;
            }
        }
        return null;
    }






}
