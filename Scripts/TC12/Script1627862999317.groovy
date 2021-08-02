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

WebUI.openBrowser('https://pastebin.com/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Pastebin_OR/Page_Pastebin.com - 1 paste tool since 2002/textarea_Syntax Highlighting_PostFormtext'),
	0)

WebUI.setText(findTestObject('Object Repository/Pastebin_OR/Page_Pastebin.com - 1 paste tool since 2002/textarea_Syntax Highlighting_PostFormtext'),
	'<!DOCTYPE html> <head><title>Page Title</title></head> <h1>This is a heading</h1> <p>This is a paragraph.</p>')

WebUI.click(findTestObject('Object Repository/Pastebin_OR/Page_Pastebin.com - 1 paste tool since 2002/span_None'))

WebUI.click(findTestObject('Object Repository/Pastebin_OR/Page_Pastebin.com - 1 paste tool since 2002/li_HTML'))

WebUI.click(findTestObject('Object Repository/Pastebin_OR/Page_Pastebin.com - 1 paste tool since 2002/span_Never'))

WebUI.click(findTestObject('Object Repository/Pastebin_OR/Page_Pastebin.com - 1 paste tool since 2002/li_Burn after read'))

WebUI.click(findTestObject('Object Repository/Pastebin_OR/Page_Pastebin.com - 1 paste tool since 2002/span_Public'))

WebUI.click(findTestObject('Object Repository/Pastebin_OR/Page_Pastebin.com - 1 paste tool since 2002/li_Public'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Pastebin_OR/Page_Pastebin.com - 1 paste tool since 2002/input_Disabled_PostFormpassword'))

WebUI.click(findTestObject('Object Repository/Pastebin_OR/Page_Pastebin.com - 1 paste tool since 2002/span'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Pastebin_OR/Page_Pastebin.com - 1 paste tool since 2002/input_Disabled_PostFormpassword'))

WebUI.setText(findTestObject('Object Repository/Pastebin_OR/Page_Pastebin.com - 1 paste tool since 2002/input_Disabled_PostFormpassword'),'loremipsumkk')

WebUI.verifyElementPresent(findTestObject('Object Repository/Pastebin_OR/Page_Pastebin.com - 1 paste tool since 2002/input_Paste Name  Title_PostFormname'),
	0)

WebUI.setText(findTestObject('Object Repository/Pastebin_OR/Page_Pastebin.com - 1 paste tool since 2002/input_Paste Name  Title_PostFormname'),'First Paste')

WebUI.click(findTestObject('Object Repository/Pastebin_OR/Page_Pastebin.com - 1 paste tool since 2002/button_Create New Paste'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pastebin_OR/Page_Pastebin.com - 1 paste tool since 2002/input_Enter password_PostPasswordVerificationFormpassword'),
	0)

WebUI.setText(findTestObject('Object Repository/Pastebin_OR/Page_Pastebin.com - 1 paste tool since 2002/input_Enter password_PostPasswordVerificationFormpassword'),'loremipsumkk')


