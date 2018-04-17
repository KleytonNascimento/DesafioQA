package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Transacoes {

	static WebDriver driver;

	public Transacoes(WebDriver driver) {
		this.driver = driver;
	}

	public void transacoesIncluir() {
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

		WebElement campoIncluirVenda = driver
				.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul[2]/li/ul/li[2]/ul/li[1]/a"));
		campoIncluirVenda.click();

		Select selecioneCliente = new Select(driver.findElement(By.id("cliente")));
		selecioneCliente.selectByVisibleText("Pedro Vinicios");

		WebElement valorTransacao = driver.findElement(By.id("valorTransacao"));
		valorTransacao.sendKeys("3000");

		WebElement botaoSalvar = driver.findElement(By.id("botaoSalvar"));
		botaoSalvar.click();

		WebElement botaoSair = driver.findElement(By.cssSelector("input.btn.btn-primary[type='submit']"));
		botaoSair.click();

	}
}
