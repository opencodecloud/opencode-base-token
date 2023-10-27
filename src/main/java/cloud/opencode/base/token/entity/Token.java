package cloud.opencode.base.token.entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Jon
 * url: <a href="https://jon.wiki">Jon's blog</a>
 * url: <a href="https://opencode.cloud">OpenCode.cloud</a>
 */
@Data
public class Token implements Serializable {

    @Serial
    private static final long serialVersionUID = 4476960882328836551L;
    private String token;
    private Long expire;
}
