package com.stackingrule.dianping.service;

import com.stackingrule.dianping.common.BusinessException;
import com.stackingrule.dianping.common.EmBusinessError;
import com.stackingrule.dianping.dal.SellerModelMapper;
import com.stackingrule.dianping.model.SellerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerModelMapper sellerModelMapper;

    @Override
    @Transactional
    public SellerModel create(SellerModel sellerModel) {

        sellerModel.setCreatedAt(new Date());
        sellerModel.setUpdatedAt(new Date());
        sellerModel.setRemarkScore(new BigDecimal(0));
        sellerModel.setDisabledFlag((int) 0);
        sellerModelMapper.insertSelective(sellerModel);
        return get(sellerModel.getId());
    }

    @Override
    public SellerModel get(Integer id) {

        return sellerModelMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SellerModel> selectAll() {

        return sellerModelMapper.selectAll();
    }

    @Override
    public SellerModel changeStatus(Integer id, Integer disableFlag) throws BusinessException {

        SellerModel sellerModel = get(id);
        if (sellerModel == null) {
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
        }
        sellerModel.setDisabledFlag(disableFlag);
        sellerModelMapper.updateByPrimaryKeySelective(sellerModel);

        return sellerModel;
    }

    @Override
    public Integer countAllSeller() {
        return sellerModelMapper.countAllSeller();
    }
}
