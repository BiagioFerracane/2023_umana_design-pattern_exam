public class OldUkHandle {

    public static int getTotalPence(int puonds, int shilling, int pence) {
        int totalPence = (puonds * 20 * 12) + (shilling * 12) + pence;
        return totalPence;
    }

    public static OldUkPriceImplement parse(String priceString) {

        String[] parts = priceString.split(" ");
        int pound = 0;
        int shilling = 0;
        int pence = 0;
        for (String part : parts) {
            if (part.endsWith("d")) {
                pence = Integer.parseInt(part.substring(0, part.length() - 1));
            }
            if (part.endsWith("s")) {
                shilling = Integer.parseInt(part.substring(0, part.length() - 1));
            }
            if (part.endsWith("p")) {
                pound = Integer.parseInt(part.substring(0, part.length() - 1));
            }
        }
        int totalPence = OldUkHandle.getTotalPence(pound, shilling, pence);
       OldUkPriceImplement  priceNew= getNewPrice(totalPence);
       return priceNew;
    }
public static OldUkPriceImplement getNewPrice(int totalPence){
    int resultPuonds = totalPence / (12 * 20);
    int resultShilling = (totalPence / 12) % 20;
    int resultPence = totalPence % 12;
    return new OldUkPriceImplement(resultPuonds, resultShilling, resultPence);
}
}
