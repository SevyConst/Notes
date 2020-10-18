package service;

import dao.DeviceDAO;
import model.Device;

public class DeviceServiceImpl implements DeviceService {
    private DeviceDAO deviceDAO;

    public DeviceServiceImpl(DeviceDAO deviceDAO) {
        this.deviceDAO = deviceDAO;
    }

    @Override
    public void addDevice(Device device) {
        deviceDAO.save(device);
    }
}
