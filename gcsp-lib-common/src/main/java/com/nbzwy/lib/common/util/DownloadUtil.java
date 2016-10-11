package com.nbzwy.lib.common.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class DownloadUtil {
	
	public static void downloadFromUrl(String url, String filePath, String fileName) throws IOException{
		URL httpurl = new URL(url);
		File newFile = new File(filePath, fileName);
		FileUtils.copyURLToFile(httpurl, newFile);
	}
}
