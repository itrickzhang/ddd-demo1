package cn.cnzcb.service.impl;

import cn.cnzcb.metrics.entity.ATAMetric;
import cn.cnzcb.metrics.service.ATAMetricService;
import cn.cnzcb.service.api.IMetricsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/12/26.
 */
@Component
public class MetricsService implements IMetricsService {

    @Autowired
    private ATAMetricService ataMetricService;

    public ATAMetric addATAMetric(ATAMetric ataMetric) {
        return ataMetricService.add(ataMetric);
    }
}
