package ufjf.dcc;

public class Dados {
    private String latitude;
    private String longitude;
    private String data;
    private String descricao;
    
    public Dados(){
        this(null,null,null,null);
    }
    
    public Dados(String latitude, String longitude, String data, String descricao){
        this.latitude = latitude;
        this.longitude = longitude;
        this.data = data;
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Dia: " + data +"\n" + latitude + " " + longitude + "\nDescrição: " + descricao;
    }
}
