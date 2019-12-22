package net.devaction.cadence.accountbalanceworkflow;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Víctor Gil
 *
 * since December 2019
 */
class Transfers {
    private final String accountId;

    private final List<Transfer> list = new LinkedList<Transfer>();

    Transfers(String accountId) {
        this.accountId = accountId;
    }

    void add(Transfer transfer) {
        list.add(transfer);
    }

    long numberOfTransfers() {
        // The initial "fake" transfers with amount = zero
        // does not count
        return (long) list.size() - 1;
    }

    @Override
    public String toString() {
        return "Transfers for account " + accountId + ":\n[transferList=" + list + "]";
    }
}