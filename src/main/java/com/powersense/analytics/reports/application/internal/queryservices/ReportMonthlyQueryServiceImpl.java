package com.powersense.analytics.reports.application.internal.queryservices;

import com.powersense.analytics.reports.application.model.MonthlyComparisonResponse;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ReportMonthlyQueryServiceImpl {

	public List<MonthlyComparisonResponse> getMonthlyComparison() {
		return Arrays.asList(
				new MonthlyComparisonResponse("Ene", 3250, 2800),
				new MonthlyComparisonResponse("Feb", 3100, 3200),
				new MonthlyComparisonResponse("Mar", 3300, 2900),
				new MonthlyComparisonResponse("Abr", 2800, 3100),
				new MonthlyComparisonResponse("May", 3500, 3000),
				new MonthlyComparisonResponse("Jun", 3100, 3400),
				new MonthlyComparisonResponse("Jul", 4000, 3800),
				new MonthlyComparisonResponse("Ago", 3800, 4100),
				new MonthlyComparisonResponse("Sep", 3150, 2950),
				new MonthlyComparisonResponse("Oct", 3200, 3300),
				new MonthlyComparisonResponse("Nov", 2900, 3100),
				new MonthlyComparisonResponse("Dic", 3500, 3800)
		);
	}
}
