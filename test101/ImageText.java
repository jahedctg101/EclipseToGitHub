package Interview_Test;

import java.io.File;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ImageText {
//	static WebDriver browser;
	public static String extractTextImage(String filePath) throws TesseractException {
		
		File imgFile = new File(filePath);
		ITesseract instance = new Tesseract();
		instance.setDatapath("C:\\Batch2021-JUNE-SDET\\JAVA\\workspace\\A_Interview_Project\\testdata");
		String result=instance.doOCR(imgFile);
		
		return result;
		
	}

	public static void main(String[] args) throws TesseractException {
	

		String imgText=ImageText.extractTextImage("C:\\Batch2021-JUNE-SDET\\JAVA\\workspace\\A_Interview_Project\\img\\img2.jpg");
		System.out.print(imgText);
	}

}
