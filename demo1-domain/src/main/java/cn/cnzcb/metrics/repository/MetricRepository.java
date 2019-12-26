package cn.cnzcb.metrics.repository;

import cn.cnzcb.metrics.entity.ATAMetric;
import cn.cnzcb.metrics.event.MetricItemCreatedEvent;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2019/12/26.
 */
@Repository
public class MetricRepository {

    public void save(ATAMetric ataMetric){
        MetricItemCreatedEvent metricItemCreatedEvent = new MetricItemCreatedEvent();
        metricItemCreatedEvent.setUrl(ataMetric.getUrl());
        //domainEventPublisher.publish(metricItemCreatedEvent);
    }
}
