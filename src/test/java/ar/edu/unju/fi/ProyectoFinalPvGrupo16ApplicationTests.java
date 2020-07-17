package ar.edu.unju.fi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ar.edu.unju.fi.testeos.model.PersonaTesteada;
import ar.edu.unju.fi.testeos.model.RegistroTesteo;
import ar.edu.unju.fi.testeos.model.UnidadHabitacional;
import ar.edu.unju.fi.tracking.services.IBarrioServiceImp;
import ar.edu.unju.fi.tracking.services.IPersonaTesteadaService;
import ar.edu.unju.fi.tracking.services.IRegistroTesteoService;
import ar.edu.unju.fi.tracking.services.IUnidadHabitacionalService;
import ar.edu.unju.fi.trackpersonas.model.Barrio;

@SpringBootTest
class ProyectoFinalPvGrupo16ApplicationTests {

	@Autowired
	IPersonaTesteadaService personaService;
	@Autowired
	IRegistroTesteoService registroService;
	@Autowired
	IUnidadHabitacionalService unidadHabitacionalService;
	@Autowired
	IBarrioServiceImp barrioService;

	@Test
	void contextLoads() {
	}

	@Test
	void feto() {
		PersonaTesteada persona = new PersonaTesteada("335", "dominsd", "car", "negativo");
		List<Barrio> barrios = new ArrayList<Barrio>();
		/* barrios = barrioService.getAllBarrios(); */
		UnidadHabitacional unidad = new UnidadHabitacional("direccion", barrios.get(1));
		personaService.guardar(persona);
		unidadHabitacionalService.guardar(unidad);
		List<PersonaTesteada> personasTesteadas = new ArrayList<PersonaTesteada>();
		personasTesteadas.add(persona);
		RegistroTesteo registro = new RegistroTesteo(LocalDateTime.now(), unidad, personasTesteadas);
		registroService.guardar(registro);
	}
}
