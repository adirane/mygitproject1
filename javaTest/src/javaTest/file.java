package javaTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;
public class file
{
public static void main(String[] args) throws IOException
{
Path p=Paths.get("C:/Users/aditi/Desktop/Training Material/distinctword.txt");
String s=new String(Files.readAllBytes(p));
StringTokenizer st=new StringTokenizer(s," ");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
}
