package code.renderer;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import org.omg.CORBA.PRIVATE_MEMBER;



public class Renderer extends GUI {
	@Override
	protected void onLoad(File file) {
		// TODO fill this in.

		/*
		 * This method should parse the given file into a Scene object, which
		 * you store and use to render an image.
		 */
		//the 3D model
		private Scene scene;
		private Scene centralisedScene;
		//the viewing angle for rotation
		private float xRotation = 0f, yRotation = 0f;
		private float rotatAngle = 0.2f;	
		//the viewing position for translation
		private Vector3D viewerPosition = new Vector3D(0f, 0f, 0f);
		private float translationDistance = 2.0f;
		//constants for zoomig
		private float currentScale = 1.0f;
		private static final float ZOOMING_FACTOR = 1.5f;
		private static final float ZOOMING_MIN = 0.5f, ZOOMING_MAX = 6.0f;
		//For rotation 
		private boolean isRotation = true;
		private Point dragStart;
		
	}

	@Override
	protected void onKeyPress(KeyEvent ev) {
		// TODO fill this in.

		/*
		 * This method should be used to rotate the user's viewpoint.
		 */
	}

	@Override
	protected BufferedImage render() {
		// TODO fill this in.

		/*
		 * This method should put together the pieces of your renderer, as
		 * described in the lecture. This will involve calling each of the
		 * static method stubs in the Pipeline class, which you also need to
		 * fill in.
		 */
		return null;
	}

	/**
	 * Converts a 2D array of Colors to a BufferedImage. Assumes that bitmap is
	 * indexed by column then row and has imageHeight rows and imageWidth
	 * columns. Note that image.setRGB requires x (col) and y (row) are given in
	 * that order.
	 */
	private BufferedImage convertBitmapToImage(Color[][] bitmap) {
		BufferedImage image = new BufferedImage(CANVAS_WIDTH, CANVAS_HEIGHT, BufferedImage.TYPE_INT_RGB);
		for (int x = 0; x < CANVAS_WIDTH; x++) {
			for (int y = 0; y < CANVAS_HEIGHT; y++) {
				image.setRGB(x, y, bitmap[x][y].getRGB());
			}
		}
		return image;
	}

	public static void main(String[] args) {
		new Renderer();
	}

	@Override
	protected void onScroll(MouseWheelEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onPressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void switchMoveRotation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onDefalut() {
		// TODO Auto-generated method stub
		
	}
}

// code for comp261 assignments
