package make.some.noise;

import org.huldra.math.BigInt;
import org.junit.Test;

/**
 * Created by Tommy Ettinger on 6/20/2019.
 */
public class NoiseTests {

	@Test
	public void testRange2D()
	{
		Noise noise = new Noise(543212345, 3.14159265f);
		long state = 12345678L;
		float x, y, result;
		float min = 0.5f, max = 0.5f;
		int higher = 0, lower = 0;
		for (int i = 0; i < 100000000; i++) {
			x = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			y = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			result = noise.singleSimplex((int)state, x, y);
			min = Math.min(min, result);
			max = Math.max(max, result);
			if(result > 1f)
				higher++;
			if(result < -1f)
				lower++;
		}
		System.out.println("2D min="+min+",max="+max+",tooHighCount="+higher+",tooLowCount="+lower);
	}

	@Test
	public void testRange3D()
	{
		Noise noise = new Noise(543212345, 3.14159265f);
		long state = 12345678L;
		float x, y, z, result;
		float min = 0.5f, max = 0.5f;
		int higher = 0, lower = 0;
		for (int i = 0; i < 10000000; i++) {
			x = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			y = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			z = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			result = noise.singleSimplex((int)state, x, y, z);
			min = Math.min(min, result);
			max = Math.max(max, result);
			if(result > 1f)
				higher++;
			if(result < -1f)
				lower++;
		}
		System.out.println("3D min="+min+",max="+max+",tooHighCount="+higher+",tooLowCount="+lower);
	}

	@Test
	public void testRange4D()
	{
		Noise noise = new Noise(543212345, 3.14159265f);
		long state = 12345678L;
		float x, y, z, w, result;
		float min = 0.5f, max = 0.5f;
		int higher = 0, lower = 0;
		for (int i = 0; i < 10000000; i++) {
			x = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			y = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			z = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			w = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			result = noise.singleSimplex((int)state, x, y, z, w);
			min = Math.min(min, result);
			max = Math.max(max, result);
			if(result > 1f)
				higher++;
			if(result < -1f)
				lower++;
		}
		System.out.println("4D min="+min+",max="+max+",tooHighCount="+higher+",tooLowCount="+lower);
	}

