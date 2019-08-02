MyFile file = new MyFile();
file.initialize("c:\\data\\a.txt");

MyFile file2 = new MyFile();
file2.initialize(file, "a.txt");
String text = file2.readText();