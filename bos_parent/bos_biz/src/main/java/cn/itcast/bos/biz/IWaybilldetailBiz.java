package cn.itcast.bos.biz;
import cn.itcast.bos.entity.Waybilldetail;

import java.util.List;

/**
 * 业务逻辑层接口
 * @author Administrator
 *
 */
public interface IWaybilldetailBiz extends IBaseBiz<Waybilldetail>{

    public List<Waybilldetail> waybilldetailList(Long sn);
}

