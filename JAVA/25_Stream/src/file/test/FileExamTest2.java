package file.test;

/*
 * mkdirs()
 * getParentFile()
 * getName()
 * getPath()
 * createNewFile()
 * isDirectory()
 * isFile()
 * delete()
 */

import java.io.File;
import java.io.IOException;

public class FileExamTest2 {

	public static void main(String[] args) throws IOException{
		String dirName = "c:" + File.separator+"dir2" + File.separator + "mydir";//File.separator�����ڰ� �˾Ƽ� �ٲ�
		File file1 = new File(dirName);
		
		file1.mkdirs();
		File file2 = new File(dirName,"fileTest.dat");
		if(file2.createNewFile()) System.out.println("fileTest Creating OK!!");
		
		System.out.println("1.file2 ���� �̸��� ��� :: " + file2.getName());
		System.out.println("2.file2 ���� ��θ� ��� :: " + file2.getAbsolutePath());
		System.out.println("3.file2 ���� getParent() ��� :: " + file2.getParent());
		
		
		
		
		//4. �ش� ���α׷��� ����� �� ���丮 �ȿ� �ִ� ������ �����Ǵ� ����� ã�Ƽ� ����!!
		file2.deleteOnExit();
	}

}
