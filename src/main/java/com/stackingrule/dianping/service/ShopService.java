package com.stackingrule.dianping.service;


import com.stackingrule.dianping.common.BusinessException;
import com.stackingrule.dianping.model.ShopModel;

import java.util.List;

public interface ShopService {

    ShopModel create(ShopModel shopModel) throws BusinessException;

    ShopModel get(Integer id);

    List<ShopModel> selectAll();

    Integer countAllShop();
}
