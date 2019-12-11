/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proccessorproj;

/**
 *
 * @author mark.evans2358
 */
public class ProcSkel {
    private int gfxMaxMem;
    private double procFreq;
    private int coreCount;
    private String procNum;
    private String procGfx;
    private int reqMem;
    private double reqFreq;
    private int reqCore;
    private String reqProcType;

    /**
     * @return the gfxMaxMem
     */
    public int getGfxMaxMem() {
        return gfxMaxMem;
    }

    /**
     * @param gfxMaxMem the gfxMaxMem to set
     */
    public void setGfxMaxMem(int gfxMaxMem) {
        this.gfxMaxMem = gfxMaxMem;
    }

    /**
     * @return the procFreq
     */
    public double getProcFreq() {
        return procFreq;
    }

    /**
     * @param procFreq the procFreq to set
     */
    public void setProcFreq(double procFreq) {
        this.procFreq = procFreq;
    }

    /**
     * @return the coreCount
     */
    public int getCoreCount() {
        return coreCount;
    }

    /**
     * @param coreCount the coreCount to set
     */
    public void setCoreCount(int coreCount) {
        this.coreCount = coreCount;
    }

    /**
     * @return the procNum
     */
    public String getProcNum() {
        return procNum;
    }

    /**
     * @param procNum the procNum to set
     */
    public void setProcNum(String procNum) {
        this.procNum = procNum;
    }

    /**
     * @return the procGfx
     */
    public String getProcGfx() {
        return procGfx;
    }

    /**
     * @param procGfx the procGfx to set
     */
    public void setProcGfx(String procGfx) {
        this.procGfx = procGfx;
    }

    /**
     * @return the reqMem
     */
    public int getReqMem() {
        return reqMem;
    }

    /**
     * @param reqMem the reqMem to set
     */
    public void setReqMem(int reqMem) {
        this.reqMem = reqMem;
    }

    /**
     * @return the reqFreq
     */
    public double getReqFreq() {
        return reqFreq;
    }

    /**
     * @param reqFreq the reqFreq to set
     */
    public void setReqFreq(double reqFreq) {
        this.reqFreq = reqFreq;
    }

    /**
     * @return the reqCore
     */
    public int getReqCore() {
        return reqCore;
    }

    /**
     * @param reqCore the reqCore to set
     */
    public void setReqCore(int reqCore) {
        this.reqCore = reqCore;
    }

    /**
     * @return the reqProcType
     */
    public String getReqProcType() {
        return reqProcType;
    }

    /**
     * @param reqProcType the reqProcType to set
     */
    public void setReqProcType(String reqProcType) {
        this.reqProcType = reqProcType;
    }
    public void displayProcInfo() {
        System.out.println(getGfxMaxMem());
        System.out.println(getProcFreq());
        System.out.println(getCoreCount());
        System.out.println(getProcNum());
        System.out.println(getProcGfx());
    } // close displayProcInfo
}
