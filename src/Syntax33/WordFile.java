package Syntax33;

public class WordFile extends File{
    @Override
    public void Open() {
        System.out.println("To open word file we need microsoft doc");
    }

    public static void main(String[] args) {
        File file = new JavaFile();
        file.Open();
        file.Close();
        file.Edit();
        System.out.println("===========================================");
        File file1 =  new WordFile();
        file1.Open();
        file1.Close();
        file1.Edit();
        System.out.println("===========================================");
        File file2 = new PdfFile();
        file2.Open();
        file2.Close();
        file2.Edit();
    }
}
