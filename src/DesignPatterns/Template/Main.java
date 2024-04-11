package DesignPatterns.Template;

import DesignPatterns.Template.framework.AuditTrail;
import DesignPatterns.Template.framework.Task;

public class Main {
    public static void main(String[] args) {
        AuditTrail auditTrail = new AuditTrail();
        Task transferMoney = new TransferMoney(auditTrail);
        transferMoney.execute();

    }
}
