package com.comcast.crm.productstest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepositaryutility.CreatingNewProductPage;
import com.comcast.crm.objectrepositaryutility.HomePage;
import com.comcast.crm.objectrepositaryutility.ProductInformationPage;
import com.comcast.crm.objectrepositaryutility.ProductsPage;

public class CreateProductsTest extends BaseClass {

	@Test
	public void createProductsTest() throws Throwable {

		String productName = eLib.getDataFromExcel("Products", 1, 2) + jLib.getRandomNumber();

		HomePage hp = new HomePage(driver);
		hp.getProLink().click();

		ProductsPage pg = new ProductsPage(driver);
		pg.getCreateNewProdBtn().click();

		CreatingNewProductPage cnp = new CreatingNewProductPage(driver);
		cnp.productInfo(productName);

		ProductInformationPage pig = new ProductInformationPage(driver);
		String actHeader = pig.getProductHeaderVeri().getText();
		boolean status = actHeader.contains(productName);
		Assert.assertEquals(status, true);

	}

	@Test
	public void CreateProductsWithQuantityTest() throws Throwable {
		String productQuantity = eLib.getDataFromExcel("Products", 4, 2) + jLib.getRandomNumber();
		String productName = eLib.getDataFromExcel("Products", 1, 2) + jLib.getRandomNumber();

		HomePage hp = new HomePage(driver);
		hp.getProLink().click();

		ProductsPage pg = new ProductsPage(driver);
		pg.getCreateNewProdBtn().click();

		CreatingNewProductPage cnp = new CreatingNewProductPage(driver);
		cnp.productWithQuantity(productName, productQuantity);

		ProductInformationPage pip = new ProductInformationPage(driver);
		String actHeader = pip.getProductHeaderVeri().getText();
		boolean status = actHeader.contains(productName);
		Assert.assertEquals(status, true);

	}
}