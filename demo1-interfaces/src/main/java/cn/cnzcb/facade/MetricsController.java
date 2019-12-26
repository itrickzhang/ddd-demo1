package cn.cnzcb.facade;

import cn.cnzcb.assembler.ATAMetriConvert;
import cn.cnzcb.dto.ATAMetricDTO;
import cn.cnzcb.metrics.entity.ATAMetric;
import cn.cnzcb.service.impl.MetricsService;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2019/12/26.
 */
@RestController
public class MetricsController {

    private MetricsService metricsService;

    @PostMapping(value = "/metrics/ata")
    public ATAMetric addATAMetric(@RequestBody ATAMetricDTO ataMetricDTO){
        ATAMetric ataMetricVO = new ATAMetriConvert().convert(ataMetricDTO,new ATAMetric());
        return metricsService.addATAMetric(ataMetricVO);
    }
}
