package com.powersense.analytics.reports.application.internal.queryservices;

import com.powersense.analytics.reports.application.model.DepartmentMetricResponse;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ReportDepartmentsQueryServiceImpl {

	public List<DepartmentMetricResponse> getDepartmentMetrics() {
		return Arrays.asList(
				new DepartmentMetricResponse("dept-1", "Administracion", "consumption", 847.0, 902.0),
				new DepartmentMetricResponse("dept-2", "Produccion", "consumption", 1456.0, 1300.0),
				new DepartmentMetricResponse("dept-3", "Ventas", "consumption", 543.0, 560.0),
				new DepartmentMetricResponse("dept-4", "IT", "consumption", 450.0, 450.0),
				new DepartmentMetricResponse("dept-5", "RRHH", "consumption", 320.0, 320.0)
		);
	}
}
