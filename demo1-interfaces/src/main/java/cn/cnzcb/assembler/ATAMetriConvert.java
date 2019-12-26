package cn.cnzcb.assembler;

import cn.cnzcb.dto.ATAMetricDTO;
import cn.cnzcb.metrics.entity.ATAMetric;

/**
 * Created by Administrator on 2019/12/26.
 */
public class ATAMetriConvert {
    public ATAMetric convert(ATAMetricDTO ataMetricDTO, ATAMetric ataMetric) {
        ataMetric.setCommentCount(ataMetricDTO.getCommentCount());
        return ataMetric;
    }
}
