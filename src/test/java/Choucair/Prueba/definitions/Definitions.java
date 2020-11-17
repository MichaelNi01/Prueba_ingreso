package Choucair.Prueba.definitions;

import java.awt.AWTException;

import Choucair.Prueba.steps.Step;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Definitions {
	
	@Steps
	Step pasos;
	
	@Given("^Abrir navegador e ingresar a la pagina Web$")
	public void abrir_navegador_e_ingresar_a_la_pagina_Web() {
		pasos.abrir_navegador();
	}


	@Given("^Ingresar usuario \"([^\"]*)\"$")
	public void ingresar_usuario_name(String arg1) {
		pasos.ingresar_usuario(arg1);
	}

	@When("^Ingresar \"([^\"]*)\" y hacer login$")
	public void ingresar_y_hacer_login(String arg1) {
		pasos.ingresar_pass(arg1);
	}

	@Then("^Validar login$")
	public void validar_login() throws InterruptedException {
		pasos.validar_login();
	}
	
	@When("^Hacer click en el modulo post$")
	public void hacer_click_en_el_modulo_post() {
		pasos.seleccionar_modulo_post();
	}

	@Then("^Validar opciones de el modulo post$")
	public void validar_opciones_de_el_modulo_post() throws InterruptedException {
	    pasos.validar_opciones_post();
	}
	
	@When("^Seleccionar la opcion allpost$")
	public void seleccionar_la_opcion_allpost() {
	    pasos.seleccionar_allpost();
	}

	@Then("^Validar ingreso a la opcion allpost$")
	public void validar_ingreso_a_la_opcion_allpost() throws InterruptedException {
	    pasos.validar_ingreso_allpost();
	}
	
	@When("^Seleccionar la opcion addnew$")
	public void seleccionar_la_opcion_addnew() {
		pasos.seleccionar_addnew();
	}


	@Then("^Validar ingreso a la opcion addnew$")
	public void validar_ingreso_a_la_opcion_addnew() throws InterruptedException {
		pasos.validar_ingreso_addnew();
	}
	
	@When("^Seleccionar la opcion categories$")
	public void seleccionar_la_opcion_categories() throws InterruptedException {
		pasos.seleccionar_categories();;
	}


	@Then("^Validar ingreso a la opcion categories$")
	public void validar_ingreso_a_la_opcion_categories() throws InterruptedException {
		pasos.validar_ingreso_categories();
	}
	
	@When("^Seleccionar la opcion tags$")
	public void seleccionar_la_opcion_tags() {
		pasos.seleccionar_tags();
	}


	@Then("^Validar ingreso a la opcion tags$")
	public void validar_ingreso_a_la_opcion_tags() throws InterruptedException {
		pasos.validar_ingreso_tags();
	}
	
	@Then("^Validar que cargan todos los post$")
	public void validar_que_cargan_todos_los_post() {
		pasos.validar_todos_los_post();
	}
	
	@When("^Seleccionar mas de un post$")
	public void seleccionar_mas_de_un_post() {
		pasos.seleccionar_mas_de_un_post();
	}


	@When("^Seleccionar una accion masiva y dar click en apply$")
	public void seleccionar_una_accion_masiva_y_dar_click_en_apply() throws AWTException, InterruptedException {
		pasos.seleccionar_accion_masiva();
	}

	@Then("^validar que se aplico la accion$")
	public void validar_que_se_aplico_la_accion() throws InterruptedException {
	    pasos.validar_accion_masiva();
	}
	
	@When("^Eliminar un post$")
	public void eliminar_un_post() {
		pasos.elimina_post();
	}


	@Then("^validar que se elimino$")
	public void validar_que_se_elimino() throws InterruptedException {
		pasos.validar_elimina_post();
	}

	@When("^Editar post$")
	public void editar_post() {
		pasos.editar_post();
	}


	@When("^Ingresar nuevo \"([^\"]*)\">$")
	public void ingresar_nuevo(String arg1) throws InterruptedException {
		pasos.ingresar_nueva_informacion(arg1);
	}


	@When("^Publicar$")
	public void publicar() {
		pasos.actualizar();
	}

	@Then("^Validar nueva informacion \"([^\"]*)\"$")
	public void validar_nueva_informacion(String arg1) {
		pasos.validar_actualizacion(arg1);
	}
	
	@When("^Seleccionar fecha$")
	public void seleccionar_fecha() throws AWTException, InterruptedException {
		pasos.seleccionar_fecha();
	}


	@When("^Aplicar filtro$")
	public void aplicar_filtro() throws AWTException, InterruptedException {
	    pasos.aplicar_filtro();
	}

	@Then("^Validar filtro$")
	public void validar_filtro() throws InterruptedException {
		pasos.validar_filtro();
	}
	
	@When("^Seleccionar addnew$")
	public void seleccionar_addnew() {
	   pasos.seleccionar_addnew();
	}


	@When("^Ingresar \"([^\"]*)\"$")
	public void ingresar(String arg1) throws InterruptedException {
		pasos.ingresar_nueva_informacion(arg1);
		
	}

	@When("^publicar y ver resultado$")
	public void publicar_y_ver_resultado() throws InterruptedException {
		pasos.publicar();
	}

	@Then("^Validar la informacion \"([^\"]*)\"$")
	public void validar_la_informacion(String arg1) {
		pasos.validar_creacion_post(arg1);
	}

}
