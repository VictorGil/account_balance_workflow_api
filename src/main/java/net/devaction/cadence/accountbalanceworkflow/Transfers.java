package net.devaction.cadence.accountbalanceworkflow;

//import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import net.devaction.entity.TransferEntity;

/**
 * @author Víctor Gil
 *
 * since December 2019
 */
//class Transfers implements Iterable<TransferEntity> {
class Transfers {

    private final String accountId;

    private final List<TransferEntity> list = new LinkedList<TransferEntity>();

    Transfers(String accountId) {
        this.accountId = accountId;
    }

    void add(TransferEntity transfer) {
        list.add(transfer);
    }

    // this is also the version number
    long numberOfTransfers() {
        return (long) list.size();
    }

    List<TransferEntity> getList() {
        return list;
    }

    String getLatestTransferId() {
        TransferEntity latestTransfer = list.get(list.size() - 1);
        return latestTransfer.getId();
    }

    @Override
    public String toString() {
        return "Transfers for account " + accountId + ":\n[transferList=" + list + "]";
    }

    /*
    @Override
    public Iterator<TransferEntity> iterator() {
        return list.iterator();
    }
    */
}
