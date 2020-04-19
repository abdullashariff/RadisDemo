//package com.demo.radis.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.data.redis.connection.RedisSentinelConfiguration;
//
//import io.lettuce.core.internal.HostAndPort;
//import redis.clients.jedis.JedisPoolConfig;
//
//public class JedisConnectionFactory {
//	@Bean(name = "jedisConnectionFactory")
//    public JedisConnectionFactory jedisConnectionFactory() {
//        RedisSentinelConfiguration redisSentinelConfiguration = new RedisSentinelConfiguration();
//        redisSentinelConfiguration.master(environment.getProperty("redis.sentinel.master.name"));
//        String redisSentinelHostAndPorts = environment.getProperty("redis.sentinel.host.and.ports");
//        HostAndPort hostAndPort;
//        if (redisSentinelHostAndPorts.contains(";">)) {
//            for (String node : redisSentinelHostAndPorts.split(";")) {
//                if (null != node & node.contains(":")) {
//                    String [] nodeArr = node.split(":");
//                    hostAndPort = new HostAndPort(nodeArr[0], Integer.parseInt(nodeArr[1]));
//                    redisSentinelConfiguration.sentinel(hostAndPort.getHost(), hostAndPort.getPort());
//                }
//            }
//        } else {
//            if (redisSentinelHostAndPorts.contains(":")) {
//                String [] nodeArr = redisSentinelHostAndPorts.split(":");
//                hostAndPort = new HostAndPort(nodeArr[0], Integer.parseInt(nodeArr[1]));
//                redisSentinelConfiguration.sentinel(hostAndPort.getHost(), hostAndPort.getPort());
//            }
//        }
//        return new JedisConnectionFactory(redisSentinelConfiguration, poolConfig());
//    }
//
//    @Bean
//    public JedisPoolConfig poolConfig() {
//        final JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//        jedisPoolConfig.setTestOnBorrow(true);
//        jedisPoolConfig.setMaxTotal(100);
//        jedisPoolConfig.setMaxIdle(100);
//        jedisPoolConfig.setMinIdle(10);
//        jedisPoolConfig.setTestOnReturn(true);
//        jedisPoolConfig.setTestWhileIdle(true);
//        return jedisPoolConfig;
//    }
//}
