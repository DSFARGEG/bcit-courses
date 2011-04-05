/**
 * Project: Assignment_04_SimpleVideo
 * File: ImageData.java
 * Date: 2011-03-31
 * Time: 8:06:16 AM
 */
package org.trollop.SimpleVideo;

import java.io.Serializable;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;


/**
 * @author Steffen L. Norgren, A00683006
 *
 */
public class ImageData implements Comparable<Object>, Serializable {
	private static final long serialVersionUID = 601898220926582662L;
	private int imageID;
	private byte[] data;
	private long accessTime;
	
	ImageData(byte[] data, int imageID) {
		this.data = data;
		this.imageID = imageID;
		this.accessTime = System.nanoTime();
	}
	
	public int getImageID() {
		return this.imageID;
	}
	
	public Bitmap getImage() {
		Bitmap bm = BitmapFactory.decodeByteArray(this.data, 0, this.data.length);
		
		return bm;
	}

	public long getAccessTime() {
		return this.accessTime;
	}
	
	@Override
	public int compareTo(Object another) {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Image Size: " + data.length + "\nAccess Time (ns): " + this.accessTime;
	}
}
