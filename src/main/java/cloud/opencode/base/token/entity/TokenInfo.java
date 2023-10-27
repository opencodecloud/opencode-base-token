package cloud.opencode.base.token.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Jon
 * url: <a href="https://jon.wiki">Jon's blog</a>
 * url: <a href="https://opencode.cloud">OpenCode.cloud</a>
 */
@Data
@Accessors(chain = true)
public class TokenInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = 2277637551172988174L;
    private Integer userId;
    private String appKey;
}
