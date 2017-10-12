package mobidoo.co.kr.guntermvpsample.model;

/**
 * Created by Gunter on 2017-10-12.
 * Company : Mobidoo
 * Email : gunter@mobidoo.co.kr
 */
public class Android {

    private String ver;
    private String name;
    private String api;

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    @Override
    public String toString() {
        return "Android{" +
                "ver='" + ver + '\'' +
                ", name='" + name + '\'' +
                ", api='" + api + '\'' +
                '}';
    }
}
