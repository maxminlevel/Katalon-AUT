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

WebUI.click(findTestObject('Object Repository/Toan/Page_Element/div_Explore Public Rooms'))

WebUI.setText(findTestObject('Object Repository/Toan/Page_Element/input_Create a new room_dirsearch'), 'matrix hq')

WebUI.sendKeys(findTestObject('Object Repository/Toan/Page_Element/input_Create a new room_dirsearch'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Toan/Page_Element/div_Join'))

WebUI.click(findTestObject('Object Repository/Toan/Page_Element/div_Matrix HQ_mx_AccessibleButton mx_RoomTi_8b827b'))

WebUI.verifyElementText(findTestObject('Object Repository/Toan/Page_Element/span_Favorite'), 'Favorite')

WebUI.click(findTestObject('Object Repository/Toan/Page_Element/span_Favorite'))

WebUI.click(findTestObject('Object Repository/Toan/Page_Element/div_Matrix HQ_mx_AccessibleButton mx_RoomTi_8b827b'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Toan/Page_Element/span_Favorited_mx_IconizedContextMenu_icon _f76564'))

WebUI.verifyElementText(findTestObject('Object Repository/Toan/Page_Element/span_Favorited'), 'Favorited')

WebUI.click(findTestObject('Object Repository/Toan/Page_Element/span_Favorited'))

WebUI.click(findTestObject('Object Repository/Toan/Page_Element/div_Matrix HQ_mx_AccessibleButton mx_RoomTi_8b827b'))

WebUI.verifyElementText(findTestObject('Object Repository/Toan/Page_Element/span_Leave'), 'Leave')

WebUI.click(findTestObject('Object Repository/Toan/Page_Element/span_Leave'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Toan/Page_Element/div_Leave roomAre you sure you want to leav_dfbd4d'))

WebUI.verifyElementText(findTestObject('Object Repository/Toan/Page_Element/button_Leave'), 'Leave')

WebUI.click(findTestObject('Object Repository/Toan/Page_Element/button_Leave'))

WebUI.closeBrowser()

