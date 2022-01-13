public class ReadFromFile {
  public static void main(String[] args) throws FileNotFoudException{
    String separator = File.separator;
    String path = separator + "" + separator + "" +  separator + "";
    
    File file = new Scanenr(file);
    
    Scanner scanner = new Scanner(File);
    String line = scanner.nextLine();
    String[] words = line.split("");
    
    System.out.println(Arrays.toString(words));
    
    scanner.close();
  }
  
}
