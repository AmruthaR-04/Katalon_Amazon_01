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
    'amruthar@04')

WebUI.click(findTestObject('Object Repository/Amazon_Add_Product_To_Cart_OR/Page_Amazon Sign In/input_Enter your password_signInSubmit'))

WebUI.setText(findTestObject('Object Repository/Amazon_Add_Product_To_Cart_OR/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_field-keywords'), 
    'water bottle')

WebUI.click(findTestObject('Object Repository/Amazon_Add_Product_To_Cart_OR/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Amazon_Add_Product_To_Cart_OR/Page_Amazon.in  water bottle/div_-_a-section aok-relative s-image-square-aspect'))

WebUI.switchToWindowTitle('Speedex Stainless Steel 1000 ML Water Bottle/Thunder for fridge/School/Outdoor/Gym/Home/office/Boys/Girls/Kids, Leak Proof And BPA Free(DUAL-PINK-BLUE COLOUR, SIPPER CAP, SET OF 1, 1 LITRE) : Amazon.in: Home & Kitchen')

WebUI.click(findTestObject('Object Repository/Amazon_Add_Product_To_Cart_OR/Page_Speedex Stainless Steel 1000 ML Water _2a69a5/input_Shipping cost, delivery date and orde_362d1e'))

WebUI.click(findTestObject('Object Repository/Amazon_Add_Product_To_Cart_OR/Page_Amazon.in Shopping Cart/a_Go to Cart'))

WebUI.closeBrowser()

