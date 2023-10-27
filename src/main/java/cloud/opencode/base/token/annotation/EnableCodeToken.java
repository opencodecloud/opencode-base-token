package cloud.opencode.base.token.annotation;

import cloud.opencode.base.token.config.TokenAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author Jon
 * url: <a href="https://jon.wiki">Jon's blog</a>
 * url: <a href="https://opencode.cloud">OpenCode.cloud</a>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(TokenAutoConfiguration.class)
@Documented
@Inherited
public @interface EnableCodeToken {
}