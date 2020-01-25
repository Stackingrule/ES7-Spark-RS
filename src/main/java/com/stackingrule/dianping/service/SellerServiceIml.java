package com.stackingrule.dianping.service;


import com.stackingrule.dianping.dal.SellerModelMapper;
import com.stackingrule.dianping.model.SellerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SellerServiceIml implements SellerService {

    @Autowired
    private SellerModelMapper sellerModelMapper;

    @Override
    public SellerModel create(SellerModel sellerModel) {
        return null;
    }

    @Override
    public SellerModel get(Integer id) {
        return null;
    }

    @Override
    public List<SellerModel> selectAll() {

        return sellerModelMapper.selectAll();
    }

    @Override
    public SellerModel changeStatus(Integer id, Integer disableFlag) {
        return null;
    }
}
