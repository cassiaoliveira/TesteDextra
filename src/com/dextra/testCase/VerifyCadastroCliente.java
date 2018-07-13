package com.dextra.testCase;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.Test;

import com.dextra.pageObjects.CadastroCliente;
import com.dextra.pageObjects.PesquisarProduto;
import com.dextra.pageObjects.SetUp;


class VerifyCadastroCliente {
	WebDriver driver;
	CadastroCliente cliente = new CadastroCliente(driver);
	SetUp inicializar       = new SetUp(driver);
	
	@Test	
	void testarEmailValido() throws InterruptedException {		
			
		cliente.abreLink("https://www.americanas.com.br");			
		cliente.acessaCadastroCliente();
		Thread.sleep(200);
		cliente.validaEmailCliente("teste@hotmail.com", "123", "33304880852", "Cassia de Oliveira", "22051984", "F", "11999347226");	   
		
	}
	
	@Test	
	void testarSenhaValida() throws InterruptedException {			
		cliente.abreLink("https://www.americanas.com.br");			
		cliente.acessaCadastroCliente();
		Thread.sleep(200);
		cliente.validaSenhaCliente("teste_novo@hotmail.com", "12", "33304880852", "Cassia de Oliveira", "22051984", "F", "11999347226");	
	}
	
	@Test	
	void testarCPFValido() throws InterruptedException {			
		cliente.abreLink("https://www.americanas.com.br");			
		cliente.acessaCadastroCliente();
		Thread.sleep(200);		
		cliente.validaCPFCliente("teste_novo@hotmail.com", "Dextra@2018", "11101111112", "Cassia de Oliveira", "22051984", "F", "11999347226"); 		
	}

	
	@Test	
	void testarCadastrarClienteSucesso() throws InterruptedException {			
		cliente.abreLink("https://www.americanas.com.br");			
		cliente.acessaCadastroCliente();
		Thread.sleep(200);		
		cliente.cadastraCliente("teste004@hotmail.com", "Dextra@2018", "66841332407", "Cassia de Oliveira", "22051984", "F", "11999347226"); 		
		Thread.sleep(200);
		cliente.pesquisaProdutos("moto G6");
		cliente.addProdutos();
		
	}
		
}
