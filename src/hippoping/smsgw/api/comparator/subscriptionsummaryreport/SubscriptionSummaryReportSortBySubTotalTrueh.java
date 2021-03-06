package hippoping.smsgw.api.comparator.subscriptionsummaryreport;

import hippoping.smsgw.api.db.OperConfig;
import hippoping.smsgw.api.db.report.SummaryReport;
import java.util.Comparator;

public class SubscriptionSummaryReportSortBySubTotalTrueh
        implements Comparator<SummaryReport> {

    public int compare(SummaryReport s1, SummaryReport s2) {
        if ((s1 == null) || (s2 == null)) {
            return 0;
        }
        return s1.getSub_total(OperConfig.CARRIER.TRUEH) - s2.getSub_total(OperConfig.CARRIER.TRUEH);
    }
}