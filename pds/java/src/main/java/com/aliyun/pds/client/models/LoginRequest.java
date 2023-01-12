// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.client.models;

import com.aliyun.tea.*;

/**
 * 
 */
public class LoginRequest extends TeaModel {
    @NameInMap("httpheaders")
    public java.util.Map<String, String> httpheaders;

    /**
     * <p>App ID, 当前访问的App</p>
     */
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    /**
     * <p>是否自动注册用户，使用密码登录此参数不生效</p>
     */
    @NameInMap("auto_register")
    public Boolean autoRegister;

    /**
     * <p>图片验证码ID, 密码登录需要此参数</p>
     */
    @NameInMap("captcha_id")
    public String captchaId;

    /**
     * <p>用户输入的验证码值, 密码登录需要此参数</p>
     */
    @NameInMap("captcha_text")
    public String captchaText;

    /**
     * <p>邮箱</p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <p>AES-256对称加密密钥，通过App公钥加密后传输</p>
     */
    @NameInMap("encrypted_key")
    public String encryptedKey;

    /**
     * <p>环境参数</p>
     */
    @NameInMap("nvc_param")
    @Validation(required = true)
    public String nvcParam;

    /**
     * <p>登录密码, 传入此参数则忽略短信验证码，不传此参数则默认使用短信登录。</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <p>待发送验证短信的手机号</p>
     */
    @NameInMap("phone_number")
    public String phoneNumber;

    /**
     * <p>国家编号，默认86，不需要填+号，直接填数字</p>
     */
    @NameInMap("phone_region")
    public String phoneRegion;

    /**
     * <p>短信验证码内容，使用密码登录此参数不生效</p>
     */
    @NameInMap("sms_code")
    public String smsCode;

    /**
     * <p>短信验证码ID，使用密码登录此参数不生效</p>
     */
    @NameInMap("sms_code_id")
    public String smsCodeId;

    public static LoginRequest build(java.util.Map<String, ?> map) throws Exception {
        LoginRequest self = new LoginRequest();
        return TeaModel.build(map, self);
    }

    public LoginRequest setHttpheaders(java.util.Map<String, String> httpheaders) {
        this.httpheaders = httpheaders;
        return this;
    }
    public java.util.Map<String, String> getHttpheaders() {
        return this.httpheaders;
    }

    public LoginRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public LoginRequest setAutoRegister(Boolean autoRegister) {
        this.autoRegister = autoRegister;
        return this;
    }
    public Boolean getAutoRegister() {
        return this.autoRegister;
    }

    public LoginRequest setCaptchaId(String captchaId) {
        this.captchaId = captchaId;
        return this;
    }
    public String getCaptchaId() {
        return this.captchaId;
    }

    public LoginRequest setCaptchaText(String captchaText) {
        this.captchaText = captchaText;
        return this;
    }
    public String getCaptchaText() {
        return this.captchaText;
    }

    public LoginRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public LoginRequest setEncryptedKey(String encryptedKey) {
        this.encryptedKey = encryptedKey;
        return this;
    }
    public String getEncryptedKey() {
        return this.encryptedKey;
    }

    public LoginRequest setNvcParam(String nvcParam) {
        this.nvcParam = nvcParam;
        return this;
    }
    public String getNvcParam() {
        return this.nvcParam;
    }

    public LoginRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public LoginRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public LoginRequest setPhoneRegion(String phoneRegion) {
        this.phoneRegion = phoneRegion;
        return this;
    }
    public String getPhoneRegion() {
        return this.phoneRegion;
    }

    public LoginRequest setSmsCode(String smsCode) {
        this.smsCode = smsCode;
        return this;
    }
    public String getSmsCode() {
        return this.smsCode;
    }

    public LoginRequest setSmsCodeId(String smsCodeId) {
        this.smsCodeId = smsCodeId;
        return this;
    }
    public String getSmsCodeId() {
        return this.smsCodeId;
    }

}
