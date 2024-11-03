package ua.edu.ucu.flower;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flower")
public class FlowerController {
	private final FlowerService flowerService;

	@Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }
    
	// public static List<Flower> listFlowers() {
	// 	Flower flower1 = new Flower();
	// 	Flower flower2 = new Flower();
	// 	Flower flower3 = new Flower();
	// 	flower1.setColor(FlowerColor.RED);
	// 	// flower1.setFlowerType(FlowerType.ROSE);
	// 	flower2.setColor(FlowerColor.RED);
	// 	// flower2.setFlowerType(FlowerType.ROSE);
	// 	flower3.setColor(FlowerColor.RED);
	// 	// flower3.setFlowerType(FlowerType.ROSE);
	// 	return List.of(flower1, flower2, flower3);
	// }

	@GetMapping
	public List<Flower> getAllFlowers() {
		return flowerService.getAllFlowers();
	}

	@PostMapping
	public void addFlower(@RequestBody Flower flower) {
		flowerService.addFlower(flower);
	}
}
