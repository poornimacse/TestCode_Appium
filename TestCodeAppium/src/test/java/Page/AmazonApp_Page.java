package Page;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import Test.AmazonApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class AmazonApp_Page extends AmazonApp{
	
		AppiumDriver driver;
		@FindBy(id = "com.amazon.mShop.android.shopping:id/sign_in_button")
		MobileElement signInButton;
		@FindBy(id = "ap_email_login")
		MobileElement emailId;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget."
				+ "LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android."
				+ "webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android."
				+ "view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view."
				+ "View[4]/android.widget.Button) MobileElement continue_Button")
		MobileElement continueButton;
		@FindBy(id = "ap_password")
		MobileElement passWord;
		@FindBy(id = "signInSubmit")
		MobileElement loginButton;
		@FindBy(id = "com.amazon.mShop.android.shopping:id/rs_search_src_text")
		MobileElement searchBox;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView\r\n"
				+ "")
		MobileElement selectedTv;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView\r\n"
				+ "")
		MobileElement tvPrice;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView\r\n"
				+ "")
		MobileElement tvTittle;
		@FindBy(id = "add-to-cart-button")
		MobileElement addToCart;
		@FindBy(id = "com.amazon.mShop.android.shopping:id/action_bar_cart_image")
		MobileElement cartOption;
		@FindBy(id = "add-to-cart-button")
		MobileElement proceedToBuy;

		@FindBy(id = "address-ui-widgets-enterAddressFullName")
		MobileElement fullName;
		@FindBy(id = "address-ui-widgets-enterAddressPhoneNumber")
		MobileElement mobileNumber;
		@FindBy(id = "address-ui-widgets-enterAddressPostalCode")
		MobileElement pinCode;
		@FindBy(id = "address-ui-widgets-enterAddressLine1")
		MobileElement addressLine1;
		@FindBy(id = "address-ui-widgets-enterAddressLine2")
		MobileElement addressLine2;
		@FindBy(id = "address-ui-widgets-landmark")
		MobileElement landMark;
		@FindBy(id = "address-ui-widgets-enterAddressCity")
		MobileElement townName;
		@FindBy(id = "address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId")
		MobileElement stateDropdown;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[6]/android.widget.Button\r\n"
				+ "")
		MobileElement addAddress;

		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[3]/android.widget.Button\r\n"
				+ "")
		MobileElement deliveryContinueButton;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.RadioButton/android.view.View\r\n"
				+ "")
		MobileElement payOnDeliver_radio;
		@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button\r\n"
				+ "")
		MobileElement paymentContinueButton;

		public AmazonApp_Page(AppiumDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
	}
