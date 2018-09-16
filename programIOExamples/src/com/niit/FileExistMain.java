package com.niit;

import java.io.File;

public class FileExistMain {

	public static void main(String[] args) {
		File mp3file=new File("/media/tanmay/New Volume/Sonu/05 - Ishq Ishq(MyMp3Song.Com).mp3");
		if(mp3file.exists())
		{
			System.out.println("MySong.mp3 file Exist");
		}
		else
		{
			System.out.println("MySong.mp3 file doesn't Exist");
		}
		File mp3file1=new File("/media/tanmay/New Volume/Sonu/05");
		if(mp3file1.exists())
		{
			System.out.println("MySong.mp3 file Exist");
		}
		else {
			System.out.println("MySong.mp3 file doesn't Exist");
		}
	}

}
