package com.btk.btkapicommon.service;

import com.btk.btkapicommon.model.entity.InterfaceInfo;

public interface InnerInterfaceInfoService {
    InterfaceInfo getInterfaceInfo(String path, String method);
}
