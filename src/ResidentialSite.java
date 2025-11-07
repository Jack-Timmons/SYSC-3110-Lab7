public class ResidentialSite extends Site{
    int _units;
    int _rate;

    public ResidentialSite(){
        _units = 0;
        _rate = 0;
    }

    public ResidentialSite(int units, int rate){
        this._rate = rate;
        this._units = units;
    }

    public double getBaseAmount() {
        return _units*_rate;
    }

    public double getTaxAmount(){
        return getBaseAmount()*Site.TAX_RATE;
    }
}
