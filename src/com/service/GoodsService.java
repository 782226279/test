package com.service;

import java.util.List;

import com.bean.Goods;

//service�ӿ�
public interface GoodsService {
	// ����������ѯһ��Goods����
	Goods selectByPrimaryKey(Integer id);

	// ��ѯ���е�goods����
	List<Goods> selectAllGoods();
}
