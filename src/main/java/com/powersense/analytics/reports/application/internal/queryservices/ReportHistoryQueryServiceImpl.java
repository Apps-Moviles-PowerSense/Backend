package com.powersense.analytics.reports.application.internal.queryservices;

import com.powersense.analytics.reports.application.model.ReportHistoryResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class ReportHistoryQueryServiceImpl {

	public List<ReportHistoryResponse> getReportHistory() {
		return Arrays.asList(
				new ReportHistoryResponse(UUID.randomUUID().toString(), LocalDate.now().minusMonths(1), "Reporte Mensual", "PDF", "Administracion", 847.0, 423.0, 87),
				new ReportHistoryResponse(UUID.randomUUID().toString(), LocalDate.now().minusMonths(2), "Reporte Trimestral", "CSV", "Produccion", 1456.0, 728.0, 92),
				new ReportHistoryResponse(UUID.randomUUID().toString(), LocalDate.now().minusMonths(3), "Reporte Anual", "PDF", "Ventas", 543.0, 272.0, 85)
		);
	}
}
