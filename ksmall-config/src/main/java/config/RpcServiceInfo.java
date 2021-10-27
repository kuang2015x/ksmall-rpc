package config;

/**
 * 　　* @description: TODO
 * 　　* @author kx
 * 　　* @date 2021/10/24 22:18
 *
 */
public class RpcServiceInfo {

    private String serviceName;

    private String serviceInfo;

    private Integer version;

    private String host;

    private int port;

    public RpcServiceInfo(String serviceName, String serviceInfo, Integer version, String host, int port) {
        this.serviceName = serviceName;
        this.serviceInfo = serviceInfo;
        this.version = version;
        this.host = host;
        this.port = port;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceInfo() {
        return serviceInfo;
    }

    public void setServiceInfo(String serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
