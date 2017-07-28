package cn.itcast.bos.biz.impl;
import cn.itcast.bos.biz.IWaybilldetailBiz;
import cn.itcast.bos.dao.IWaybilldetailDao;
import cn.itcast.bos.entity.Waybilldetail;

import java.util.List;

/**
 * 业务逻辑类
 * @author Administrator
 *
 */
public class WaybilldetailBiz extends BaseBiz<Waybilldetail> implements IWaybilldetailBiz {

	private IWaybilldetailDao waybilldetailDao;
	
	public void setWaybilldetailDao(IWaybilldetailDao waybilldetailDao) {
		this.waybilldetailDao = waybilldetailDao;
		super.setBaseDao(this.waybilldetailDao);
	}

	@Override
	public List<Waybilldetail> waybilldetailList(Long sn) {
		Waybilldetail waybilldetail = new Waybilldetail();
		return waybilldetailDao.getList(waybilldetail,null,null);
	}
	
}
