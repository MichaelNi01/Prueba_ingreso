package Choucair.Prueba.pageobjects;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.sourceforge.htmlunit.corejs.javascript.ArrowFunction;
import net.thucydides.core.annotations.DefaultUrl;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

@DefaultUrl("https://s1.demo.opensourcecms.com/wordpress/wp-login.php")

public class Pageobjects extends PageObject {
	
	String txt_inp_usuario = "/html[1]/body[1]/div[1]/form[1]/p[1]/label[1]/input[1]";
	String txt_inp_pass = "//input[@id='user_pass']";
	String txt_btn_login = "/html[1]/body[1]/div[1]/form[1]/p[4]/input[1]";
	String txt_lab_ingreso = "//a[contains(text(),'opensourcecms')]";
	String txt_cont_post = "//div[contains(text(),'Posts')]";
	String txt_cont_allpost = "//a[contains(text(),'All Posts')]";
	String txt_cont_addnew = "//body/div[@id='wpwrap']/div[@id='adminmenumain']/div[@id='adminmenuwrap']/ul[@id='adminmenu']/li[@id='menu-posts']/ul[1]/li[3]/a[1]";
	String txt_cont_categ = "//a[contains(text(),'Categories')]";
	String txt_cont_tags = "//a[contains(text(),'Tags')]";
	String txt_cont_postin = "//h1[contains(text(),'Posts')]";
	String txt_txt_title = "//textarea[@id='post-title-0']";
	String txt_txt_categories = "//h1[contains(text(),'Categories')]";
	String txt_txt_tags = "//h1[contains(text(),'Tags')]";
	String txt_num_post = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[5]/ul[1]/li[1]/a[1]/span[1]";
	String txt_cuenta_post = "//tr[@id='post-9']";
	String txt_lis_acciones = "//select[@id='bulk-action-selector-top']";
	String txt_btn_apply = "//input[@id='doaction']";
	String txt_txt_edit = "//legend[contains(text(),'Bulk Edit')]";
	String txt_btn_elimina = "//a[contains(text(),'Trash')]";
	String txt_txt_elimina = "//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[5]/div[1]/p[1]";
	String txt_btn_edita = "//tbody/tr[@id='post-1']/td[1]/div[3]/span[1]/a[1]";
	String txt_txt_titulo = "//textarea[@id='post-title-0']";
	String txt_btn_update = "//button[contains(text(),'Update')]";
	String txt_list_fecha = "//select[@id='filter-by-date']";
	String txt_btn_filtro = "//input[@id='post-query-submit']";
	String txt_val_fecha = "//abbr[contains(text(),'2018/10/02')]";
	String txt_brn_addnew = "//body/div[@id='wpwrap']/div[@id='adminmenumain']/div[@id='adminmenuwrap']/ul[@id='adminmenu']/li[@id='menu-posts']/ul[1]/li[3]/a[1]";
	String txt_btn_publicar = "//button[contains(text(),'Publish…')]";
	String txt_btn_publicar2 = "//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[5]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]";
	String txt_btn_ver = "//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[5]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/a[1]";
	
	public void ingresar_usuario (String arg1) {
		find(By.xpath(txt_inp_usuario)).sendKeys(arg1);
		
	}
	
	public void ingresar_pass (String arg1) {
		find(By.xpath(txt_inp_pass)).sendKeys(arg1);
		find(By.xpath(txt_btn_login)).click();
	}
	
	public void validar_login () throws InterruptedException {
		Thread.sleep(500);
		boolean ingreso = find(By.xpath(txt_lab_ingreso)).isVisible();
		assertTrue(ingreso);
	}
	
	public void seleccionar_modulo_post () {
		find(By.xpath(txt_cont_post)).click();
	}
	
	public void validar_opciones_post () throws InterruptedException {
		Thread.sleep(500);
		boolean allp = find(By.xpath(txt_cont_allpost)).isVisible();
		boolean addnew = find(By.xpath(txt_cont_addnew)).isVisible();
		boolean categories = find(By.xpath(txt_cont_categ)).isVisible();
		boolean tags = find(By.xpath(txt_cont_tags)).isVisible();
		
		assertTrue(allp & addnew & categories & tags);
	}
	
	public void seleccionar_allpost () {
		find(By.xpath(txt_cont_allpost)).click();
	}
	
	public void validar_ingreso_allpost () throws InterruptedException {
		Thread.sleep(500);
		boolean postin = find(By.xpath(txt_cont_postin)).isVisible();
		assertTrue(postin);
	}
	
	public void seleccionar_addnew() {
		find(By.xpath(txt_cont_addnew)).click();
	}
	
	public void validar_ingreso_addnew () throws InterruptedException {
		Thread.sleep(500);
		boolean title = find(By.xpath(txt_txt_title)).isVisible();
		assertTrue(title);
	}
	
