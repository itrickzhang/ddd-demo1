package cn.cnzcb.metrics.service;

import cn.cnzcb.metrics.entity.ATAMetric;
import cn.cnzcb.metrics.repository.MetricRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/12/26.
 */
@Component
public class ATAMetricService {

    @Autowired
    private MetricRepository metricRepository;

    public ATAMetric add(ATAMetric entity) {
        metricRepository.save(entity);
        return new ATAMetric();
    }
}
