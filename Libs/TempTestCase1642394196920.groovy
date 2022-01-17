import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\dell\\AppData\\Local\\Temp\\Katalon\\20220117_113636\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'http://localhost:8080/#/welcome\')\n\nWebUI.click(findTestObject(\'Object Repository/Khoa/Page_Element/a_Sign In\'))\n\nWebUI.setText(findTestObject(\'Object Repository/Khoa/Page_Element/input_Sign in with_username\'), \'catalontest1\')\n\nWebUI.setEncryptedText(findTestObject(\'Object Repository/Khoa/Page_Element/input_Username_password\'), \'IVP3EFuX5Soi+L5J3PmWRw==\')\n\nWebUI.click(findTestObject(\'Object Repository/Khoa/Page_Element/input_Forgot password_mx_Login_submit\'))\n\nWebUI.click(findTestObject(\'Object Repository/Khoa/Page_Element/div_Verify with Security Key\'))\n\nWebUI.setEncryptedText(findTestObject(\'Object Repository/Khoa/Page_Element/input_Security Key_mx_Field_4\'), \'KcTIxEe86JlbIbDMhEOGDxm8TOo5sVjpulf8hwfL6DCmnHQLN2q0ty2pbg9r9Jrm7267l8Wa9qCJrW4e/iwRSw==\')\n\nWebUI.click(findTestObject(\'Object Repository/Khoa/Page_Element/button_Continue\'))\n\nWebUI.click(findTestObject(\'Object Repository/Khoa/Page_Element/div_Done\'))\n\nWebUI.setText(findTestObject(\'Object Repository/Khoa/Page_Element/input_Ctrl K_mx_RoomSearch_input mx_RoomSea_5acfcf\'), \n    \'public-room-0001\')\n\n', FailureHandling.STOP_ON_FAILURE, true)

