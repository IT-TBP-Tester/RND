package mypackage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class userForm {

	@Keyword
	public static void BiayaUmum() {

		WebUI.click(findTestObject('Object Repository/Button Global/Main_Kode_Proyek'))

		WebUI.setText(findTestObject('Object Repository/Button Global/input_select2'), GlobalVariable.Kode_Proyek)

		WebUI.click(findTestObject('Object Repository/Button Global/Select2 Result'), FailureHandling.STOP_ON_FAILURE)

		WebUI.waitForPageLoad(5)

		WebUI.waitForElementClickable(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'), 2)

		WebUI.click(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'))

		WebUI.setText(findTestObject('Object Repository/Button Global/input_Menu_Search'),
				'Biaya Umum')

		WebUI.click(findTestObject('Object Repository/Button Global/span_Procurement'))

		WebUI.click(findTestObject('Object Repository/Button Global/span_Tender'))

		WebUI.click(findTestObject('Object Repository/Button Global/span_BiayaUmum'))

		WebUI.click(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'))
	}

	@Keyword
	public static void PengajuanCash() {

		WebUI.click(findTestObject('Object Repository/Button Global/Main_Kode_Proyek'))

		WebUI.setText(findTestObject('Object Repository/Button Global/input_select2'), GlobalVariable.CO)

		WebUI.click(findTestObject('Object Repository/Button Global/Select2 Result'), FailureHandling.STOP_ON_FAILURE)

		WebUI.waitForPageLoad(5)

		WebUI.waitForElementClickable(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'), 2)

		WebUI.click(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'))

		//WebUI.setText(findTestObject('Object Repository/Button Global/input_Menu_Search'),'Pengajuan Cash')

		WebUI.click(findTestObject('Object Repository/Button Global/span_Cash Management'))

		WebUI.click(findTestObject('Object Repository/Button Global/span_Transaction'))

		WebUI.click(findTestObject('Object Repository/Button Global/span_Pengajuan Cash'))

		WebUI.click(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'))
	}

	@Keyword
	public static void PriceList() {

		WebUI.click(findTestObject('Object Repository/Button Global/Main_Kode_Proyek'))

		WebUI.setText(findTestObject('Object Repository/Button Global/input_select2'), GlobalVariable.Kode_Proyek)

		WebUI.click(findTestObject('Object Repository/Button Global/Select2 Result'), FailureHandling.STOP_ON_FAILURE)

		WebUI.waitForPageLoad(5)

		WebUI.waitForElementClickable(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'), 2)

		WebUI.click(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'))

		WebUI.setText(findTestObject('Object Repository/Button Global/input_Menu_Search'),
				'Biaya Umum')

		WebUI.click(findTestObject('Object Repository/Button Global/span_Procurement'))

		WebUI.click(findTestObject('Object Repository/Button Global/span_Tender'))

		WebUI.click(findTestObject('Object Repository/Button Global/span_BiayaUmum'))

		WebUI.click(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'))
	}

	@Keyword
	public static void Bank_Garansi_Asuransi() {

		WebUI.click(findTestObject('Object Repository/Button Global/Main_Kode_Proyek'))

		WebUI.setText(findTestObject('Object Repository/Button Global/input_select2'), GlobalVariable.Kode_Proyek)

		WebUI.click(findTestObject('Object Repository/Button Global/Select2 Result'), FailureHandling.STOP_ON_FAILURE)

		WebUI.waitForPageLoad(5)

		WebUI.waitForElementClickable(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'), 2)

		WebUI.click(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'))

		WebUI.setText(findTestObject('Object Repository/Button Global/input_Menu_Search'),
				'Asuransi')

		WebUI.click(findTestObject('Object Repository/Button Global/span_Bank Garansi'))

		WebUI.click(findTestObject('Object Repository/Button Global/span_Master'))

		WebUI.click(findTestObject('Object Repository/Button Global/span_Asuransi'))

		WebUI.click(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'))
	}

	@Keyword
	public static void Bank_Garansi_Fasilitas() {

		WebUI.click(findTestObject('Object Repository/Button Global/Main_Kode_Proyek'))

		WebUI.setText(findTestObject('Object Repository/Button Global/input_select2'), GlobalVariable.Kode_Proyek)

		WebUI.click(findTestObject('Object Repository/Button Global/Select2 Result'), FailureHandling.STOP_ON_FAILURE)

		WebUI.waitForPageLoad(5)

		WebUI.waitForElementClickable(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'), 2)

		WebUI.click(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'))

		WebUI.setText(findTestObject('Object Repository/Button Global/input_Menu_Search'),
				'Fasilitas')

		WebUI.click(findTestObject('Object Repository/Button Global/span_Bank Garansi'))

		WebUI.click(findTestObject('Object Repository/Button Global/span_Master'))

		WebUI.click(findTestObject('Object Repository/Button Global/span_Fasilitas'))

		WebUI.click(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'))
	}

	@Keyword
	public static void Master_Customer() {

		WebUI.click(findTestObject('Object Repository/Button Global/Main_Kode_Proyek'))

		WebUI.setText(findTestObject('Object Repository/Button Global/input_select2'), GlobalVariable.Acc)

		WebUI.click(findTestObject('Object Repository/Button Global/Select2 Result'), FailureHandling.STOP_ON_FAILURE)

		WebUI.waitForPageLoad(5)

		WebUI.waitForElementClickable(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'), 2)

		WebUI.click(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'))

		WebUI.setText(findTestObject('Object Repository/Button Global/input_Menu_Search'),
				'Customer')

		WebUI.click(findTestObject('Object Repository/Button Global/span_Procurement'))

		WebUI.click(findTestObject('Object Repository/Button Global/span_Master_Procurement'))

		WebUI.click(findTestObject('Object Repository/Button Global/span_Customer'))

		WebUI.click(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'))
	}

	@Keyword
	public static void Penempatan_Asuransi() {

		WebUI.click(findTestObject('Object Repository/Button Global/Main_Kode_Proyek'))

		WebUI.setText(findTestObject('Object Repository/Button Global/input_select2'), GlobalVariable.Acc)

		WebUI.click(findTestObject('Object Repository/Button Global/Select2 Result'), FailureHandling.STOP_ON_FAILURE)

		WebUI.waitForPageLoad(5)

		WebUI.waitForElementClickable(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'), 2)

		WebUI.click(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'))

		WebUI.setText(findTestObject('Object Repository/Button Global/input_Menu_Search'),
				'Penempatan Asuransi')

		WebUI.click(findTestObject('Object Repository/Button Global/span_Procurement'))

		WebUI.click(findTestObject('Object Repository/Button Global/span_Transaksi'))

		WebUI.click(findTestObject('Object Repository/Button Global/span_Penempatan Asuransi'))
	}

	@Keyword
	public static void SPK() {

		WebUI.click(findTestObject('Object Repository/Button Global/Main_Kode_Proyek'))

		WebUI.setText(findTestObject('Object Repository/Button Global/input_select2'), GlobalVariable.Kode_Proyek)

		WebUI.click(findTestObject('Object Repository/Button Global/Select2 Result'), FailureHandling.STOP_ON_FAILURE)

		WebUI.waitForPageLoad(5)

		WebUI.waitForElementClickable(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'), 2)

		WebUI.click(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'))

		WebUI.setText(findTestObject('Object Repository/Button Global/input_Menu_Search'),
				'Surat Perintah Kerja (SPK)')

		WebUI.click(findTestObject('Object Repository/Button Global/span_Procurement'))

		WebUI.click(findTestObject('Object Repository/Button Global/span_Transaksi'))

		WebUI.click(findTestObject('Object Repository/Button Global/span_SPK'))
	}
}