	@Test
	public void testRange6D()
	{
		Noise noise = new Noise(543212345, 3.14159265f);
		long state = 12345678L;
		float x, y, z, w, u, v, result;
		float min = 0.5f, max = 0.5f;
		int higher = 0, lower = 0;
		for (int i = 0; i < 10000000; i++) {
			x = (state >> 57) / (1.0001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			y = (state >> 57) / (1.0001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			z = (state >> 57) / (1.0001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			w = (state >> 57) / (1.0001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			u = (state >> 57) / (1.0001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			v = (state >> 57) / (1.0001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			result = noise.singleSimplex((int)state, x, y, z, w, u, v);
			min = Math.min(min, result);
			max = Math.max(max, result);
			if(result > 1f)
				higher++;
			if(result < -1f)
				lower++;
		}
		System.out.println("6D min="+min+",max="+max+",tooHighCount="+higher+",tooLowCount="+lower);
	}

	@Test
	public void testRangeBillow2D()
	{
		Noise noise = new Noise(543212345, 3.14159265f, Noise.SIMPLEX_FRACTAL, 2, 2f, 0.5f);
		noise.setFractalType(Noise.BILLOW);
		long state = 12345678L;
		float x, y, result;
		float min = 0.5f, max = 0.5f;
		int higher = 0, lower = 0;
		for (int i = 0; i < 100000000; i++) {
			x = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			y = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			result = noise.getNoiseWithSeed(x, y, (int)state);
			min = Math.min(min, result);
			max = Math.max(max, result);
			if(result > 1f)
				higher++;
			if(result < -1f)
				lower++;
		}
		System.out.println("Billow 2D min="+min+",max="+max+",tooHighCount="+higher+",tooLowCount="+lower);
	}

	@Test
	public void testRangeFBM3D()
	{
		Noise noise = new Noise(543212345, 3.14159265f, Noise.SIMPLEX_FRACTAL, 3, 2f, 0.5f);
		noise.setFractalType(Noise.FBM);
		long state = 12345678L;
		float x, y, z, result;
		float min = 0.5f, max = 0.5f;
		int higher = 0, lower = 0;
		for (int i = 0; i < 10000000; i++) {
			x = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			y = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			z = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			result = noise.getNoiseWithSeed(x, y, z, (int)state);
			min = Math.min(min, result);
			max = Math.max(max, result);
			if(result > 1f)
				higher++;
			if(result < -1f)
				lower++;
		}
		System.out.println("FBM 3D min="+min+",max="+max+",tooHighCount="+higher+",tooLowCount="+lower);
	}

	@Test
	public void testRangeFBM4D()
	{
		Noise noise = new Noise(543212345, 3.14159265f, Noise.SIMPLEX_FRACTAL, 1, 2f, 0.5f);
		noise.setFractalType(Noise.FBM);
		long state = 12345678L;
		float x, y, z, w, result;
		float min = 0.5f, max = 0.5f;
		int higher = 0, lower = 0;
		for (int i = 0; i < 10000000; i++) {
			x = (state >> 58) / (8.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-21f));
			y = (state >> 58) / (8.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-21f));
			z = (state >> 58) / (8.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-21f));
			w = (state >> 58) / (8.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-21f));
			result = noise.getNoiseWithSeed(x, y, z, w, (int)state);				
			min = Math.min(min, result);
			max = Math.max(max, result);
			if (result > 1f)
				higher++;
			if (result < -1f)
				lower++;
		}
		System.out.println("FBM 4D min="+min+",max="+max+",tooHighCount="+higher+",tooLowCount="+lower);
	}

	@Test
	public void testRangeBillow3D()
	{
		Noise noise = new Noise(543212345, 3.14159265f, Noise.SIMPLEX_FRACTAL, 2, 2f, 0.5f);
		noise.setFractalType(Noise.BILLOW);
		long state = 12345678L;
		float x, y, z, result;
		float min = 0.5f, max = 0.5f;
		int higher = 0, lower = 0;
		for (int i = 0; i < 10000000; i++) {
			x = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			y = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			z = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			result = noise.getNoiseWithSeed(x, y, z, (int)state);
			min = Math.min(min, result);
			max = Math.max(max, result);
			if(result > 1f)
				higher++;
			if(result < -1f)
				lower++;
		}
		System.out.println("Billow 3D min="+min+",max="+max+",tooHighCount="+higher+",tooLowCount="+lower);
	}

	@Test
	public void testRangeBillowInverse2D()
	{
		Noise noise = new Noise(543212345, 3.14159265f, Noise.SIMPLEX_FRACTAL, 2, 0.5f, 2f);
		noise.setFractalType(Noise.BILLOW);
		long state = 12345678L;
		float x, y, result;
		float min = 0.5f, max = 0.5f;
		int higher = 0, lower = 0;
		for (int i = 0; i < 100000000; i++) {
			x = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			y = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			result = noise.getNoiseWithSeed(x, y, (int)state);
			min = Math.min(min, result);
			max = Math.max(max, result);
			if(result > 1f)
				higher++;
			if(result < -1f)
				lower++;
		}
		System.out.println("BillowInverse 2D min="+min+",max="+max+",tooHighCount="+higher+",tooLowCount="+lower);
	}

	@Test
	public void testRangeBillowInverse3D()
	{
		Noise noise = new Noise(543212345, 3.14159265f, Noise.SIMPLEX_FRACTAL, 2, 0.5f, 2f);
		noise.setFractalType(Noise.BILLOW);
		long state = 12345678L;
		float x, y, z, result;
		float min = 0.5f, max = 0.5f;
		int higher = 0, lower = 0;
		for (int i = 0; i < 10000000; i++) {
			x = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			y = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			z = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			result = noise.getNoiseWithSeed(x, y, z, (int)state);
			min = Math.min(min, result);
			max = Math.max(max, result);
			if(result > 1f)
				higher++;
			if(result < -1f)
				lower++;
		}
		System.out.println("BillowInverse 3D min="+min+",max="+max+",tooHighCount="+higher+",tooLowCount="+lower);
	}
	
	@Test
	public void testRangeRidged2D()
	{
		Noise noise = new Noise(543212345, 3.14159265f, Noise.SIMPLEX_FRACTAL, 3, 2f, 0.5f);
		noise.setFractalType(Noise.RIDGED_MULTI);
		long state = 12345678L;
		float x, y, result;
		float min = 0.5f, max = 0.5f;
		int higher = 0, lower = 0;
		for (int i = 0; i < 100000000; i++) {
			x = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			y = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			result = noise.getNoiseWithSeed(x, y, (int)state);
			min = Math.min(min, result);
			max = Math.max(max, result);
			if(result > 1f)
				higher++;
			if(result < -1f)
				lower++;
		}
		System.out.println("Ridged 2D min="+min+",max="+max+",tooHighCount="+higher+",tooLowCount="+lower);
	}

	@Test
	public void testRangeRidged3D()
	{
		Noise noise = new Noise(543212345, 3.14159265f, Noise.SIMPLEX_FRACTAL, 3, 2f, 0.5f);
		noise.setFractalType(Noise.RIDGED_MULTI);
		long state = 12345678L;
		float x, y, z, result;
		float min, max;
		min = max = noise.getNoiseWithSeed(0, 0, 0, (int)state);
		int higher = 0, lower = 0;
		for (int i = 0; i < 10000000; i++) {
			x = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			y = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			z = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			result = noise.getNoiseWithSeed(x, y, z, (int)state);
			min = Math.min(min, result);
			max = Math.max(max, result);
			if(result > 1f)
				higher++;
			if(result < -1f)
				lower++;
		}
		System.out.println("Ridged 3D min="+min+",max="+max+",tooHighCount="+higher+",tooLowCount="+lower);
	}

	@Test
	public void testRangeRidgedInverse2D()
	{
		Noise noise = new Noise(543212345, 3.14159265f, Noise.SIMPLEX_FRACTAL, 2, 0.5f, 2f);
		noise.setFractalType(Noise.RIDGED_MULTI);
		long state = 12345678L;
		float x, y, result;
		float min = 0.5f, max = 0.5f;
		int higher = 0, lower = 0;
		for (int i = 0; i < 100000000; i++) {
			x = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			y = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			result = noise.getNoiseWithSeed(x, y, (int)state);
			min = Math.min(min, result);
			max = Math.max(max, result);
			if(result > 1f)
				higher++;
			if(result < -1f)
				lower++;
		}
		System.out.println("RidgedInverse 2D min="+min+",max="+max+",tooHighCount="+higher+",tooLowCount="+lower);
	}

	@Test
	public void testRangeRidgedInverse3D()
	{
		Noise noise = new Noise(543212345, 3.14159265f, Noise.SIMPLEX_FRACTAL, 3, 0.5f, 2f);
		noise.setFractalType(Noise.RIDGED_MULTI);
		long state = 12345678L;
		float x, y, z, result;
		float min, max;
		min = max = noise.getNoiseWithSeed(0, 0, 0, (int)state);
		int higher = 0, lower = 0;
		for (int i = 0; i < 10000000; i++) {
			x = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			y = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			z = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			result = noise.getNoiseWithSeed(x, y, z, (int)state);
			min = Math.min(min, result);
			max = Math.max(max, result);
			if(result > 1f)
				higher++;
			if(result < -1f)
				lower++;
		}
		System.out.println("RidgedInverse 3D min="+min+",max="+max+",tooHighCount="+higher+",tooLowCount="+lower);
	}

	@Test
	public void testAverageSimplexFBM3D()
	{
		Noise noise = new Noise(543212345, 3.14159265f, Noise.SIMPLEX_FRACTAL, 4, 2f, 0.5f);
		noise.setFractalType(Noise.FBM);
		long state = 12345678L;
		float x, y, z;
		BigInt big = new BigInt(0);
		for (int i = 0; i < 0x10000; i++) {
			x = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			y = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			z = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			big.add(Math.round(4096 * noise.getNoiseWithSeed(x, y, z, (int)state)));
		}
		big.div(65536);
		System.out.println("Simplex FBM 3D average(in range [-4096,4096])="+big.toString());
	}

	@Test
	public void testAveragePerlinFBM3D()
	{
		Noise noise = new Noise(543212345, 3.14159265f, Noise.PERLIN_FRACTAL, 4, 2f, 0.5f);
		noise.setFractalType(Noise.FBM);
		long state = 12345678L;
		float x, y, z;
		BigInt big = new BigInt(0);
		for (int i = 0; i < 0x10000; i++) {
			x = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			y = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			z = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			big.add(Math.round(4096 * noise.getNoiseWithSeed(x, y, z, (int)state)));
		}
		big.div(65536);
		System.out.println("Perlin FBM 3D average(in range [-4096,4096])="+big.toString());
	}

	@Test
	public void testAverageCubicFBM3D()
	{
		Noise noise = new Noise(543212345, 3.14159265f, Noise.CUBIC_FRACTAL, 4, 2f, 0.5f);
		noise.setFractalType(Noise.FBM);
		long state = 12345678L;
		float x, y, z;
		BigInt big = new BigInt(0);
		for (int i = 0; i < 0x10000; i++) {
			x = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			y = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			z = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L & 0xffffffL) * 0x1p-24f));
			big.add(Math.round(4096 * noise.getNoiseWithSeed(x, y, z, (int)state)));
		}
		big.div(65536);
		System.out.println("Cubic FBM 3D average(in range [-4096,4096])="+big.toString());
	}

	@Test
	public void testRangePerlin4D()
	{
		Noise noise = new Noise(543212345, 1f, Noise.PERLIN);
		long state = 123456L;
		float x, y, z, w, result, xLo=0, yLo=0, zLo=0, wLo=0, xHi=0, yHi=0, zHi=0, wHi=0;
		float min = 0.5f, max = 0.5f;
//		int higher = 0, lower = 0;
		for (int i = 0; i < 200000000; i++) {
			x = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L >>> 40) * 0x1p-24f));
			y = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L >>> 40) * 0x1p-24f));
			z = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L >>> 40) * 0x1p-24f));
			w = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L >>> 40) * 0x1p-24f));
			result = noise.singlePerlin((int)state, x, y, z, w);
			if(result == (min = Math.min(min, result)))
			{
				xLo = x; yLo = y; zLo = z; wLo = w;
			}
			if(result == (max = Math.max(max, result)))
			{
				xHi = x; yHi = y; zHi = z; wHi = w;
			}
