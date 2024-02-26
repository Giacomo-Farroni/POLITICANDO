package regioni.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import regioni.model.GiuntaLazio;
import regioni.repository.GiunteRepository;

@Controller
@RequestMapping("/Politicando")
public class GiuntaLazioController {
	
@Autowired
GiunteRepository lazioRepository;

@GetMapping
public String home() {
	return "home/home";
		}
@GetMapping("/info")
public String info() {
	return "info/info";
		}

@GetMapping("/home-lazio")
public String homeLazio() {
	return "/lazio/home-lazio";
} 

@GetMapping("/provincia-viterbo")
public String Viterbo() {
	return "/lazio/viterbo/home-viterbo";
}

@GetMapping("/provincia-rieti")
public String Rieti() {
	return "/lazio/rieti/home-rieti";
}

@GetMapping("/provincia-roma")
public String Roma() {
	return "/lazio/roma/home-roma";
}

@GetMapping("/provincia-latina")
public String Latina() {
	return "/lazio/latina/home-latina";
}

@GetMapping("/provincia-frosinone")
public String Frosinone() {
	return "/lazio/frosinone/home-frosinone";
}

@GetMapping("/giunta-lista-lazio")
public String listaGiunta(Model model) {
	
	ArrayList <GiuntaLazio> listaGiunta = null;
	listaGiunta = (ArrayList<GiuntaLazio>) lazioRepository.findAll();
	model.addAttribute("listaGiunta", listaGiunta);
	
	return "lazio/giuntaLazio/lista-giunta";
	


}






}
