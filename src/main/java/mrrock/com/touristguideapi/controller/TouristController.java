package mrrock.com.touristguideapi.controller;

import mrrock.com.touristguideapi.model.TouristAttraction;
import mrrock.com.touristguideapi.service.TouristService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(path = "/attractions")
public class TouristController {
    private final TouristService touristService;
    public TouristController() {
        touristService = new TouristService();
    }


    @GetMapping("")
    public ResponseEntity<List<TouristAttraction>> getAllTouristAttractions(){
        return new ResponseEntity<List<TouristAttraction>>(touristService.getAllTouristAttractions(), HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<TouristAttraction> getTouristAttractionByName(@PathVariable String name){
        return new ResponseEntity<TouristAttraction>(touristService.getTouristAttractionByName(name),HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<TouristAttraction> addAttraction(@RequestBody TouristAttraction touristAttraction){
        return new ResponseEntity<TouristAttraction>(touristService.addAttraction(touristAttraction), HttpStatus.OK);
    }
    @PostMapping("/update")
    public ResponseEntity<TouristAttraction> updateAttraction(@RequestBody TouristAttraction touristAttraction){
        return new ResponseEntity<TouristAttraction>(touristService.updateAttraction(touristAttraction), HttpStatus.OK);
    }
    @PostMapping("/delete/{name}") ResponseEntity<TouristAttraction> deleteAttraction(@PathVariable String name){
return new ResponseEntity<TouristAttraction>(touristService.deleteAttraction(name),HttpStatus.OK);

    }




}
