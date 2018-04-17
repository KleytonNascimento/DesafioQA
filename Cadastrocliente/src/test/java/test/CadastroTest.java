package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.ListarClientes;
import pages.ListarTransacoes;
import pages.Login;
import pages.Transacoes;

public class CadastroTest {

	static WebDriver driver;
	static Login login;
	static ListarClientes listarClientes;
	static Transacoes transacoes;
	static ListarTransacoes listarTransacoes;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://desafioqa.marketpay.com.br:9081/desafioqa/login");
		login = new Login(driver);
		listarClientes = new ListarClientes(driver);
		transacoes = new Transacoes(driver);
		listarTransacoes = new ListarTransacoes(driver);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		// driver.close();
	}

	@Test
	public void test() {
		login.Logar();
	//	listarClientes.listar();
	//	transacoes.transacoesIncluir();
	//	listarTransacoes.transacoesSalvas();
	
	}

}
