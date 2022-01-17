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

WebUI.callTestCase(findTestCase('6. Login/Login with username'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://localhost:8080/#/home')

WebUI.click(findTestObject('Object Repository/Toan/Page_Element/div_Explore Public Rooms'))

WebUI.setText(findTestObject('Object Repository/Toan/Page_Element/input_Create a new room_dirsearch'), 'matrix hq')

WebUI.verifyElementText(findTestObject('Object Repository/Toan/Page_Element/div_Join'), 'Join')

WebUI.verifyElementClickable(findTestObject('Object Repository/Toan/Page_Element/div_Join'))

WebUI.click(findTestObject('Object Repository/Toan/Page_Element/div_Join'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Toan/Page_Element  Matrix HQ/div'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Toan/Page_Element  Matrix HQ/div'), '')

WebUI.verifyElementClickable(findTestObject('Object Repository/Toan/Page_Element  Matrix HQ/div'))

WebUI.setText(findTestObject('Object Repository/Toan/Page_Element  Matrix HQ/div_katalontest1matrix.org joined the room__396e34'), 
    '<div style=""><br></div>')

