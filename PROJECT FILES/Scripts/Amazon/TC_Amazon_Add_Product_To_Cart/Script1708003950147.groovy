import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.click(findTestObject('Object Repository/Amazon_Add_Product_To_Cart_OR/Page_Online Shopping site in India Shop Onl_10c5f3/span_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/Amazon_Add_Product_To_Cart_OR/Page_Amazon Sign In/input_Email or mobile phone number_email'), 
    'amrutha.ravisankar.04@gmail.com')

WebUI.click(findTestObject('Object Repository/Amazon_Add_Product_To_Cart_OR/Page_Amazon Sign In/input_Enter your email or mobile phone numb_fc7402'))

WebUI.setText(findTestObject('Object Repository/Amazon_Add_Product_To_Cart_OR/Page_Amazon Sign In/input_Forgot Password_password'), 
    'ammu0404')

WebUI.click(findTestObject('Object Repository/Amazon_Add_Product_To_Cart_OR/Page_Amazon Sign In/input_Enter your password_signInSubmit'))

WebUI.setText(findTestObject('Object Repository/Amazon_Add_Product_To_Cart_OR/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_field-keywords'), 
    'milton flask')

WebUI.click(findTestObject('Object Repository/Amazon_Add_Product_To_Cart_OR/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Amazon_Add_Product_To_Cart_OR/Page_Amazon.in  milton flask/img_-_s-image'))

WebUI.switchToWindowTitle('Milton Aura 1000 Thermosteel Bottle, 1.05 Litre, Silver | 24 Hours Hot and Cold | Easy to Carry | Rust & Leak Proof | Tea | Coffee | Office| Gym | Home | Kitchen | Hiking | Trekking | Travel Bottle : Amazon.in: Home & Kitchen')

WebUI.click(findTestObject('Object Repository/Amazon_Add_Product_To_Cart_OR/Page_Milton Aura 1000 Thermosteel Bottle, 1_4fcf33/input_Shipping cost, delivery date and orde_362d1e'))

WebUI.click(findTestObject('Object Repository/Amazon_Add_Product_To_Cart_OR/Page_Amazon.in Shopping Cart/a_Go to Cart'))

WebUI.closeBrowser()

