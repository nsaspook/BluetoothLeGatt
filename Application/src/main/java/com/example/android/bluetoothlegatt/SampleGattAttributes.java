/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
class SampleGattAttributes {
    public static final String RELAY_STATUS_CONTROL1234 = "cd83060a-3afa-4a9d-a58b-8224cd2ded70";
    public static final String RELAY_STATUS_CONTROL1 = "cd830609-3afa-4a9d-a58b-8224cd2ded70";
    public static final String RELAY_STATUS_CONTROL2 = "362232e5-c5a9-4af6-b30c-e208f1a9ae3e";
    public static final String CLIENT_CHARACTERISTIC_CONFIG = "cd830609-3afa-4a9d-a58b-8224cd2ded70";
    private static final HashMap<String, String> attributes = new HashMap();

    static {
        // Sample Services.
        attributes.put("28238791-ec55-4130-86e0-002cd96aec9d", "FAB-4 Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "BLE Relay Controller");
        attributes.put("00001800-0000-1000-8000-00805f9b34fb", "Not Used");
        attributes.put("00001801-0000-1000-8000-00805f9b34fb", "Not Used");
        // Sample Characteristics.
        attributes.put(RELAY_STATUS_CONTROL1234, "Relays All On");
        attributes.put(RELAY_STATUS_CONTROL1, "Relay Control 1");
        attributes.put(RELAY_STATUS_CONTROL2, "Relay Control 2");
        attributes.put("8f7087bd-fdf3-4b87-b10f-abbf636b1cd5", "Relays All Off");
        attributes.put("362232e5-c5a9-4af6-b30c-e208f1a9ae3e", "Relay Control 2");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "FAB-4 EE Group");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