//			if(result > 1f)
//				higher++;
//			if(result < -1f)
//				lower++;
		}
		System.out.println("Preliminary 4D min="+min+",max="+max+",multiplier="+(1f/Math.max(-min, max)));
		for (float g = -0.5f; g <= 0.5f; g += 0x1p-6f) {
			for (float h = -0.5f; h <= 0.5f; h += 0x1p-6f) {
				for (float i = -0.5f; i <= 0.5f; i += 0x1p-6f) {
					for (float j = -0.5f; j <= 0.5f; j += 0x1p-6f) {
						min = Math.min(min, noise.singlePerlin((int)state, xLo + g, yLo + h, zLo + i, wLo + j));
						max = Math.max(max, noise.singlePerlin((int)state, xHi + g, yHi + h, zHi + i, wHi + j));
					}
				}
			}
		}
		//4D min=-1.7437704,max=1.8121637,multiplier=0.55182654
		System.out.println("Better 4D min="+min+",max="+max+",multiplier="+(1f/Math.max(-min, max)));
//		System.out.println("4D min="+min+",max="+max+",tooHighCount="+higher+",tooLowCount="+lower);
	}

	@Test
	public void testRangePerlin6D()
	{
		Noise noise = new Noise(543212345, 1f, Noise.PERLIN);
		long state = 12L;
		float x, y, z, w, u, v, result, xLo=0, yLo=0, zLo=0, wLo=0, uLo=0, vLo=0, xHi=0, yHi=0, zHi=0, wHi=0, uHi=0, vHi=0;
		float min = 0.5f, max = 0.5f;
//		int higher = 0, lower = 0;
		for (int i = 0; i < 3000000; i++) {
			x = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L >>> 40) * 0x1p-24f));
			y = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L >>> 40) * 0x1p-24f));
			z = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L >>> 40) * 0x1p-24f));
			w = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L >>> 40) * 0x1p-24f));
			u = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L >>> 40) * 0x1p-24f));
			v = (state >> 58) / (1.001f - (((state = (state << 29 | state >>> 35) * 0xAC564B05L) * 0x818102004182A025L >>> 40) * 0x1p-24f));
			result = noise.singlePerlin((int)state, x, y, z, w, u, v);
			if(result == (min = Math.min(min, result)))
			{
				xLo = x; yLo = y; zLo = z; wLo = w; uLo = u; vLo = v;
			}
			if(result == (max = Math.max(max, result)))
			{
				xHi = x; yHi = y; zHi = z; wHi = w; uHi = u; vHi = v;
			}
