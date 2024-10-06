package tech.reliab.course.tutovda.bank.entity;

import tech.reliab.course.tutovda.bank.service.BankOfficeService;

public class BankOffice {
    private int id;
    private String name;
    private String address;
    private boolean isWorking;
    private boolean isAtmPlaceable;
    private int atmsAmount;
    private boolean isCreditAvailable;
    private boolean isCashOutputAvailable;
    private boolean isCashInputAvailable;
    private long totalMoney;
    private int rentPrice;

    private void defaultInitialization() {
        id = (int) (1 + Math.random() * 10000);
        name = "-";
        address = "-";
        isWorking = false;
        isAtmPlaceable = false;
        atmsAmount = 0;
        isCreditAvailable = false;
        isCashOutputAvailable = false;
        isCashInputAvailable = false;
        totalMoney = 0;
        rentPrice = 0;
    }

    public BankOffice() {
        defaultInitialization();
    }

    public BankOffice(String name, String address) {
        defaultInitialization();
        this.name = name;
        this.address = address;
    }

    public BankOffice(int id, String name, String address, boolean isWorking, boolean isAtmPlaceable,
                      int atmsAmount, boolean isCreditAvailable, boolean isCashOutputAvailable,
                      boolean isCashInputAvailable, long totalMoney, int rentPrice) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.isWorking = isWorking;
        this.isAtmPlaceable = isAtmPlaceable;
        this.atmsAmount = atmsAmount;
        this.isCreditAvailable = isCreditAvailable;
        this.isCashOutputAvailable = isCashOutputAvailable;
        this.isCashInputAvailable = isCashInputAvailable;
        this.totalMoney = totalMoney;
        this.rentPrice = rentPrice;
    }

    public BankOffice(BankOffice bankOffice) {
        this.id = bankOffice.id;
        this.name = bankOffice.name;
        this.address = bankOffice.address;
        this.isWorking = bankOffice.isWorking;
        this.isAtmPlaceable = bankOffice.isAtmPlaceable;
        this.atmsAmount = bankOffice.atmsAmount;
        this.isCreditAvailable = bankOffice.isCreditAvailable;
        this.isCashOutputAvailable = bankOffice.isCashOutputAvailable;
        this.isCashInputAvailable = bankOffice.isCashInputAvailable;
        this.totalMoney = bankOffice.totalMoney;
        this.rentPrice = bankOffice.rentPrice;
    }

    public String toString() {
        return "*** Bank Office Info ***\n" +
                "id -> " + id + '\n' +
                "name -> " + name + '\n' +
                "address -> " + address + '\n' +
                "working -> " + isWorking + '\n' +
                "atm placeable -> " + isAtmPlaceable + '\n' +
                "atms amount -> " + atmsAmount + '\n' +
                "credit available -> " + isCreditAvailable + '\n' +
                "cash output available -> " + isCashOutputAvailable + '\n' +
                "cash input available -> " + isCashInputAvailable + '\n' +
                "total money -> " + totalMoney + '\n' +
                "rent price -> " + rentPrice + '\n' +
                "*** **************** ***";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public boolean isAtmPlaceable() {
        return isAtmPlaceable;
    }

    public void setAtmPlaceable(boolean atmPlaceable) {
        isAtmPlaceable = atmPlaceable;
    }

    public int getAtmsAmount() {
        return atmsAmount;
    }

    public void setAtmsAmount(int atmsAmount) {
        this.atmsAmount = atmsAmount;
    }

    public boolean isCreditAvailable() {
        return isCreditAvailable;
    }

    public void setCreditAvailable(boolean creditAvailable) {
        isCreditAvailable = creditAvailable;
    }

    public boolean isCashOutputAvailable() {
        return isCashOutputAvailable;
    }

    public void setCashOutputAvailable(boolean cashOutputAvailable) {
        isCashOutputAvailable = cashOutputAvailable;
    }

    public boolean isCashInputAvailable() {
        return isCashInputAvailable;
    }

    public void setCashInputAvailable(boolean cashInputAvailable) {
        isCashInputAvailable = cashInputAvailable;
    }

    public long getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(long totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }
}
