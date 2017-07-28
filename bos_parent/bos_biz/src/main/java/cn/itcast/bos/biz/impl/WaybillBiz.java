package cn.itcast.bos.biz.impl;
import cn.itcast.bos.biz.IWaybillBiz;
import cn.itcast.bos.biz.IWaybilldetailBiz;
import cn.itcast.bos.dao.IWaybillDao;
import cn.itcast.bos.dao.IWaybilldetailDao;
import cn.itcast.bos.entity.Waybill;
import cn.itcast.bos.entity.Waybilldetail;

import java.util.List;

/**
 * 业务逻辑类
 * @author Administrator
 *
 */
public class WaybillBiz extends BaseBiz<Waybill> implements IWaybillBiz {

	private IWaybillDao waybillDao;

    public void setWaybillDao(IWaybillDao waybillDao) {
		this.waybillDao = waybillDao;
		super.setBaseDao(this.waybillDao);
	}


    @Override
    public Long addWaybill(Long userId, String address, String addressee, String tele, String info) {
        Waybill waybill = new Waybill();
        waybill.setState("0");
        waybill.setToaddress(address);
        waybill.setAddressee(addressee);
        waybill.setTele(tele);
        waybill.setInfo(info);
        waybillDao.add(waybill);
        return waybill.getSn();
    }
}
