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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:8080/')

WebUI.click(findTestObject('Object Repository/Thang/Chat/Page_Element/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Thang/Chat/Page_Element/input_Sign in with_username'), 'thanghkt56')

WebUI.setEncryptedText(findTestObject('Object Repository/Thang/Chat/Page_Element/input_Username_password'), '+zSzGdFpedZPFbqqaByDKA==')

WebUI.sendKeys(findTestObject('Object Repository/Thang/Chat/Page_Element/input_Username_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Thang/Chat/Page_Element/div_Verify with Security Key'))

WebUI.setEncryptedText(findTestObject('Object Repository/Thang/Chat/Page_Element/input_Security Key_mx_Field_4'), 'jU5KHmhM69TECKG/+ViOSdOFTDhUdsXajrhKfKNscDFOOBfDE+F+ZVmpK1vVtnKaXET8vz8hIBxpVe6duUAOiA==')

WebUI.click(findTestObject('Object Repository/Thang/Chat/Page_Element/button_Continue'))

WebUI.click(findTestObject('Object Repository/Thang/Chat/Page_Element/div_Done'))

WebUI.click(findTestObject('Object Repository/Thang/Chat/Page_Element/div_Room Chat 2'))

WebUI.setText(findTestObject('Object Repository/Thang/Chat/Page_Element  Room Chat 2/div_hello panj'), 'hello pạn')

WebUI.click(findTestObject('Object Repository/Thang/Chat/Page_Element  Room Chat 2/div_hello panj_mx_AccessibleButton mx_Messa_e286b9'))

WebUI.click(findTestObject('Object Repository/Thang/Chat/Page_Element  Room Chat 2/div_'))

WebUI.click(findTestObject('Object Repository/Thang/Chat/Page_Element  Room Chat 2/div_hello panj_mx_ContextualMenu_background'))

WebUI.click(findTestObject('Object Repository/Thang/Chat/Page_Element  Room Chat 2/div_hello panj_mx_AccessibleButton mx_Messa_9a197f'))

