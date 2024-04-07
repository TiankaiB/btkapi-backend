package com.btk.btkapicommon.service;

import com.btk.btkapicommon.model.entity.User;

public interface InnerUserService {
    User getInvokeUser(String accessKey);
}
