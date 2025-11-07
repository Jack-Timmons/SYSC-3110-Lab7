public class LifelineSite extends Site{

    int _units;
    int _rate;

    public  LifelineSite(){
        _units = 0;
        _rate = 0;
    }

    public LifelineSite(int units, int rate){
        this._rate = rate;
        this._units = units;
    }

    public double getBaseAmount() {
        return _units*_rate *0.5;
    }

    public double getTaxAmount(){
        return getBaseAmount()*Site.TAX_RATE *0.2;
    }
}
