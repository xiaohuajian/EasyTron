package org.tron.easywork.handler.transfer;

import org.tron.easywork.model.TransferInfo;
import org.tron.trident.proto.Chain;

/**
 * @author Admin
 * @version 1.0
 * @time 2022-10-30 15:37
 */
public interface LocalTransfer {

    /**
     * 构建本地交易
     *
     * @param transferInfo   交易信息
     * @param refBlockHeader 引用区块头，范围最新区块 65535 以内
     * @return 交易信息
     */
    Chain.Transaction buildLocalTransfer(TransferInfo transferInfo, Chain.BlockHeader refBlockHeader);
}
