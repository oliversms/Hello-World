package generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm-generations")

public class BsmGenController {
	@GetMapping
	public String bsmGen() {
		
		return "BSM Generations:<br>Orientação ao Futuro<br>Responsabilidade Pessoal<br>Mentalidade de Crescimento"
				+"Persistencia<br>Trabalho em equipe<br>Atencao aos detalhes<br>Proatividade<br>Comunicacao";
				

}
	}