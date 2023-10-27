package cloud.opencode.base.token.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jon
 * url: <a href="https://jon.wiki">Jon's blog</a>
 * url: <a href="https://opencode.cloud">OpenCode.cloud</a>
 */
@Configuration
@Component
public class TokenConfig {


    @Bean
    @ConfigurationProperties(prefix = "app.auth-token")
    public AuthToken apiToken() {
        return new AuthToken();
    }

    @Bean
    @ConfigurationProperties(prefix = "app.auth-filter")
    public AuthFilter authFilter() {
        return new AuthFilter();
    }

    @Getter
    @Setter
    public static class AuthToken {
        private long expire;
        private String key = "";
        private String secret = "";
    }

    @Getter
    @Setter
    public static class AuthFilter {
        private List<String> annoys = new ArrayList<>();
        private List<String> auths = new ArrayList<>();
    }

    @Bean
    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        advisorAutoProxyCreator.setProxyTargetClass(true);
        return advisorAutoProxyCreator;
    }
}