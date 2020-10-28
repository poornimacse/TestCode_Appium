package Test;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;
import Page.AmazonApp_Page;

public class AmazonApp_TestCase extends AmazonApp{
		
		@Test(priority =0)
		public void loginToApp() {
			AmazonApp_Page login = new AmazonApp_Page(driver);
			String email = "appiumcodetest@gmail.com";
			String passCode ="Abcd@1234";
			login.loginPage(email, passCode);
			System.out.println("Logged In Successfully");
		}
		
		@Test(priority =1)
		public void searchTv(TouchActions action) {
			AmazonApp_Page searchItem = new AmazonApp_Page(driver);
			String itemName = "64 inch Tv";
			searchItem.searchItem(itemName, action);
			}
		@Test(priority=2)
		public void addItemToCart(TouchActions action) {
			AmazonApp_Page addItem = new AmazonApp_Page(driver);
			addItem.addToCart();
			}
		@Test(priority=3)
		public void addDeliveryAddress(TouchActions action) {
			AmazonApp_Page addDeliveryAddress = new AmazonApp_Page(driver);
			addDeliveryAddress.addAddress(action);
			}
		@Test(priority=4)
		public void proceedItemToBuy(TouchActions action) {
			AmazonApp_Page buyItem = new AmazonApp_Page(driver);
			buyItem.proceedToBuy(action);
			}
		}

