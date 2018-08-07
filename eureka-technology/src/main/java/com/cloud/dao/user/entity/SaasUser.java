package com.cloud.dao.user.entity;

/**
 * 描述:saas_user表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2018-08-06
 */
public class SaasUser {
    /**
     * 用户id
     */
    private Integer id;

    /**
     * 系统id
     */
    private Integer domainId;

    /**
     * 用户手机号
     */
    private String userPhone;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPwd;

    /**
     * 用户token
     */
    private String userToken;

    /**
     * 登录IP
     */
    private String userIp;

    /**
     * 用户头像
     */
    private String userImg;

    /**
     * 是否开启（用户状态）
     */
    private String state;

    /**
     * 0、平台超管；1、系统超管；2、普通用户
     */
    private Byte type;

    /**
     * 是否删除
     */
    private Byte isDelete;

    /**
     * 创建时间
     */
    private Integer createTime;

    /**
     * 修改时间
     */
    private Integer updateTime;

    /**
     * 登录时间
     */
    private Integer loginTime;

    /**
     * 附加字段
     */
    private String attach;

    /**
     * 用户id
     * @return id 用户id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 用户id
     * @param id 用户id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 系统id
     * @return domain_id 系统id
     */
    public Integer getDomainId() {
        return domainId;
    }

    /**
     * 系统id
     * @param domainId 系统id
     */
    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    /**
     * 用户手机号
     * @return user_phone 用户手机号
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 用户手机号
     * @param userPhone 用户手机号
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * 用户姓名
     * @return user_name 用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户姓名
     * @param userName 用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 用户密码
     * @return user_pwd 用户密码
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * 用户密码
     * @param userPwd 用户密码
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    /**
     * 用户token
     * @return user_token 用户token
     */
    public String getUserToken() {
        return userToken;
    }

    /**
     * 用户token
     * @param userToken 用户token
     */
    public void setUserToken(String userToken) {
        this.userToken = userToken == null ? null : userToken.trim();
    }

    /**
     * 登录IP
     * @return user_ip 登录IP
     */
    public String getUserIp() {
        return userIp;
    }

    /**
     * 登录IP
     * @param userIp 登录IP
     */
    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    /**
     * 用户头像
     * @return user_img 用户头像
     */
    public String getUserImg() {
        return userImg;
    }

    /**
     * 用户头像
     * @param userImg 用户头像
     */
    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }

    /**
     * 是否开启（用户状态）
     * @return state 是否开启（用户状态）
     */
    public String getState() {
        return state;
    }

    /**
     * 是否开启（用户状态）
     * @param state 是否开启（用户状态）
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * 0、平台超管；1、系统超管；2、普通用户
     * @return type 0、平台超管；1、系统超管；2、普通用户
     */
    public Byte getType() {
        return type;
    }

    /**
     * 0、平台超管；1、系统超管；2、普通用户
     * @param type 0、平台超管；1、系统超管；2、普通用户
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 是否删除
     * @return is_delete 是否删除
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * 是否删除
     * @param isDelete 是否删除
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * @return update_time 修改时间
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 登录时间
     * @return login_time 登录时间
     */
    public Integer getLoginTime() {
        return loginTime;
    }

    /**
     * 登录时间
     * @param loginTime 登录时间
     */
    public void setLoginTime(Integer loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 附加字段
     * @return attach 附加字段
     */
    public String getAttach() {
        return attach;
    }

    /**
     * 附加字段
     * @param attach 附加字段
     */
    public void setAttach(String attach) {
        this.attach = attach == null ? null : attach.trim();
    }
}