package org.tron.easywork.util;

import org.bouncycastle.util.encoders.Hex;
import org.tron.easywork.model.AccountInfo;
import org.tron.trident.core.key.KeyPair;
import org.tron.trident.utils.Base58Check;

/**
 * Tron 账户工具类
 *
 * @author Admin
 * @version 1.0
 * @time 2022-03-29 14:23
 */
public class AccountUtils {

    /**
     * 生成Tron账户
     *
     * @return tron account
     */
    public static AccountInfo generateAccount() {
        KeyPair keyPair = KeyPair.generate();
        return new AccountInfo(keyPair);
    }

    /**
     * 检查是否为正确的Tron地址
     *
     * @param address 地址
     * @return b
     */
    public static boolean isTronAddress(String address) {
        try {
            if (address.startsWith("T") && address.length() == 34) {
                Base58Check.base58ToBytes(address);
                return true;
            } else if (address.startsWith("41") && address.length() == 42) {
                Hex.decode(address);
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
