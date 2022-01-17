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

WebUI.navigateToUrl('http://localhost:8080/#/welcome')

WebUI.click(findTestObject('Object Repository/Khoa/Page_Element/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Khoa/Page_Element/input_Sign in with_username'), 'catalontest1')

WebUI.setEncryptedText(findTestObject('Object Repository/Khoa/Page_Element/input_Username_password'), 'IVP3EFuX5Soi+L5J3PmWRw==')

WebUI.click(findTestObject('Object Repository/Khoa/Page_Element/input_Forgot password_mx_Login_submit'))

WebUI.click(findTestObject('Object Repository/Khoa/Page_Element/div_Verify with Security Key'))

WebUI.setEncryptedText(findTestObject('Object Repository/Khoa/Page_Element/input_Security Key_mx_Field_4'), 'KcTIxEe86JlbIbDMhEOGDxm8TOo5sVjpulf8hwfL6DCmnHQLN2q0ty2pbg9r9Jrm7267l8Wa9qCJrW4e/iwRSw==')

WebUI.click(findTestObject('Object Repository/Khoa/Page_Element/button_Continue'))

WebUI.click(findTestObject('Object Repository/Khoa/Page_Element/div_Done'))

WebUI.rightClick(findTestObject('Object Repository/Khoa/Page_Element/span_P'))

WebUI.click(findTestObject('Object Repository/Khoa/Page_Element/span_Space'))

WebUI.setText(findTestObject('Object Repository/Khoa/Page_Element/input_Upload_spaceName'), 'Space In Space')

WebUI.click(findTestObject('Object Repository/Khoa/Page_Element/div_Add'))

WebUI.click(findTestObject('Object Repository/Khoa/Page_Element  Space In Space/div_Just meA private space to organize your rooms'))

WebUI.click(findTestObject('Object Repository/Khoa/Page_Element  Space In Space/div_Skip for now'))

WebUI.click(findTestObject('Object Repository/Khoa/Page_Element  Space In Space/div_Invite_mx_AccessibleButton mx_SpaceRoom_87964d'))

WebUI.click(findTestObject('Object Repository/Khoa/Page_Element  Space In Space/div_Leave Space'))

WebUI.click(findTestObject('Object Repository/Khoa/Page_Element  Space In Space/button_Leave space'))
