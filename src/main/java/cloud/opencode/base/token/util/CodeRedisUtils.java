package cloud.opencode.base.token.util;

import cloud.opencode.base.basecode.CodeException;
import com.alibaba.fastjson2.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Jon
 * url: <a href="https://jon.wiki">Jon's blog</a>
 * url: <a href="https://opencode.cloud">OpenCode.cloud</a>
 */
@Component
public class CodeRedisUtils {

    @Autowired
    RedisTemplate redisTemplate;

    /**
     * Save object to redis
     *
     * @param fullKey fullKey
     * @param o       object
     */
    public void saveObject(String fullKey, Object o) {
        redisTemplate.opsForValue().set(fullKey, JSONObject.toJSONString(o));
    }

    /**
     * Get object from redis
     *
     * @param fullKey fullKey
     * @return object
     */
    public Object getObject(String fullKey) {
        if (StringUtils.isEmpty(fullKey)) {
            throw new CodeException("The key is empty.");
        }
        try {
            return redisTemplate.opsForValue().get(fullKey);
        } catch (Exception ex) {
            throw new CodeException("Can't read object data from redis of key:" + fullKey);
        }
    }

    /**
     * Delete key from redis
     *
     * @param fullKey fullKey
     */
    public void delObject(String fullKey) {
        redisTemplate.delete(fullKey);
    }
}
