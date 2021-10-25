package registry.serviceRegistryImpl;

import config.RpcConfigProperties;
import config.RpcServiceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import registry.ServiceRegistry;

/**
 * 　　* @description: TODO
 * 　　* @author kx
 * 　　* @date 2021/10/24 21:37
 *
 */
public class ZkServiceRegistry implements ServiceRegistry {

    @Autowired
    private RpcConfigProperties rpcConfigProperties;

    @Override
    public void registry(RpcServiceInfo rpcServiceInfo) {

    }
}
