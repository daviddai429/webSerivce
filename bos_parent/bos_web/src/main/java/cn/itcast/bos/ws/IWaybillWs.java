package cn.itcast.bos.ws;

import cn.itcast.bos.entity.Waybilldetail;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by daviddai on 2017/7/27.
 */
@WebService
public interface IWaybillWs {

    List<Waybilldetail> waybilldetailList(Long sn);

    Long addWaybill(Long userId,String address,String addressee,String tele,String info);
}
