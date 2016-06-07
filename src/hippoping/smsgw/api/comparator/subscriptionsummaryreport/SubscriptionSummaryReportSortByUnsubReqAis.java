/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hippoping.smsgw.api.comparator.subscriptionsummaryreport;

import hippoping.smsgw.api.db.OperConfig.CARRIER;
import hippoping.smsgw.api.db.report.SummaryReport;
import java.util.Comparator;

/**
 *
 * @author developer
 */
public class SubscriptionSummaryReportSortByUnsubReqAis implements Comparator<SummaryReport> {
    public int compare(SummaryReport s1, SummaryReport s2) {
        if (s1==null || s2==null) {
            return 0;
        }
        return (s1.getUnsub_req(CARRIER.AIS) + s1.getUnsub_req(CARRIER.AIS_LEGACY)) -
                (s2.getUnsub_req(CARRIER.AIS) + s2.getUnsub_req(CARRIER.AIS_LEGACY));
    }
}