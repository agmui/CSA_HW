package AP_FRQ.CH_8;

public class Plot {
    private String cropType;
    private int cropYield;
    public Plot(String crop, int yield) {
        cropType = crop;
        cropYield = yield;
    }
    public String getCropType() {
        return cropType;
    }
    public int getCropYield() {
        return cropYield;
    }
}


class ExperimentalFarm {
    private Plot[][] farmPlots;
    public ExperimentalFarm(Plot[][] p) {
        farmPlots = p;
    }
    public Plot getHighestYield(String c) {
        String name = "null";
        int num = 0;
        for (Plot[] i : farmPlots){
            for (Plot j : i) {
                if (j.getCropType().equals(c) && num < j.getCropYield()){
                    num = j.getCropYield();
                    name = j.getCropType();
                }
            }
        }
        return (name.equals("null")) ? null : new Plot(name, num);
    }
    public boolean sameCrop(int col) {
        for (int i = 1; i < farmPlots[col].length; i++){
            if(!farmPlots[i][col].getCropType().equals(farmPlots[0][col].getCropType())) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Plot[][] l = {
                {new Plot("corn", 20), new Plot("corn", 30), new Plot("peas", 10)},
                {new Plot("peas", 30), new Plot("corn", 40), new Plot("corn", 62)},
                {new Plot("wheat", 10), new Plot("corn", 50), new Plot("rice", 30)},
                {new Plot("corn", 55), new Plot("corn", 30), new Plot("peas", 30)}};
        ExperimentalFarm f = new ExperimentalFarm(l);
        f.getHighestYield("corn");
        f.sameCrop(0);
        f.sameCrop(1);
    }
}
