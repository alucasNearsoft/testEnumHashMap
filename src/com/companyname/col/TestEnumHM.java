package com.companyname.col;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

enum Color
{
	RED(255, 0, 0),
	GREEN(0, 255, 0),
	BLUE(0, 0, 255);
	private int r, g, b;
	private Color(int r, int g, int b)
	{
		this.r = r;
		this.g = g;
		this.b = b;
	}
	@Override
	public String toString()
	{
		return "r = "+r+", g = "+g+", b = "+b;
	}
}

public class TestEnumHM {
	public static void main (String[] args) {
		/* The following example declares a map of String keys and Color values, adds several entries to the
		map, and iterates over the keys and values
		*/
		Map<String, Color> colorMap = new HashMap<>(); // ... represents creation of a Map implementation
		colorMap.put("red", Color.RED);
		colorMap.put("blue", Color.BLUE);
		colorMap.put("green", Color.GREEN);
		colorMap.put("RED", Color.RED);
		for (String colorKey: colorMap.keySet())
			System.out.println(colorKey);
		Collection<Color> colorValues = colorMap.values();
		for (Iterator<Color> it = colorValues.iterator(); it.hasNext();)
			System.out.println(it.next());
	}
}
