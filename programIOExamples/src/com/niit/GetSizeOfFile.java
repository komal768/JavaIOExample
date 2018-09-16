package com.niit;

import java.io.File;

public class GetSizeOfFile {

	public static void main(String[] args) {

		File obj = new File("/media/tanmay/New Volume/Sonu/04 - Aa Pyaar Kare Bindas(MyMp3Song.Com).mp3");
		double sizeInBytes = obj.length();
		System.out.println("Size of filein bytes : " + sizeInBytes + "byte");
		System.out.println("Size of filein Kb : " + sizeInBytes / 1024 + "Kb");
		System.out.println("Size of filein Mb : " + sizeInBytes / (1024 * 1024) + "Mb");

	}

}
