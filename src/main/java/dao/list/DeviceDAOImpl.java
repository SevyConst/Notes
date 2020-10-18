package dao.list;

import dao.DeviceDAO;
import model.Device;
import model.User;

import java.util.ArrayList;
import java.util.UUID;

public class DeviceDAOImpl extends AbstractDAO<Device, UUID> implements DeviceDAO {

    public DeviceDAOImpl() {super(Device.class, new ArrayList<>());}

}
