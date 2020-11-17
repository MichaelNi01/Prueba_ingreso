package Choucair.Prueba.steps;

import java.awt.AWTException;

import Choucair.Prueba.pageobjects.Pageobjects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
Pageobjects pageo;

	public void abrir_navegador () {
		pageo.open();
	
	}
	
	public void ingresar_usuario (String arg1) {
		pageo.ingresar_usuario(arg1);
	}
	
	public void ingresar_pass (String arg1) {
		pageo.ingresar_pass(arg1);
	}
	
	public void validar_login () throws InterruptedException {
		pageo.validar_login();
	}
	
	public void seleccionar_modulo_post () {
		pageo.seleccionar_modulo_post();
	}
	
	public void validar_opciones_post () throws InterruptedException {
		pageo.validar_opciones_post();
	}
	
	public void seleccionar_allpost () {
		pageo.seleccionar_allpost();
	}
	
	public void validar_ingreso_allpost () throws InterruptedException {
		pageo.validar_ingreso_allpost();
	}
	
	public void seleccionar_addnew () {
		pageo.seleccionar_addnew();
	}
	
	public void validar_ingreso_addnew () throws InterruptedException {
		pageo.validar_ingreso_addnew();
	}
	
	public void seleccionar_categories () {
		pageo.seleccionar_categories();
	}
	
	public void validar_ingreso_categories () throws InterruptedException {
		pageo.validar_ingreso_categories();
	}
	
	public void seleccionar_tags () {
		pageo.seleccionar_tags();
	}
	
	public void validar_ingreso_tags () throws InterruptedException {
		pageo.validar_ingreso_tags();
	}
	
	public void validar_todos_los_post () {
		pageo.validar_todos_los_post();
	}
	
	public void seleccionar_mas_de_un_post () {
		pageo.seleccionar_mas_de_un_post();
	}
	
	public void seleccionar_accion_masiva () throws AWTException, InterruptedException {
		pageo.seleccionar_accion_masiva();
	}
	
	public void validar_accion_masiva () throws InterruptedException {
		pageo.validar_accion_masiva();
	}
	
	public void elimina_post() {
		pageo.eliminar_post();
	}
	
	public void validar_elimina_post () throws InterruptedException {
		pageo.validar_elimina_post();
	}
	
	public void editar_post () {
		pageo.editar_post();
	}
	
	public void ingresar_nueva_informacion (String arg1) throws InterruptedException {
		pageo.ingresar_nuevo_titulo(arg1);
	}
	
	public void actualizar () {
		pageo.actualizar();
	}
	
	public void validar_actualizacion (String arg1) {
		pageo.seleccionar_modulo_post();
		pageo.validar_actualizacion_post(arg1);
	}
	
	public void seleccionar_fecha () throws AWTException, InterruptedException {
		pageo.seleccionar_fecha();
	}
	
	public void aplicar_filtro () {
		pageo.aplicar_filtro();
	}
	
	public void validar_filtro () throws InterruptedException {
		pageo.validar_filtro();
	}
	
	public void publicar () throws InterruptedException {
		pageo.publicar();
	}
	
	public void validar_creacion_post (String arg1) {
		pageo.validar_creacion_post(arg1);
	}
}
