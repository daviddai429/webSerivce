package cn.itcast.bos.ws.impl;

import cn.itcast.bos.biz.IWaybillBiz;
import cn.itcast.bos.biz.IWaybilldetailBiz;
import cn.itcast.bos.entity.Waybilldetail;
import cn.itcast.bos.ws.IWaybillWs;

import java.util.List;

/**
 * Created by daviddai on 2017/7/27.
 */
public class WaybillWs implements IWaybillWs {
    private IWaybillBiz waybillBiz;
    private IWaybilldetailBiz waybilldetailBiz;

    public void setWaybillBiz(IWaybillBiz waybillBiz) {
        this.waybillBiz = waybillBiz;
    }

    public void setWaybilldetailBiz(IWaybilldetailBiz waybilldetailBiz) {
        this.waybilldetailBiz = waybilldetailBiz;
    }

    @Override
    public List<Waybilldetail> waybilldetailList(Long sn) {
    	System.out.println("waybillws"+sn);
        return waybilldetailBiz.waybilldetailList(sn);
    }

    @Override
    public Long addWaybill(Long userId, String address, String addressee, String tele, String info) {
        return waybillBiz.addWaybill(userId,address,addressee,tele,info);
    }
}
