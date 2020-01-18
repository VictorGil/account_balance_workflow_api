package net.devaction.cadence.accountbalanceworkflow;

import java.math.BigDecimal;
import java.util.List;

import com.uber.cadence.workflow.QueryMethod;
import com.uber.cadence.workflow.SignalMethod;
import com.uber.cadence.workflow.WorkflowMethod;

import net.devaction.entity.AccountBalanceEntity;
import net.devaction.entity.TransferEntity;

/**
 * @author Víctor Gil
 *
 * since December 2019
 */
public interface AccountBalanceWorkflow {

    @WorkflowMethod
    void openAccount(String accountId);

    @SignalMethod
    void addTransfer(String id, BigDecimal amount, long transferTS);

    @SignalMethod
    void closeAccount();

    @QueryMethod
    BigDecimal getBalanceValue();

    @QueryMethod
    AccountBalanceEntity getBalance();

    @QueryMethod
    List<TransferEntity> getTransfersList();
}
