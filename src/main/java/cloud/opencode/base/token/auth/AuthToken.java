package cloud.opencode.base.token.auth;

import org.apache.shiro.authc.AuthenticationToken;

import java.io.Serial;

/**
 * @author Jon
 * url: <a href="https://jon.wiki">Jon's blog</a>
 * url: <a href="https://opencode.cloud">OpenCode.cloud</a>
 */
public class AuthToken implements AuthenticationToken {
    @Serial
    private static final long serialVersionUID = 5322251404739083563L;
    private final String token;

    public AuthToken(String token) {
        this.token = token;
    }

    /**
     * get token
     *
     * @return token
     */
    @Override
    public String getPrincipal() {
        return token;
    }

    /**
     * get token
     *
     * @return token
     */
    @Override
    public Object getCredentials() {
        return token;
    }
}

