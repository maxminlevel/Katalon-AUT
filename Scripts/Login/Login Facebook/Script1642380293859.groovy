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

WebUI.navigateToUrl('http://localhost:8080/')

WebUI.click(findTestObject('Object Repository/Thang/Facebook/Page_Element/a_Sign In'))

WebUI.click(findTestObject('Object Repository/Thang/Facebook/Page_Element/div_Forgot password_mx_AccessibleButton mx__35ae1c'))

WebUI.setText(findTestObject('Object Repository/Thang/Facebook/Page_Log in to Facebook  Facebook/input_Log in to Facebook_email'), 
    'thangdapchai@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Thang/Facebook/Page_Log in to Facebook  Facebook/input_Log in to Facebook_pass'), 
    '+zSzGdFpedaZTbwuAuC3TA==')

WebUI.sendKeys(findTestObject('Object Repository/Thang/Facebook/Page_Log in to Facebook  Facebook/input_Log in to Facebook_pass'), 
    Keys.chord(Keys.ENTER))

