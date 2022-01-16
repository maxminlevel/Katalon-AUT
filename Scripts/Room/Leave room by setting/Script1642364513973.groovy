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

WebUI.navigateToUrl('http://localhost:8080/#/room/#matrix:matrix.org')

WebUI.click(findTestObject('Object Repository/Toan/Page_Element  Matrix HQ/div_httpsmatrix.orglegalcode-of-conduct_mx__11ea0d'))

WebUI.click(findTestObject('Object Repository/Toan/Page_Element  Matrix HQ/div_httpsmatrix.orglegalcode-of-conduct_mx__96eaad'))

WebUI.verifyElementText(findTestObject('Object Repository/Toan/Page_Element  Matrix HQ/div_Room settings'), 'Room settings')

WebUI.verifyElementClickable(findTestObject('Object Repository/Toan/Page_Element  Matrix HQ/div_Room settings'))

WebUI.click(findTestObject('Object Repository/Toan/Page_Element  Matrix HQ/div_Room settings'))

WebUI.verifyElementText(findTestObject('Object Repository/Toan/Page_Element  Matrix HQ/font_Leave room'), 'Leave room')

WebUI.verifyElementClickable(findTestObject('Object Repository/Toan/Page_Element  Matrix HQ/font_Leave room'))

WebUI.click(findTestObject('Object Repository/Toan/Page_Element  Matrix HQ/font_Leave room'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Toan/Page_Element  Matrix HQ/div_Leave roomAre you sure you want to leav_dfbd4d (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Toan/Page_Element  Matrix HQ/button_Leave (1)'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Toan/Page_Element  Matrix HQ/font_Leave'), 'Leave')

WebUI.verifyElementClickable(findTestObject('Object Repository/Toan/Page_Element  Matrix HQ/button_Leave (1)'))

WebUI.click(findTestObject('Object Repository/Toan/Page_Element  Matrix HQ/font_Leave'))

WebUI.closeBrowser()

