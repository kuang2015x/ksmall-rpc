package config;

/**
 * 　　* @description: TODO
 * 　　* @author kx
 * 　　* @date 2021/10/24 21:35
 *
 */
public class RpcConfigProperties {
    private String address;

    private String protol;

    private String port;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProtol() {
        return protol;
    }

    public void setProtol(String protol) {
        this.protol = protol;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
