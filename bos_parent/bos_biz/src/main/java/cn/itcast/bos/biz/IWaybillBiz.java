package cn.itcast.bos.biz;
import cn.itcast.bos.entity.Waybill;
import cn.itcast.bos.entity.Waybilldetail;

import java.util.List;

/**
 * 业务逻辑层接口
 * @author Administrator
 *
 */
public interface IWaybillBiz extends IBaseBiz<Waybill> {

    public Long addWaybill(Long userId, String address, String addressee, String tele, String info);
}