package com.yupi.springbootinit.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.btk.btkapicommon.model.entity.UserInterfaceInfo;

/**
* @author tiankaibao
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-04-02 10:49:10
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);


    boolean invokeCount(long interfaceInfoId, long useId);
}
