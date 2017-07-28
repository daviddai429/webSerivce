package cn.itcast.bos.action;
import cn.itcast.bos.biz.IWaybilldetailBiz;
import cn.itcast.bos.entity.Waybilldetail;

/**
 * Action 
 * @author Administrator
 *
 */
public class WaybilldetailAction extends BaseAction<Waybilldetail> {

	private IWaybilldetailBiz waybilldetailBiz;

	public void setWaybilldetailBiz(IWaybilldetailBiz waybilldetailBiz) {
		this.waybilldetailBiz = waybilldetailBiz;
		super.setBaseBiz(this.waybilldetailBiz);
	}

}
