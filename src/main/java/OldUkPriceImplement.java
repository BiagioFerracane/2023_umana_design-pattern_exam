public class OldUkPriceImplement implements OldUKPrice {
    private int puonds;
    private int shilling;
    private int pence;


    public OldUkPriceImplement(int puonds, int shilling, int pence) {
        this.puonds = puonds;
        this.shilling = shilling;
        this.pence = pence;
    }

    @Override
    public OldUkPriceImplement add(OldUkPriceImplement other) {
        int thisTotalPence = OldUkHandle.getTotalPence(this.puonds, this.shilling, this.pence);
        int otherTotalPence = OldUkHandle.getTotalPence(other.getPuonds(), other.getShilling(), other.getPence());
        int totalPence = thisTotalPence + otherTotalPence;
        OldUkPriceImplement priceImplement = OldUkHandle.getNewPrice(totalPence);
        return priceImplement;
    }

    @Override
    public OldUkPriceImplement subtract(OldUkPriceImplement other) {
        int thisTotalPence = OldUkHandle.getTotalPence(this.puonds, this.shilling, this.pence);
        int otherTotalPence = OldUkHandle.getTotalPence(other.getPuonds(), other.getShilling(), other.getPence());
        int totalPence = thisTotalPence - otherTotalPence;
        OldUkPriceImplement priceImplement = OldUkHandle.getNewPrice(totalPence);
        return priceImplement;
    }

    @Override
    public OldUkPriceImplement Multiply(int factor) {
        int thisTotalPence = OldUkHandle.getTotalPence(this.puonds, this.shilling, this.pence);
        int totalNumber = thisTotalPence * factor;

        OldUkPriceImplement priceImplement = OldUkHandle.getNewPrice(totalNumber);
        return priceImplement;

    }

    @Override
    public OldUkPriceImplement divide(int divisor) {
        int thisTotalPence = OldUkHandle.getTotalPence(this.puonds, this.shilling, this.pence);
        int resultPence = thisTotalPence / divisor;
        int resultPuonds = resultPence / 240;
        resultPence = resultPence % 240;
        int resultShilling = resultPence / 12;
        resultPence = resultPence % 12;

        return new OldUkPriceImplement(resultPuonds, resultShilling, resultPence);
    }

    public int getPuonds() {
        return puonds;
    }

    public int getShilling() {
        return shilling;
    }

    public int getPence() {
        return pence;
    }

    @Override
    public String toString() {
        return "OldUkPriceImplement{" +
                "puonds=" + puonds +
                ", shilling=" + shilling +
                ", pence=" + pence +
                '}';
    }
}
