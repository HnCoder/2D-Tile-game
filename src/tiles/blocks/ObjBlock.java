package tiles.blocks;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import util.AABB;
import util.VectorXY;

public class ObjBlock extends Block{

	public ObjBlock(BufferedImage img, VectorXY pos, int w, int h) {
		super(img, pos, w, h);
	}

	@Override
	public boolean update(AABB p) { 
		return true; 
	}

	public boolean isInside(AABB p)
	{
		return false;
	}

	public void render(Graphics2D g)
	{
		super.render(g);
	}
}
