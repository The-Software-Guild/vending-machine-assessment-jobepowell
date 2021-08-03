
import com.jobep.vendingmachine.controller.VMController;
import com.jobep.vendingmachine.dao.VMAuditDao;
import com.jobep.vendingmachine.dao.VMAuditDaoFileImpl;
import com.jobep.vendingmachine.dao.VMDao;
import com.jobep.vendingmachine.dao.VMDaoFileImpl;
import com.jobep.vendingmachine.service.VMServiceLayer;
import com.jobep.vendingmachine.ui.UserIO;
import com.jobep.vendingmachine.ui.UserIOConsoleImpl;
import com.jobep.vendingmachine.ui.VMView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author powel
 */
public class App {
    public static void main(String[] args){
        UserIO io = new UserIOConsoleImpl();
        VMView view = new VMView(io);
        VMDao dao = new VMDaoFileImpl();
        VMAuditDao audit = new VMAuditDaoFileImpl();
        
        VMServiceLayer service = new VMServiceLayer(dao,audit);
        VMController controller = new VMController(service,view);
        controller.run();
        
    }
}