	public void seleccionar_categories () {
		
		find(By.xpath(txt_cont_categ)).click();
	}
	
	public void validar_ingreso_categories () throws InterruptedException {
		Thread.sleep(500);
		boolean title = find(By.xpath(txt_txt_categories)).isVisible();
		assertTrue(title);
	}
	
	public void seleccionar_tags () {
		
		find(By.xpath(txt_cont_tags)).click();
		
	}
	
	public void validar_ingreso_tags () throws InterruptedException {
		Thread.sleep(500);
		boolean title = find(By.xpath(txt_txt_tags)).isVisible();
		assertTrue(title);
	}
	
	public void validar_todos_los_post () {
		String numero = find(By.xpath(txt_num_post)).getText();
		int contador = 0;
		boolean resultado= false;
		int num_post = Character.getNumericValue(numero.charAt(1));
		for (int i = 1; i < 100; i++) {
			String busca = "//tr[@id='post-"+String.valueOf(i)+"']";	
			boolean aumento;
			if (aumento = find(By.xpath(busca)).isVisible()) {
				contador ++;
			}
		}
		if (contador==num_post) {
			resultado = true;
		}
		assertTrue(resultado);
	}
	
	public void seleccionar_mas_de_un_post () {
		
		for (int i = 0; i < 50; i++) {
			String busca = "//input[@id='cb-select-"+String.valueOf(i)+"']";	
			boolean aumento;
			aumento = false;
			if (aumento = find(By.xpath(busca)).isVisible()) {
				find(By.xpath(busca)).click();
			}
		}
		
	}
	
	public void seleccionar_accion_masiva () throws AWTException, InterruptedException {
		
		Robot robot = new Robot();
		find(By.xpath(txt_lis_acciones)).click();
		robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        find(By.xpath(txt_btn_apply)).click();
	}
	
	public void validar_accion_masiva () throws InterruptedException {
		Thread.sleep(500);
		boolean title = find(By.xpath(txt_txt_edit)).isVisible();
		assertTrue(title);
	}
	
	public void eliminar_post () {
		
		for (int i = 0; i < 100; i++) {
			String busca = "//tbody/tr[@id='post-"+String.valueOf(i)+"']/td[1]";	
			boolean aumento;
			System.out.println(busca);
			
			aumento = false;
			if (aumento = find(By.xpath(busca)).isVisible()) {
				find(By.xpath(busca)).click();
				find(By.xpath("//tbody/tr[@id='post-"+String.valueOf(i)+"']/td[1]/div[3]/span[3]/a[1]")).click();
				i=100;
			}
		}
	}
	
	public void validar_elimina_post () throws InterruptedException {
		Thread.sleep(500);
		boolean title = find(By.xpath(txt_txt_elimina)).isVisible();
		assertTrue(title);
	}
	
	public void editar_post() {
		
		for (int i = 0; i < 100; i++) {
			String busca = "//tbody/tr[@id='post-"+String.valueOf(i)+"']/td[1]";	
			boolean aumento;
			System.out.println(busca);		
			aumento = false;
			if (aumento = find(By.xpath(busca)).isVisible()) {
				find(By.xpath(busca)).click();
				find(By.xpath("//tbody/tr[@id='post-"+String.valueOf(i)+"']/td[1]/div[3]/span[1]/a[1]")).click();
				i=100;
			}
		}
	}
	
	public void ingresar_nuevo_titulo (String arg1) {
		find(By.xpath(txt_txt_titulo)).clear();
		find(By.xpath(txt_txt_titulo)).sendKeys(arg1);
	}
	
	
	
	public void actualizar () {
		find(By.xpath(txt_btn_update)).click();
	}
	
	public void validar_actualizacion_post (String arg1) {
		
		boolean title = find(By.xpath("//a[contains(text(),'"+arg1+"')]")).isVisible();
		assertTrue(title);
	}
	
	public void seleccionar_fecha () throws AWTException, InterruptedException {
		
		Robot robot = new Robot();
		find(By.xpath(txt_list_fecha)).click();
		robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        
	}
	
	public void aplicar_filtro () {
		
		find(By.xpath(txt_btn_filtro)).click();
	}
	
	public void validar_filtro () throws InterruptedException {
		
		boolean validacion = find(By.xpath(txt_btn_filtro)).isVisible();
		assertTrue(validacion);
		
	}
	
	public void publicar () throws InterruptedException {
		find(By.xpath(txt_btn_publicar)).click();
		Thread.sleep(500);
		find(By.xpath(txt_btn_publicar2)).click();
		Thread.sleep(500);
		find(By.xpath(txt_btn_ver)).click();
	}
	
	public void validar_creacion_post (String arg1) {
		
		boolean title = find(By.xpath("//h1[contains(text(),'"+arg1+"')]")).isVisible();
		
		assertTrue(title);
	}
	
}
