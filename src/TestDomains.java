import domain.NumberDomains;

import java.io.FileNotFoundException;

public class TestDomains {
  public static void main(String[] args) throws FileNotFoundException {
    NumberDomains domainsFromFile = new NumberDomains("testFile.txt");
    domainsFromFile.findDomainsFromFile();
    System.out.println(domainsFromFile.getNumberDomains());
  }
}
