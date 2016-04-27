package com.dfrobot.angelo.blunobasicdemo.comps;

import android.bluetooth.BluetoothGattCharacteristic;

/**
 * //class to store the Characteristic and content string push into the ring buffer.
 * <p/>
 * Created by ldmsoft on 2016/4/28.
 */
public class BluetoothGattCharacteristicHelper {

    public BluetoothGattCharacteristic mCharacteristic;
    public String mCharacteristicValue;

    public BluetoothGattCharacteristicHelper(BluetoothGattCharacteristic characteristic, String characteristicValue) {
        mCharacteristic = characteristic;
        mCharacteristicValue = characteristicValue;
    }

}
