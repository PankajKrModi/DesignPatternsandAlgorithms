package DesignPatterns.Template;

import DesignPatterns.Template.framework.AuditTrail;
import DesignPatterns.Template.framework.Task;

public class TransferMoney extends Task {

    public TransferMoney(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void performOperation() {
        System.out.println("Transfer Money");
    }
}
