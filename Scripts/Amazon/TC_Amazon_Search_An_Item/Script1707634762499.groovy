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

WebUI.click(findTestObject('Object Repository/Amazon_Search_An_Item_OR/Page_Online Shopping site in India Shop Onl_10c5f3/span_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/Amazon_Search_An_Item_OR/Page_Amazon Sign In/input_Email or mobile phone number_email'), 
    'amrutha.ravisankar.04@gmail.com')

WebUI.click(findTestObject('Object Repository/Amazon_Search_An_Item_OR/Page_Amazon Sign In/input_Enter your email or mobile phone numb_fc7402'))

WebUI.setText(findTestObject('Object Repository/Amazon_Search_An_Item_OR/Page_Amazon Sign In/input_Forgot Password_password'), 
    'amruthar@04')

WebUI.click(findTestObject('Object Repository/Amazon_Search_An_Item_OR/Page_Amazon Sign In/input_Enter your password_signInSubmit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Amazon_Search_An_Item_OR/Page_Online Shopping site in India Shop Onl_10c5f3/select_All Categories        Alexa Skills  _59be89'), 
    'search-alias=stripbooks', true)

WebUI.setText(findTestObject('Object Repository/Amazon_Search_An_Item_OR/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_field-keywords'), 
    'da vinci code ')

WebUI.click(findTestObject('Object Repository/Amazon_Search_An_Item_OR/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Amazon_Search_An_Item_OR/Page_Amazon.in  da vinci code/div_Results_a-section aok-relative s-image-_a39021'))

WebUI.switchToWindowTitle('The Da Vinci Code (Abridged Edition) [Paperback] Brown, Dan : BROWN DAN: Amazon.in: Books')

WebUI.click(findTestObject('Object Repository/Amazon_Search_An_Item_OR/Page_The Da Vinci Code (Abridged Edition) P_54f610/span_The Da Vinci Code (Abridged Edition) P_4896eb'))

WebUI.closeBrowser()

