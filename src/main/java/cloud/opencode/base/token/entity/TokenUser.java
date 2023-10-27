package cloud.opencode.base.token.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * @author Jon
 * url: <a href="https://jon.wiki">Jon's blog</a>
 * url: <a href="https://opencode.cloud">OpenCode.cloud</a>
 */
@Data
@Accessors(chain = true)
public class TokenUser implements Serializable {
    @Serial
    private static final long serialVersionUID = -7493381446132528089L;
    private Integer userId;
    private String userName;
    private String userTel;
    private LocalDateTime userLoginTime;
    private Integer status;
    /**
     * If used simple mode, it's no required.
     */
    private Set<String> userPermissionSet;
    /**
     * If used simple mode, it's no required.
     */
    private Set<String> userRolesSet;
}
