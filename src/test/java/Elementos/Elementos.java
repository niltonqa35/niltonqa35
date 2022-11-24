 package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnAbrirConta = By.cssSelector("body > div.viewport-primary > nav.nav-desktop > div.right > div.nav-item.nav-item-nova-conta > a");
    private By btnAbrirContaParaVoce = By.id("bt1");
    private By campoNome = By.id("nome");
    private By campoTelefone = By.id("telefone");
    private By campoEmail = By.id("email");
    private By campoCpf = By.id("cpf");
    private By btnQueroSerCliente = By.id("btnEnviar");
    private By textoFaltaPouco = By.xpath("onetrust-accept-btn-handler");
    private By btnAbrirContapj = By.id("bt2");
    private By btnAbrirContaPessoaUnica = By.id("bt3");
   
    public By getBtnAbrirContapj() {
		return btnAbrirContapj;
	}

	public By getBtnAbrirContaPessoaUnica() {
		return btnAbrirContaPessoaUnica;
	}
	
	public By getTextoFaltaPouco() {
        return textoFaltaPouco;
    }
    public By getBtnAbrirConta() {
        return btnAbrirConta;
    }
    public By getBtnAbrirContaParaVoce() {
        return btnAbrirContaParaVoce;
    }
    public By getCampoNome() {
        return campoNome;
    }
    public By getCampoTelefone() {
        return campoTelefone;
    }
    public By getCampoEmail() {
        return campoEmail;
    }
    public By getCampoCpf() {
        return campoCpf;
    }
    public By getBtnQueroSerCliente() {
        return btnQueroSerCliente;
    }
    
    
    
}





