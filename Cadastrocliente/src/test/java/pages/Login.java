package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Login {
	static WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void Logar() {
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

		WebElement campoIncluir = driver
				.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul[2]/li/ul/li[1]/ul/li[1]/a"));
		campoIncluir.click();

		WebElement nomeCliente = driver.findElement(By.id("nome"));
		nomeCliente.sendKeys("Pedro Vinicios");

		WebElement cpfCliente = driver.findElement(By.id("cpf"));
		cpfCliente.sendKeys("04701771287");

		Select statusCliente = new Select(driver.findElement(By.id("status")));
		statusCliente.selectByValue("false");
		// statusCliente.selepaintctByVisibleText("Inativo");

		WebElement saldoCliente = driver.findElement(By.name("saldoCliente"));
		saldoCliente.sendKeys("55500");

		WebElement botaoSalvar = driver.findElement(By.id("botaoSalvar"));
		botaoSalvar.click();

		WebElement botaoSair = driver.findElement(By.cssSelector("input.btn.btn-primary[type='submit']"));
		botaoSair.click();

	}
}
