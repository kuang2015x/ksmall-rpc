package registry.serviceRegistryImpl;

import com.alibaba.fastjson.JSON;
import config.RpcConfigProperties;
import config.RpcServiceInfo;
import org.I0Itec.zkclient.ZkClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import registry.ServiceRegistry;

import javax.annotation.PostConstruct;

/**
 * 　　* @description: TODO
 * 　　* @author kx
 * 　　* @date 2021/10/24 21:37
 *
 */
public class ZkServiceRegistry implements ServiceRegistry {

    private Logger log = LoggerFactory.getLogger(ZkServiceRegistry.class);
    @Autowired
    private RpcConfigProperties rpcConfigProperties;

    private ZkClient zkClient;
    @PostConstruct
    public void init(){
        zkClient = new ZkClient(rpcConfigProperties.getAddress());
        log.info("connect to zookeeper");
    }

    @Override
    public void registry(RpcServiceInfo rpcServiceInfo) {

        String registryPath = "/rpcZkRegistryCenter";
        if (!zkClient.exists(registryPath)) {
            zkClient.createPersistent(registryPath);
            log.info("create registry node: {}", registryPath);
        }
        String servicePath = registryPath + "/" + rpcServiceInfo.getServiceName();
        if (!zkClient.exists(servicePath)) {
            zkClient.createPersistent(servicePath);
            log.info("create service node: {}", servicePath);
        }
        // 创建 address 节点（临时）
        String addressPath = servicePath + "/address-";
        String serviceInfo = JSON.toJSONString(rpcServiceInfo);
        String addressNode = zkClient.createEphemeralSequential(addressPath, serviceInfo);
        log.info("create address node: {}", addressNode);
    }
}
