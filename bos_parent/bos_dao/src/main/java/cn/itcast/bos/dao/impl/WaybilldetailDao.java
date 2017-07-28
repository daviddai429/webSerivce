package cn.itcast.bos.dao.impl;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import cn.itcast.bos.dao.IWaybilldetailDao;
import cn.itcast.bos.entity.Waybilldetail;
/**
 * 数据访问类
 * @author Administrator
 *
 */
public class WaybilldetailDao extends BaseDao<Waybilldetail> implements IWaybilldetailDao {

	/**
	 * 构建查询条件
	 * @param waybilldetail1
	 * @param waybilldetail2
	 * @param param
	 * @return
	 */
	public DetachedCriteria getDetachedCriteria(Waybilldetail waybilldetail1,Waybilldetail waybilldetail2,Object param){
		DetachedCriteria dc=DetachedCriteria.forClass(Waybilldetail.class);
		if(waybilldetail1!=null){
			if(null != waybilldetail1.getExedate() && waybilldetail1.getExedate().trim().length()>0){
				dc.add(Restrictions.like("exedate", waybilldetail1.getExedate(), MatchMode.ANYWHERE));
			}
			if(null != waybilldetail1.getExetime() && waybilldetail1.getExetime().trim().length()>0){
				dc.add(Restrictions.like("exetime", waybilldetail1.getExetime(), MatchMode.ANYWHERE));
			}
			if(null != waybilldetail1.getInfo() && waybilldetail1.getInfo().trim().length()>0){
				dc.add(Restrictions.like("info", waybilldetail1.getInfo(), MatchMode.ANYWHERE));
			}
			if(null != waybilldetail1.getSn()){
				System.out.println("waybilldao"+waybilldetail1.getSn());
				dc.add(Restrictions.eq("sn",waybilldetail1.getSn()));
			}

		}
		return dc;
	}

}
