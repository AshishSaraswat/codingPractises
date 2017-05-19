package matrix;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class ReadFile {

	public static void main(String[] args) {
		new ReadFile().checkStr();
	}

	public void readFile() {
		FileInputStream fstream;
		List<InputStream> l = null;
		try {
			fstream = new FileInputStream("D:\\xmlString.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

			char[] charBuffer = new char[1024];
			int numCharsRead;
			StringBuilder builder = new StringBuilder();
			InputStream targetStream = new InputStream() {

				@Override
				public int read() throws IOException {
					// TODO Auto-generated method stub
					return 0;
				}
			};
			l = new ArrayList<>();
			int start = 0;
			int len = charBuffer.length;
			System.out.println(len);
			while ((numCharsRead = br.read(charBuffer, start, len)) != -1) {
				builder.append(charBuffer, start, numCharsRead);
				InputStream targetStream1 = new ByteArrayInputStream(builder.toString().getBytes());
				l.add(targetStream1);
				start += len;
				System.out.println(l.size());
				// targetStream.read(br.);
			}
			// InputStream targetStream = new ByteArrayInputStream(
			// builder.toString().getBytes("UTF_8"));

			String strLine;

			// Read File Line By Line
			// while ((strLine = br.readLine()) != null) {
			// // Print the content on the console
			// System.out.println (strLine);
			// }

			// Close the input stream
			br.close();
		} catch (IOException | IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			for (InputStream i : l) {
				try {
					System.out.println(i.read());
					StreamCheck();
					checkStr();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}

	}

	public void StreamCheck() {
		FileInputStream fstream;
		try {
			fstream = new FileInputStream("D:\\xmlString.txt");
			LineNumberReader reader = new LineNumberReader(new InputStreamReader(fstream));
			ArrayList<String> goodLines = new ArrayList<String>();
			String line = null;
			while ((line = reader.readLine()) != null) {
				if ((reader.getLineNumber() + 1) % 10 == 0) {
					goodLines.add(line);
				}
			}
			InputStream stream1 = new ByteArrayInputStream(goodLines.get(0).getBytes());
			InputStream stream12 = new ByteArrayInputStream(goodLines.get(0).getBytes());
			SequenceInputStream inst = new SequenceInputStream(stream1, stream12);
		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void checkStr() {
		FileInputStream fstream;
		try {
			StringBuilder s = new StringBuilder(1000);
			fstream = new FileInputStream("D:\\xmlString.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			StringBuilder strLine;
			Vector<InputStream> l=new Vector<>();
			// Read File Line By Line
			while ((strLine = new StringBuilder(br.readLine())) != null) {
				// Print the content on the console
				if(strLine!=null)
				System.out.println(strLine);
				if(s.length()<1000 && strLine!=null )
				s.append(strLine);
				else{
					InputStream i = new ByteArrayInputStream(s.toString().getBytes());
					l.add(i);
					s=new StringBuilder();
				}
			}
			Enumeration e=l.elements();
			SequenceInputStream seq= new SequenceInputStream(e);
			//InputStream i = new ByteArrayInputStream(s.toString().getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(NullPointerException e2){
			
		}

	}
}
