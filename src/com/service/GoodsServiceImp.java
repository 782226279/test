package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bean.Goods;
import com.dao.GoodsMapper;

//service�ӿ�ʵ����
@Service
public class GoodsServiceImp implements GoodsService {

	@Resource(name = "goodsMapper")
	GoodsMapper goodsMapper;// // ����dao��ӿ�,mybatis�Ľӿ�

	@Override
	public Goods selectByPrimaryKey(Integer id) {
		return goodsMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Goods> selectAllGoods() {
		return goodsMapper.selectAllGoods();
	}

}
