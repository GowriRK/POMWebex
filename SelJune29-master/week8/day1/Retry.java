package week8.day1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class Retry implements IRetryAnalyzer, IAnnotationTransformer{

	int iMaxTry = 3;
	int iCount = 1;

	public boolean retry(ITestResult result) {
		if(iCount < iMaxTry) {
			iCount++;
			return true;
		} else
			return false;
	}

	public void transform(ITestAnnotation annotation,
			Class testClass, 
			Constructor testConstructor, 
			Method testMethod) {

		annotation.setRetryAnalyzer(this.getClass());

	}



}
