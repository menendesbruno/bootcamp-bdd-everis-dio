package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class CarrinhoPage extends BasePage {

	@FindBy(xpath = "//*[text()='Proceed to checkout']")
	protected WebElement botaoAcessarCheckout;
	
	public CarrinhoPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}
	
	public boolean apresentouProdutoEsperadoNoCarrinho(String nomeProduto) {
		boolean apresentouProdutoEsperadoNoCarrinho = isElementDisplayed(By.xpath("//*[contains(@class,'cart_item')]//a[text()='" + nomeProduto + "']"));
		if (apresentouProdutoEsperadoNoCarrinho) {
			log("Apresentou o produto [" + nomeProduto + "] no carrinho conforme esperado.");
			return true;
		}
		logFail("Deveria ter apresentado o produto [" + nomeProduto + "] no carrinho.");
		return false;
	}

    public boolean oProdutoApresentouQuantidadeEsperada(String nomeProduto, String quantidadeProduto) {
		WebElement quantidadeProdutoApresentada = driver.findElement(By.xpath("//*[text()='" + nomeProduto + "']//ancestor::*[contains(@class, 'cart_item')]//*[contains(@class, 'cart_quantity_input')]"));
		boolean oProdutoApresentouQuantidadeEsperada = quantidadeProduto.equals(quantidadeProdutoApresentada.getAttribute("value"));
		if (oProdutoApresentouQuantidadeEsperada){
			log("Apresentou a quantidade de produtos conforme esperado.");
			return true;
		}
		logFail("Deveria ter apresentado" + quantidadeProduto);
		return false;

    }

	public void acessarCheckout() {
		botaoAcessarCheckout.click();
	}
}