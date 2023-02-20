public class Main {

  public static void main(String[] args) {

OldUkPriceImplement price1 = OldUkHandle.parse(args[0]);
OldUkPriceImplement price2 = OldUkHandle.parse(args[1]);
    System.out.println(price1 +" " + price2);

OldUkPriceImplement total = price1.divide(2);
OldUkPriceImplement totaMolt = price1.Multiply(2);
    System.out.println(total.toString());
    System.out.println(totaMolt.toString());
  }

}
