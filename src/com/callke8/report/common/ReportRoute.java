package com.callke8.report.common;

import com.callke8.report.cdr.CdrController;
import com.callke8.report.clientinfo.ClientInfoController;
import com.callke8.report.clienttouch.ClientTouchRecordController;
import com.callke8.report.performancestatistic.PerformanceStatisticController;
import com.jfinal.config.Routes;

public class ReportRoute extends Routes {

	@Override
	public void config() {
		add("/cdr",CdrController.class,"/report/cdr");
		add("/clientInfo",ClientInfoController.class,"/report/clientinfo");
		add("/clientTouchRecord",ClientTouchRecordController.class,"/report/clienttouchrecord");
		add("/performanceStatistic",PerformanceStatisticController.class,"/report/performancestatistic");
	}

}
