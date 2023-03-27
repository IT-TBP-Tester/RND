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
import com.kms.katalon.core.util.KeywordUtil
import groovy.sql.Sql
import groovy.sql.GroovyRowResult
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUIimport



import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement
import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.Driver

public class SQLHandler {

	private static Connection connection = null

	@Keyword
	def static executeQuery(String queryString) {
		// Untuk Local Database //
		/*String url = "jdbc:sqlserver://" + GlobalVariable.Localhost + ";databaseName=" + GlobalVariable.LocalDb + ";user=" + GlobalVariable.Username_Local + ";password=" + GlobalVariable.Password_Local*/

		// Untuk Non Local Database //
		String url = "jdbc:sqlserver://" + GlobalVariable.Server_db + ";databaseName=" + GlobalVariable.db + ";user=" + GlobalVariable.Username_db + ";password=" + GlobalVariable.Password_db
		if(connection != null && !connection.isClosed()){
			connection.close()
		}

		connection = DriverManager.getConnection(url)

		Statement stmt = connection.createStatement()
		ResultSet rs = stmt.executeQuery(queryString)

		//Move the cursor in the ResultSet table to the first row
		rs.next()

		//
		/*while (rs.next()) {
		 String kodeProyek = rs.getString("Kode_Proyek")
		 String tipe = rs.getString("Tipe")
		 String subGroup = rs.getString("SubGroup")
		 BigDecimal price = rs.getBigDecimal("SisaBudget")
		 System.out.println(kodeProyek + "\t" + tipe + "\t" + subGroup + "\t" + price + "\t")
		 }*/

		return rs
	}

	@Keyword
	def static executeUpdate(String queryString) {
		String url = "jdbc:sqlserver://" + GlobalVariable.Server_db + ";databaseName=" + GlobalVariable.db + ";user=" + GlobalVariable.Username_db + ";password=" + GlobalVariable.Password_db
		if(connection != null && !connection.isClosed()){
			connection.close()
		}

		connection = DriverManager.getConnection(url)

		Statement stmt = connection.createStatement()
		PreparedStatement ps
		String query = GlobalVariable.QueryUpdate
		try {
			ps = connection.prepareStatement(query)
			ResultSet rs = ps.executeQuery()
			connection.commit()
		} catch (Exception e) {
			e.printStackTrace()
		}
	}

	@Keyword
	def static closeDatabaseConnection() {
		if(connection != null && !connection.isClosed()){
			connection.close()
		}
		connection = null
	}

	@Keyword
	def execute(String queryString) {
		Statement stmt = connection.createStatement()
		boolean result = stmt.execute(queryString)
		return result
	}
}
