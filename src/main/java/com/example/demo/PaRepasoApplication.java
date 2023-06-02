package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class PaRepasoApplication implements CommandLineRunner{
	
	@Autowired
	private EstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(PaRepasoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Estudiante miEstudiante= new Estudiante();
		miEstudiante.setApellido("Aguas");
		miEstudiante.setCedula("1724");
		miEstudiante.setNombre("Roberto");
		miEstudiante.setFechaNacimiento(LocalDateTime.of(1999, 03, 9, 10, 30));
		
		Estudiante miEstudiante2= new Estudiante();
		miEstudiante2.setApellido("Valencia");
		miEstudiante2.setCedula("1234");
		miEstudiante2.setNombre("Nahomi");
		miEstudiante2.setFechaNacimiento(LocalDateTime.of(2001, 04, 5, 10, 30));
		
		Estudiante miEstudiante3= new Estudiante();
		miEstudiante3.setApellido("Bolaños");
		miEstudiante3.setCedula("1710");
		miEstudiante3.setNombre("Patricio");
		miEstudiante3.setFechaNacimiento(LocalDateTime.of(2001, 04, 5, 10, 30));
		//1.Guardar
		this.estudianteService.guardar(miEstudiante);
		this.estudianteService.guardar(miEstudiante2);
		this.estudianteService.guardar(miEstudiante3);

		
		
		
		//5.Imprimir Reporte
		List<Estudiante>reporte=this.estudianteService.reporteDeTodos();
		System.out.println("Reporte de todos los Estudiantes");
		for(Estudiante estu: reporte) {
			System.out.println(estu);
			
		}
		
		//2.Actualizar
		miEstudiante.setApellido("Venegas");
		this.estudianteService.actualizar(miEstudiante);
	
		
		//5.Imprimir Reporte
		List<Estudiante>reporte2=this.estudianteService.reporteDeTodos();
		System.out.println("Reporte 2 de todos los Estudiantes");
		for(Estudiante estu: reporte2) {
			System.out.println(estu);
			
		}
		
		//3.Eliminar
		this.estudianteService.borrar("1710");
		//5.Imprimir Reporte
		List<Estudiante>reporte3=this.estudianteService.reporteDeTodos();
		System.out.println("Reporte 3 de todos los Estudiantes");
		for(Estudiante estu: reporte3) {
			System.out.println(estu);
			
		}
		
		/*//4.Buscar
		Estudiante estudianteEncontrado= this.estudianteService.buscarPorCedula("123456877");
		System.out.println("Estudainte Encontrado");
		System.out.println(estudianteEncontrado);
		
		Estudiante estudianteEncontrado2= this.estudianteService.buscarPorCedula("0105966337");
		System.out.println("Estudainte No Encontrado");
		System.out.println(estudianteEncontrado2);*/
		
		

		
	}

}
