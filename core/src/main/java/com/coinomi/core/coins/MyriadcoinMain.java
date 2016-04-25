package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class MyriadcoinMain extends BitFamily {
    private MyriadcoinMain() {
        id = "myriadcoin.main";

        addressHeader = 50;
        p2shHeader = 9;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 178;

        name = "Myriadcoin";
        symbol = "MYR";
        uriScheme = "myriadcoin";
        bip44Index = 90;
        unitExponent = 8;
        feeValue = value(12000);
        minNonDust = value(5460);
        softDustLimit = value(1000000); // 0.01 MYR
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("Myriadcoin Signed Message:\n");
    }

    private static MyriadcoinMain instance = new MyriadcoinMain();
    public static synchronized MyriadcoinMain get() {
        return instance;
    }
}
