package org.example.customer.test.jasypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;

/**
 * Jasypt 密码加密
 * 测试用例中指定了密钥为 hahaha ，生产环境根据实际需求修改密钥
 * 不建议将密钥放在配置文件中，可以追加启动参数
 * war包修改 tomcat/bin/Catalina.sh 的 JAVA_OPTS 值
 * war包参数：-Djasypt.encryptor.password=${salt}
 * jar包参数：--jasypt.encryptor.password=${salt}
 */
public class JasyptTest {

    public String encrypt(String str) {
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        standardPBEStringEncryptor.setPassword("hahaha");
        return standardPBEStringEncryptor.encrypt(str);
    }

    public String decrypt(String str) {
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        standardPBEStringEncryptor.setPassword("hahaha");
        return standardPBEStringEncryptor.decrypt(str);
    }

    @Test
    public void main() {
        String password = "123456";
        String encPassword = "BNQfNZ0EyBLDthdXjs8JGw==";
        System.out.println(encrypt(password));
        System.out.println(decrypt(encPassword));
    }

}
