package make.some.noise;/*
 * Noise Demo 2D.
 * Replace SuperSimplexNoise with FastSimplexStyleNoise to test FastSimplexStyleNoise instead.
 */

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class NoiseDemo2
{
	private static final int WIDTH = 1024;
	private static final int HEIGHT = 1024;
	private static final float PERIOD = 128.0f;
	private static final int OFF_X = 2048;
	private static final int OFF_Y = 2048;
	private static GenerateType generateType = GenerateType.Evaluator;
	
	private static final float FREQ = 1.0f / PERIOD;
	
	private enum GenerateType {
		Evaluator,
		AreaGenerator,
		ShowDifference
	}

	public static void main(String[] args)
			throws IOException {
		
		// Initialize
		SuperSimplexNoise noise = new SuperSimplexNoise(1234);
		SuperSimplexNoise.GenerateContext2D noiseBulk = new SuperSimplexNoise.GenerateContext2D(FREQ, FREQ, 1.0f);
		
		// Generate
		float[][] buffer = new float[HEIGHT][WIDTH];
		if (generateType != GenerateType.Evaluator) noise.generate2(noiseBulk, buffer, OFF_X, OFF_Y);
		
		// Image
		BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		for (int y = 0; y < HEIGHT; y++)
		{
			for (int x = 0; x < WIDTH; x++)
			{
				float value = buffer[y][x];
				float evalValue = 0;
				
				if (generateType != GenerateType.AreaGenerator)
					evalValue = noise.noise2((x + OFF_X) * FREQ, (y + OFF_Y) * FREQ);;
				
				switch(generateType) {
					case Evaluator:
						value = evalValue;
						break;
					case ShowDifference:
						value -= evalValue;
						break;
				}
				
				if (value < -1) value = -1;
				else if (value > 1) value = 1;
				
				int rgb = 0x010101 * (int)((value + 1) * 127.5f);
				image.setRGB(x, y, rgb);
			}
		}
		
		// Save it or show it
		if (args.length > 0 && args[0] != null) {
			ImageIO.write(image, "png", new File(args[0]));
			System.out.println("Saved image as " + args[0]);
		} else {
			JFrame frame = new JFrame();
			JLabel imageLabel = new JLabel();
			imageLabel.setIcon(new ImageIcon(image));
			frame.add(imageLabel);
			frame.pack();
			frame.setResizable(false);
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.setVisible(true);
		}
		
	}
}