package net.serenity.bdd.junit.cucumber.pages;


import java.io.File;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class DriverUtils {
	
	// public static XSSFSheet ExcelWSheet;
	// public static XSSFWorkbook ExcelWBook;
	 public static String executionResult = "";
  //   public static boolean htmlTestExecStatus = true;
     public static int StNo = 0;
	public static void selectOptionByVisibleText(final WebElement selectedElement, final String selectOption) {
		final Select select = new Select(selectedElement);
	//	DriverUtils.logReport("Selected the '"+selectOption+"' from dropdown","","INFO",false);
		select.selectByVisibleText(selectOption);
	}

	public static int selectOptionByIndex(final WebElement selectedElement, final Integer index) {
		final Select select = new Select(selectedElement);
		select.selectByIndex(index);
		return select.getOptions().size();
	}

	public static int selectOptionSize(final WebElement selectedElement) {
		final Select select = new Select(selectedElement);
		return select.getOptions().size();
	}

	public static Double selectRandomDropDown(WebElement dropDown) {
		return Math.floor(Math.random() * DriverUtils.selectOptionSize(dropDown));
	}
	
	public static String getSelectOptionDropDown(WebElement drodownElement) {
		final Select select = new Select(drodownElement);
		WebElement option= select.getFirstSelectedOption();
		String defaultval = option.getText();
		return defaultval;		
	}
	public static void delay(long timeToDelay) {
		try {
			Thread.sleep(timeToDelay);
		} catch (InterruptedException e) {
			e.getMessage();
		}
	}

	public static void chooseFile(final WebDriver driver, final WebElement element, final String fileName) {
		try {
			final File file = new File(Thread.currentThread().getContextClassLoader().getResource(fileName).getFile());
			element.sendKeys(file.getAbsolutePath());
		} catch (final Exception Ex) {
			System.out.println("file Not found:" + fileName);
			Ex.printStackTrace();
		}
	}

	

	/**
	 * Gets the unique id.
	 *
	 * @return the unique id
	 */
	public static String getUniqueId() {
		final DateFormat dateFormat2 = new SimpleDateFormat("yyMMdd");
		final DateFormat dateFormat1 = new SimpleDateFormat("HHmmss");
		final String now = dateFormat1.format(new Date());
		final String today = dateFormat2.format(new Date());
		return today + "_" + now;
	}
	
	/**
	 * Click at.
	 *
	 * @param driver
	 *            the driver
	 * @param by
	 *            the by
	 */
	public static void clickAt(final WebDriver driver, final By by) {
		final WebElement element = driver.findElement(by);
		final Actions builder = new Actions(driver);
		final Action action = builder.moveToElement(element).click().build();
		action.perform();
	}

	/**
	 * Clicks the at.
	 *
	 * @param driver
	 *            the driver
	 * @param by
	 *            the by
	 * @param xOffset
	 *            the x offset
	 * @param yOffset
	 *            the y offset
	 */
	public static void clickAt(final WebDriver driver, final By by, final  int xOffset,
			final int yOffset) {
		final WebElement element = driver.findElement(by);
		final Actions builder = new Actions(driver);
		final Action action = builder.moveToElement(element, xOffset, yOffset).click().build();
		action.perform();
	}

	/**
	 * Click at.
	 *
	 * @param driver
	 *            the driver
	 * @param element
	 *            the element
	 */
	public static void clickAt(final WebDriver driver, final WebElement element) {
		final Actions builder = new Actions(driver);
		final Action action = builder.moveToElement(element).click().build();
		action.perform();
	}

	/**
	 * Scroll down.
	 *
	 * @param driver
	 *            the driver
	 * @param pixelToScroll
	 *            the pixel to scroll
	 */
	public static  void scrollDown(final WebDriver driver, Integer pixelToScroll) {
		pixelToScroll = pixelToScroll == 0 ? 250 : pixelToScroll;
		final JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0, " + pixelToScroll.toString() + ");");
	}

	/**
	 * Scroll into view.
	 *
	 * @param driver
	 *            the driver
	 * @param by
	 *            the by
	 */
	public static void scrollIntoView(final WebDriver driver, final By by) {
		final WebElement element = driver.findElement(by);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		delay(500);
	}

	/**
	 * Scroll into view.
	 *
	 * @param driver
	 *            the driver
	 * @param element
	 *            the element
	 */
	public static  void scrollIntoView(final WebDriver driver, final WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		delay(500);
	}

	/**
	 * Scroll into view. viewStatus - accepted values : true, false
	 *
	 * @param driver
	 *            the driver
	 * @param element
	 *            the element
	 * @param viewStatus
	 *            the view status
	 * @param delayinMills
	 *            the ms
	 */
	public static void scrollIntoView(final WebDriver driver, final WebElement element, final String viewStatus,
			final int delayinMills) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(" + viewStatus + ");", element);
		delay(delayinMills);
	}

	/**
	 * Scroll to page top.
	 *
	 * @param driver
	 *            the driver
	 */
	public static void scrollToPageTop(final WebDriver driver) {
		final JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");
	}

	
	/**
	 * Scroll to bottom of page.
	 *
	 * @param driver
	 *            the driver
	 */
	public static void scrollToBottomOfPage(final WebDriver driver) {
		final JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}

	/**
	 * Scroll up.
	 *
	 * @param driver
	 *            the driver
	 * @param pixelToScroll
	 *            the pixel to scroll
	 */
	public static void scrollUp(final WebDriver driver, Integer pixelToScroll) {
		pixelToScroll = pixelToScroll == 0 ? 250 : pixelToScroll;
		final JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0, -" + StringUtils.strip(pixelToScroll.toString()) + ");");
	}
	
	//*************HTML Report*********************
