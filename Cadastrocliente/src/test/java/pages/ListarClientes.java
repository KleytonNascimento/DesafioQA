package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListarClientes {
	static WebDriver driver;

	public ListarClientes (WebDriver driver) {
		this.driver = driver;
	}

	public void listar() {

		WebElement nome = driver.findElement(By.name("username"));
		nome.sendKeys("admin");

		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("admin");

		WebElement singin = driver.findElement(By.cssSelector("button.btn.btn-primary[type='submit']"));
		singin.click();

		WebElement campoQA = driver.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul[2]/li/a"));
		campoQA.click();
		
		WebElement campoCliente = driver.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul[2]/li/ul/li[1]/a"));
		campoCliente.click();
		
		WebElement campoListar = driver.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul[2]/li/ul/li[1]/ul/li[2]/a"));
		campoListar.click();
		
		WebElement nomeListar = driver.findElement(By.name("j_idt17"));
		nomeListar.sendKeys("Pedro");
		
		WebElement pesquisar = driver.findElement(By.cssSelector("input.btn.btn-primary.form-control[type='submit']"));
		pesquisar.click();
		
	}

}
