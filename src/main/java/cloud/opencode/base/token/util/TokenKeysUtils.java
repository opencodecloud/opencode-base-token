package cloud.opencode.base.token.util;

import cloud.opencode.base.token.entity.TokenUser;

/**
 * @author Jon
 * url: <a href="https://jon.wiki">Jon's blog</a>
 * url: <a href="https://opencode.cloud">OpenCode.cloud</a>
 */
public class TokenKeysUtils {
    /**
     * get tokenKey
     *
     * @param baseKey baseKey
     * @param user    user
     * @return tokenKey
     */
    public static String getTokenKey(String baseKey, TokenUser user) {
        return baseKey + "-user-" + user.getUserId() + "-token";
    }

    /**
     * get permissionKey
     *
     * @param baseKey baseKey
     * @param user    user
     * @return permissionKey
     */
    public static String getPermissionKey(String baseKey, TokenUser user) {
        return baseKey + "-user-" + user.getUserId() + "-permissions";
    }

    /**
     * get roleKey
     *
     * @param baseKey baseKey
     * @param user    user
     * @return roleKey
     */
    public static String getRolesKey(String baseKey, TokenUser user) {
        return baseKey + "-user-" + user.getUserId() + "-roles";
    }

    /**
     * get userKey
     *
     * @param baseKey baseKey
     * @param user    user
     * @return userkey
     */
    public static String getUserKey(String baseKey, TokenUser user) {
        return baseKey + "-user-" + user.getUserId();
    }

    /**
     * get tokenKey
     *
     * @param baseKey baseKey
     * @param userId  userId
     * @return tokenKey
     */
    public static String getTokenKey(String baseKey, Integer userId) {
        return baseKey + "-user-" + userId + "-token";
    }

    /**
     * get permissionKey
     *
     * @param baseKey baseKey
     * @param userId  userId
     * @return permissionKey
     */
    public static String getPermissionKey(String baseKey, Integer userId) {
        return baseKey + "-user-" + userId + "-permissions";
    }

    /**
     * get roleKey
     *
     * @param baseKey baseKey
     * @param userId  userId
     * @return roleKey
     */
    public static String getRolesKey(String baseKey, Integer userId) {
        return baseKey + "-user-" + userId + "-roles";
    }

    /**
     * get userKey
     *
     * @param baseKey baseKey
     * @param userId  userId
     * @return userKey
     */
    public static String getUserKey(String baseKey, Integer userId) {
        return baseKey + "-user-" + userId;
    }
}