/*	public static void collectReportDependentFiles(String destinationFolder, String fileNames[])
	{
		// Create Destination Folder
		new File(destinationFolder).mkdir();
		
		String sourceFilePath = null;
		
		for(String fileName: fileNames) {
			
		
		sourceFilePath = System.getProperty("user.dir") +"\\src\\test\\resources\\" + fileName;
		//	sourceFilePath = getCurrentProject().getLocation().toString() + "\\test-output\\" + fileName;
			copyFile(sourceFilePath, destinationFolder);
		}
	}
	@SuppressWarnings("resource")
	public static void copyFile(String sourceFilePath, String destinationFolder)
	{
		try{
			File source = new File(sourceFilePath);
			String fileName = new File(sourceFilePath).getName();
			File destination = new File(destinationFolder + "\\" + fileName);
			
			FileChannel sourceChannel = new FileInputStream(source).getChannel();
			FileChannel destChannel = new FileOutputStream(destination).getChannel();
	    	
			destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
			sourceChannel.close();
			destChannel.close();
		//	System.out.println("File Copy Successful");
		} catch (FileNotFoundException e) {
		//	logReport("Copy File from Source to Destination", "File NOT Present at - " + sourceFilePath, "FAIL", false);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void createLogHeader(String testName, String testDescription, String htmlTestResultFolder)
	{
		Date dt = new Date();
		SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String ReportHead = "<html>\n" +
			"<head>\n" +
				"<title>" + testName + "</title>\n" +
				"<link rel='stylesheet' type='text/css' href='../" + new File(htmlTestResultFolder).getName() + "/Supporting Files/design.css'>\n" +
				"<div class='inner-container' style='width: 1570px; margin: 0 auto;'>" + 
				"<div class='centered-content3'>" +
				"<img src='../" + new File(htmlTestResultFolder).getName() + "/Supporting Files/Informa-Logo.png' align='left'/>\n" +
				"<img src='../" + new File(htmlTestResultFolder).getName() + "/Supporting Files/IBM-Logo.png' align='right'/>\n" +
				"</div>\n" + "</div>" +			
				"</head>\n" +  
			"<body oncontextmenu='return false'>\n" + 
				"<table class='one' align='center'>\n" +
					"<col width='78%'>\n" + 
					"<col width='22%'>\n" +
					
					"<tr>\n" +
						"<th class='one1'>RESULT FOR : " + testName + "</th>\n" +
						"<th class='one1'>EXECUTION STATUS: PASS</th>\n" +
					"</tr>\n" +
						
					"<tr>\n" +
						"<td class='two'>" + testDescription + "</td>\n" + 
						"<td class='two'>EXEC. DATE : " +  sDate.format(dt) + "</td>\n" +
					"</tr>\n" +
				"</table>\n";
		executionResult = ReportHead;
	}
	
	public static void createResultDetailHeader()
	{
		String DetailHead = "<h2 font-family='Trebuchet MS' align='center'>Detailed Execution Result:</h2>\n" +
				"<table class='one' align='center'>\n" +
					"<col width='64'>\n"+
					"<col width='360'>\n"+
					"<col width='430'>\n"+
					"<col width='90'>\n" +
					"<col width='85'>\n" +
					
					"<tr>\n"+
						"<th class='two'>STEP NO.</th>\n"+
						"<th class='two'>STEP / VERIFICATION</th>\n"+
						"<th class='two'>ACTUAL OUTCOME</th>\n"+
						"<th class='two'>RESULT</th>\n" +
						"<th class='two'>EXEC. TIME</th>\n"+
					"</tr>\n";
		executionResult = executionResult + DetailHead;
	}
	
	public static void closeReportFile(String htmlTestResultFolder, String testName)
	{
	//	String reportLocation = Driver_Script.htmlTestResultFolder + "\\" + Driver_Script.testcase + ".txt";
		String reportLocation = htmlTestResultFolder + "\\" + testName + ".txt";
		File file = new File(reportLocation);
		try {
			BufferedWriter bw = null;
		//	if(!Driver_Script.htmlTestExecStatus){
			if(!BaseTest.htmlTestExecStatus){
				String currentLine = readEntireTextFile(reportLocation);
				bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile(), false));
				if(currentLineexecutionResult.contains("EXECUTION STATUS: PASS")){
					executionResult = executionResult.replace("EXECUTION STATUS: PASS", "EXECUTION STATUS: FAIL");
					bw.write(currentLine);
				}
				bw.close();
	            bw.flush();
			}
			// Append closing tags to complete HTML file
			bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile(), true));
			bw.write("</body></html>");
			bw.close();
		} catch(Exception e){}
		executionResult = executionResult + "</table></body></html>";
		writeTextFile(reportLocation, executionResult, false, false);
		// Change Report file extension to .html
		file.renameTo(new File(reportLocation.replace(".txt", ".html")));
	}
	
	public static void writeTextFile(String filePath, String content, boolean appendValue, boolean addNewLine)
	{
		try{	
			File file = new File(filePath);
	
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
	
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), appendValue);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			if(addNewLine){
				bw.newLine();
			}
			bw.flush();
			bw.close();
			System.out.println("Done");
	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void logReport(String sVerification, String sActualResult, String verdict,boolean isScreenRequired)
	{
		try {
				if(verdict.trim().equalsIgnoreCase("PASS")){
					System.out.println(verdict.toUpperCase() + ": " + sActualResult);
				} 
				else if(verdict.trim().equalsIgnoreCase("FAIL")){
					System.out.println(verdict.toUpperCase() + ": " + sActualResult);
					BaseTest.htmlTestExecStatus = false;
				}
				else if(verdict.trim().equalsIgnoreCase("WARNING")){
					System.out.println(verdict.toUpperCase() + ": " + sActualResult);
				}
				else if(verdict.trim().equalsIgnoreCase("INFO")){
					System.out.println(verdict.toUpperCase() + ": " + sVerification);
				}
				insertExecutionStep(sVerification, sActualResult, verdict,isScreenRequired,BaseTest.htmlTestResultFolder);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void insertExecutionStep(String expectedResult, String actualResult, String status,boolean isScreenRequired, String htmlTestresultFolder)
	{	
		//StNo = 0;
		StNo = ++BaseTest.stepCount;
		String colorCode = "";
		String mark = "";
		if(status.equalsIgnoreCase("PASS")){
			colorCode = "#319B1C";
			mark = "&#10004";
		}
		else if(status.equalsIgnoreCase("FAIL")){
			colorCode = "#FF0000";
			mark = "&#10008";
		}
		else if(status.equalsIgnoreCase("INFO")){
			colorCode = "#0000FF";
			mark = "&#10071";
		}
		else if(status.equalsIgnoreCase("WARNING")){
			status = "ALERT";
			colorCode = "#B8860B";
			mark = "&#10071";
		}
		
		String href = "";
		try {
			if(isScreenRequired){
				File file = new File(captureScreenShot(htmlTestresultFolder));
				href = "<a href='../" + new File(htmlTestresultFolder).getName() + "/" + file.getName() + "'>";
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}	
		Date dt = new Date();
		SimpleDateFormat sDate = new SimpleDateFormat("HH:mm:ss");
		
		String execSteps = "<tr>\n"+
					"<td class = 'one'>" + StNo + ".</td>\n"+
					"<td class = 'two'>" + expectedResult + "</td>\n"+
					"<td class = 'two'>" + actualResult + "</td>\n"+
					"<td class = 'one'>" + href + "<button class='fixedButton'><font color='" + colorCode + "'>" + mark + " " + status.toUpperCase() + "</font></button></td>\n" +
					"<td class = 'one'>" + sDate.format(dt) + "</td>\n" +
				"</tr>\n";
		executionResult = executionResult + execSteps;
	}
	public static void createBatchReport()
	{
		int passCount = 0;
		int failCount = 0;
	//	int testlenght = BaseTest.NumberOfTest.size();
		for(int iterator=0; iterator<BaseTest.NumberOfTest.size(); iterator++){
			if(BaseTest.testExecStatus.get(BaseTest.NumberOfTest.get(iterator)).toString().equalsIgnoreCase("PASS")) {
				passCount = passCount+1;
			}
			else if(BaseTest.testExecStatus.get(BaseTest.NumberOfTest.get(iterator)).toString().equalsIgnoreCase("FAIL")) {
				failCount = failCount+1;
			}
		}
		String appType = "Web";
		
		if(Driver_Script.ApplicationURL.equalsIgnoreCase("NA") || Driver_Script.ApplicationURL.equalsIgnoreCase("") || Driver_Script.ApplicationURL == null){
			appType = "Desktop";
		}
		String execSummary = "<html>\n" +
				"<head>\n" +
					"<title>Batch Execution Report</title>\n" +
					"<link rel='stylesheet' type='text/css' href='../" + new File(BaseTest.htmlBatchFolder).getName() + "/Supporting Files/design.css'>\n" +
					"<script src='../" + new File(BaseTest.htmlBatchFolder).getName() + "/Supporting Files/Chart.bundle.js'></script>\n" +
					"<script src='../" + new File(BaseTest.htmlBatchFolder).getName() + "/Supporting Files/jquery.min.js'></script>\n" +
				"</head>\n" +
		 
				"<body>\n" +
					"<h2 font-family='Trebuchet MS' align='center'>Batch Execution Summary - " + BaseTest.ApplicationName + "</h2>\n" +
					"<div class='inner-container' style='width: 1510px; margin: 0 auto;'>\n" +
						"<div class='centered-content1'>\n" +
							"<div class='chart-area' style='width:100%'>\n" +
							"<canvas id='chart-area'/>\n" +
							"</div>\n" +
						"</div>\n" +
				
						"<div class='centered-content2'>\n" +
							"<table class='two' align='left'>\n" +
								"<col width='200'>\n" +
								"<col width='200'>\n" +
								"<col width='200'>\n" +
								"<tr>\n" +
									"<th class='one2'>SYSTEM ENVIRONMENT</th>\n" +
									"<th class='one2'>OPERATING SYSTEM</th>\n" +
									"<th class='one2'>APPLICATION TYPE</th>\n" +
								"</tr>\n" +
								"<tr>\n" +
									"<td class='one'>" + BaseTest.SystemEnv + "</td>\n" +
									"<td class='one'> " + System.getProperty("os.name") + "</td>\n" +
									 "<td class='one'>" + appType + "</td>\n" +
								"</tr>\n" +
							"</table>\n" +
						"</div>\n" +
					"</div>\n" +
					"<script>\n" + 
						"var config = {\n" +
							"type: 'doughnut',\n" + 
							"data: {\n" +
							"datasets: [{\n" + 
							"data: [" + passCount + "," + failCount + "],\n" + 
							"backgroundColor: ['#319B1C', '#FF0000'],\n" + 
							"label: 'Dataset 1'}],\n" + 
							"labels: ['PASS = ' + " + passCount + ",'FAIL = ' +" + failCount + "],\n" + 
							//"labels: ['PASS', 'FAIL']\n" + 
						"},\n" +
						"options: {\n" +
							"responsive: true,\n" +
							"legend: {\n" +
								"position: 'bottom',\n" +
							"},\n" +
							"title: {\n" +
							"display: true,\n" +
							"text: 'Test Execution Summary'\n" +
						"},\n" +
						"animation: {\n" +
							"animateScale: true,\n" +
							"animateRotate: true\n" + 
							"}\n" +
						"}\n" +
					"};\n" +
			
					"window.onload = function() {\n" +
						"var ctx = document.getElementById('chart-area').getContext('2d');\n" +
						"window.myDoughnut = new Chart(ctx, config);\n" + 
					"};\n" +
				"</script>\n" +

		 		"<h2 font-family='Trebuchet MS' align='center'>Test Execution Detail</h2>\n" +
		 		"<table class='two' align='center'>\n" +
		 			"<col width='90'>\n" +
		 			"<col width='220'>\n" +
		 			"<col width='550'>\n" +
		 			"<col width='110'>\n" +
		 			"<col width='120'>\n" +

		 			"<tr>\n" +
		 				"<th class='two'>Sl NO.</th>\n" +
		 				"<th class='two'>TESTCASE NAME</th>\n" +
		 				"<th class='two'>TEST DESCRIPTION</th>\n" +
		 				"<th class='two'>TEST STATUS</th>\n" +
		 				"<th class='two'>DETAIL REPORT</th>\n" +
		 			"</tr>\n";
		writeTextFile(BaseTest.htmlBatchFolder + "\\Batch_Execution_Report.txt", execSummary, true, true);
		addTestEntry();
		
		File file = new File(BaseTest.htmlBatchFolder + "\\Batch_Execution_Report.txt");
		file.renameTo(new File(BaseTest.htmlBatchFolder + "\\Batch_Execution_Report.html"));
	}
	
	public static void addTestEntry()
	{
		String mark = "";
		String resultColor = "";
		for(int iterator=0; iterator<BaseTest.NumberOfTest.size(); iterator++){
			*//**
			 *  Collect Test Level Status
			 *//*
			try {
				if(BaseTest.testExecStatus.get(BaseTest.NumberOfTest.get(iterator)).toString().equalsIgnoreCase("PASS")) {
					resultColor = "#319B1C";
					mark = "&#10004";
				}
				else if(BaseTest.testExecStatus.get(BaseTest.NumberOfTest.get(iterator)).toString().equalsIgnoreCase("FAIL")) {
					resultColor = "#FF0000";
					mark = "&#10008";
				}
			} catch (NullPointerException e) {
				// TODO: handle exception
			}
			
			String href = "../" + new File(BaseTest.htmlBatchFolder).getName() + "/" + BaseTest.htmlTestFolderNameList.get(iterator) + "/" +  BaseTest.NumberOfTest.get(iterator) + ".html";
			String testEntry = "<tr>\n" +
				"<td class='one'>" + Integer.toString(iterator+1) + ".</td>\n" +
				"<td class='two'>" + BaseTest.NumberOfTest.get(iterator) + "</td>\n" +
				"<td class='two'>" + BaseTest.TestCaseDescription.get(iterator) + "</td>\n" +
				"<td class='one'><font color='" + resultColor + "'>" + mark + " " + BaseTest.testExecStatus.get(BaseTest.NumberOfTest.get(iterator)) + "</font></td>\n" +
				"<td class='one'><a href='" + href + "'<font color='#1116A5'>View Report</font></a></td>\n" +
			"</tr>\n";
			
			writeTextFile(BaseTest.htmlBatchFolder + "\\Batch_Execution_Report.txt", testEntry, true, true);
		}
		
		String htmlEnd = "</table>\n" +
				"</body>\n" +
			"</html>";
		writeTextFile(BaseTest.htmlBatchFolder + "\\Batch_Execution_Report.txt", htmlEnd, true, false);
	}
	public static String captureScreenShot(String htmlTestResultFolder)
	{
		String screenLocation = htmlTestResultFolder + "\\ScreenImg" + Integer.toString(BaseTest.stepCount) + ".jpg";
		try {
			Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage capture = new Robot().createScreenCapture(screenRect);
			ImageIO.write(capture, "jpg", new File(screenLocation));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return screenLocation;
	}
	
//***********************************************************Element screenshot
	public static void logTestReport(String sVerification, String sActualResult, String verdict,boolean isScreenRequired, WebElement elementName)
	{
		try {
				if(verdict.trim().equalsIgnoreCase("PASS")){
					System.out.println(verdict.toUpperCase() + ": " + sActualResult);
				} 
				else if(verdict.trim().equalsIgnoreCase("FAIL")){
					System.out.println(verdict.toUpperCase() + ": " + sActualResult);
					BaseTest.htmlTestExecStatus = false;
				}
				else if(verdict.trim().equalsIgnoreCase("WARNING")){
					System.out.println(verdict.toUpperCase() + ": " + sActualResult);
				}
				else if(verdict.trim().equalsIgnoreCase("INFO")){
					System.out.println(verdict.toUpperCase() + ": " + sVerification);
				}
				insertElementExecutionStep(sVerification, sActualResult, verdict,isScreenRequired,elementName,BaseTest.htmlTestResultFolder);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void insertElementExecutionStep(String expectedResult, String actualResult, String status,boolean isScreenRequired, WebElement element, String htmlTestresultFolder)
	{	
		//StNo = 0;
		StNo = ++BaseTest.stepCount;
		String colorCode = "";
		String mark = "";
		if(status.equalsIgnoreCase("PASS")){
			colorCode = "#319B1C";
			mark = "&#10004";
		}
		else if(status.equalsIgnoreCase("FAIL")){
			colorCode = "#FF0000";
			mark = "&#10008";
		}
		else if(status.equalsIgnoreCase("INFO")){
			colorCode = "#0000FF";
			mark = "&#10071";
		}
		else if(status.equalsIgnoreCase("WARNING")){
			status = "ALERT";
			colorCode = "#B8860B";
			mark = "&#10071";
		}
		
		String href = "";
		try {
			if(isScreenRequired){
				File file = new File(captureScreenShot(element,htmlTestresultFolder));
				href = "<a href='../" + new File(htmlTestresultFolder).getName() + "/" + file.getName() + "'>";
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}	
		Date dt = new Date();
		SimpleDateFormat sDate = new SimpleDateFormat("HH:mm:ss");
		
		String execSteps = "<tr>\n"+
					"<td class = 'one'>" + StNo + ".</td>\n"+
					"<td class = 'two'>" + expectedResult + "</td>\n"+
					"<td class = 'two'>" + actualResult + "</td>\n"+
					"<td class = 'one'>" + href + "<button class='fixedButton'><font color='" + colorCode + "'>" + mark + " " + status.toUpperCase() + "</font></button></td>\n" +
					"<td class = 'one'>" + sDate.format(dt) + "</td>\n" +
				"</tr>\n";
		executionResult = executionResult + execSteps;
	}
	public static String captureScreenShot(WebElement element, String htmlTestResultFolder)
	{
		String screenLocation = htmlTestResultFolder + "\\ScreenImg" + Integer.toString(BaseTest.stepCount) + ".jpg";
		try {
//			Screenshot screenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver,element);
			Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage capture = new Robot().createScreenCapture(screenRect);
			Point point = element.getLocation();
			// Get width and height of the element
			int eleWidth = element.getSize().getWidth();
			int eleHeight = element.getSize().getHeight();
			BufferedImage eleScreenshot= capture.getSubimage(point.getX(), point.getY(),eleWidth+50, eleHeight+10);
		//	ImageIO.write(eleScreenshot, "jpg", screenRect);
			ImageIO.write(eleScreenshot, "jpg", new File(screenLocation));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return screenLocation;
	} */
	
	
}
