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

    public RpcServiceInfo(String serviceName, String serviceInfo, Integer version) {
        this.serviceName = serviceName;
        this.serviceInfo = serviceInfo;
        this.version = version;
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
}
