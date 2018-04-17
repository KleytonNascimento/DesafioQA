package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ListarTransacoes {
	
	static WebDriver driver;

	public ListarTransacoes(WebDriver driver) {
		this.driver = driver;
	}
	
	public void transacoesSalvas() {
		WebElement nome = driver.findElement(By.name("username"));
		nome.sendKeys("admin");

		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("admin");

		WebElement singin = driver.findElement(By.cssSelector("button.btn.btn-primary[type='submit']"));
		singin.click();

		WebElement campoQA = driver.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul[2]/li/a"));
		campoQA.click();

		WebElement campoTransacoes = driver.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul[2]/li/ul/li[2]/a"));
		campoTransacoes.click();

		WebElement listarVenda = driver
				.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul[2]/li/ul/li[2]/ul/li[2]/a"));
		listarVenda.click();
		
		Select selecioneCliente = new Select(driver.findElement(By.id("cliente")));
		selecioneCliente.selectByVisibleText("Pedro Vinicios");

		WebElement pesquisar = driver.findElement(By.xpath("//*[@id=\"formListarTransacao\"]/div/div/fieldset[2]/div/div/div/input"));
		pesquisar.click();
		
	}
	
}
