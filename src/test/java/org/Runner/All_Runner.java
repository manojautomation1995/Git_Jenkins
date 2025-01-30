package org.Runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFiles", glue = { "org.Steps",
		"org.Hooks" }, dryRun = false, monochrome = true, plugin = { "pretty",
				"html:.\\AllReports\\Cucumber-report.html", "json:.\\AllReports\\Cucumber-report.json",
				"junit:.\\AllReports\\Cucumber-report.xml", "rerun:.\\AllReports\\failed.txt" })
public class All_Runner {

	@AfterClass
	public static void reportGeneration() {
		String timeStemp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		File f = new File(".\\AllReports\\cucumber-html-reports-"+timeStemp);
		Configuration c = new Configuration(f, "CucumberWithTestNG");
		c.addClassifications("Tester Name", "S.Manoj");
		c.addClassifications("OS", "Windows");
		List<String> l = new ArrayList<String>();
		l.add(".\\AllReports\\Cucumber-report.json");
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
		
	}

}
