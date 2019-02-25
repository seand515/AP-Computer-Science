/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
	/** Method to test zeroBlue */
	public static void testZeroBlue() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	public static void testNoRed() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroRed();
		beach.explore();
	}

	public static void BlackAndWhite() {
		Picture pic = new Picture("femaleLionAndHall.jpg");
		int avg = 0;
		pic.explore();
		Pixel[][] pixels = pic.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixObj : rowArray) {
				avg = (int) pixObj.getAverage();
				pixObj.setBlue(avg);
				pixObj.setGreen(avg);
				pixObj.setRed(avg);

			}
		}
		pic.explore();

	}

	public static void adjustBrightness(double brightness) {
		Picture pic = new Picture("koala.jpg");
		pic.explore();
		int brightestVal = 0;
		double inc;
		Pixel[][] pixels = pic.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixObj : rowArray) {
				inc = brightness;
				if (pixObj.getBlue() > pixObj.getRed() && pixObj.getBlue() > pixObj.getGreen()) {
					brightestVal = pixObj.getBlue();
				}
				if (pixObj.getRed() > pixObj.getBlue() && pixObj.getRed() > pixObj.getGreen()) {
					brightestVal = pixObj.getRed();
				}
				if (pixObj.getGreen() > pixObj.getBlue() && pixObj.getGreen() > pixObj.getRed()) {
					brightestVal = pixObj.getGreen();
				}
				if (brightestVal * brightness > 255) {
					inc = 255.0 / brightestVal;
				}
				pixObj.setRed((int) (pixObj.getRed() * inc));
				pixObj.setGreen((int) (pixObj.getGreen() * inc));
				pixObj.setBlue((int) (pixObj.getBlue() * inc));
			}
		}
		pic.explore();

	}

	public static void verticalMirror() {
		Picture pic = new Picture("redMotorcycle.jpg");
		pic.explore();
		Pixel[][] pixels = pic.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < pixels[0].length/2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][pixels[0].length - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
				

			}
		}
		pic.explore();
	}
	public static void HorizontalMirror(){
		Picture pic = new Picture("redMotorcycle.jpg");
		pic.explore();
		Pixel[][]pixels = pic.getPixels2D();
		Pixel upperPixel = null;
		Pixel lowerPixel = null;
		for(int row = 0; row < pixels.length/2; row++){
			for(int col = 0; col < pixels[0].length; col++){
				upperPixel = pixels[row][col];
				lowerPixel = pixels[pixels.length - 1 - row][col];
				lowerPixel.setColor(upperPixel.getColor());
			}
		}
		pic.explore();
	}
	public static void flipHorizontal(){
		Picture pic1 = new Picture("butterfly1.jpg");
		Picture pic2 = new Picture("butterfly1.jpg");
		int temp = 0;
		pic1.explore();
		Pixel[][]pixels1 = pic1.getPixels2D();
		Pixel[][]pixels2 = pic2.getPixels2D();
		for(int row = 0; row < pixels1.length; row++){
			for(int col = 0; col < pixels2[0].length; col++){
				pixels2[row][col].setColor(pixels1[row][pixels1[col].length - 1 - col ].getColor());
				
			}
		}
		pic2.explore();
	}
	

	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture("redMotorCycle.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}

	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		Picture temple = new Picture("temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	/** Method to test the collage method */
	public static void testCollage() {
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}

	/** Method to test edgeDetection */
	public static void testEdgeDetection() {
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}

	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args) {
		// adjustBrightness(6);
		//BlackAndWhite();
		//verticalMirror();
		//HorizontalMirror();
		flipHorizontal();
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		// testZeroBlue();
		// testNoRed();
		// testKeepOnlyBlue();
		// testKeepOnlyRed();
		// testKeepOnlyGreen();
		// testNegate();
		// testGrayscale();
		// testFixUnderwater();
		// testMirrorVertical();
		// testMirrorTemple();
		// testMirrorArms();
		// testMirrorGull();
		// testMirrorDiagonal();
		// testCollage();
		// testCopy();
		// testEdgeDetection();
		// testEdgeDetection2();
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
	}
}