//			if(result > 1f)
//				higher++;
//			if(result < -1f)
//				lower++;
		}
		System.out.println("Preliminary 6D min="+min+",max="+max+",multiplier="+(1f/Math.max(-min, max)));
		for (float e = -0.5f; e <= 0.5f; e += 0x1p-3f) {
			for (float f = -0.5f; f <= 0.5f; f += 0x1p-3f) {
				for (float g = -0.5f; g <= 0.5f; g += 0x1p-3f) {
					for (float h = -0.5f; h <= 0.5f; h += 0x1p-3f) {
						for (float i = -0.5f; i <= 0.5f; i += 0x1p-3f) {
							for (float j = -0.5f; j <= 0.5f; j += 0x1p-3f) {
								min = Math.min(min, noise.singlePerlin((int)state, xLo + g, yLo + h, zLo + i, wLo + j, uLo + e, vLo + f));
								max = Math.max(max, noise.singlePerlin((int)state, xHi + g, yHi + h, zHi + i, wHi + j, uHi + e, vHi + f));
							}
						}
					}
				}
			}
		}
		//Better 6D min=-0.94192255,max=0.99394155,multiplier=1.0060954
		System.out.println("Better 6D min="+min+",max="+max+",multiplier="+(1f/Math.max(-min, max)));
//		System.out.println("4D min="+min+",max="+max+",tooHighCount="+higher+",tooLowCount="+lower);
	}

}
