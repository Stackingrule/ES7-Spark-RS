package com.stackingrule.dianping.service;


import com.stackingrule.dianping.model.SellerModel;

import java.util.List;

public interface SellerService {

    SellerModel create(SellerModel sellerModel);

    SellerModel get(Integer id);

    List<SellerModel> selectAll();

    SellerModel changeStatus(Integer id, Integer disableFlag);

}
