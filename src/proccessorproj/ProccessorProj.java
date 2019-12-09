/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proccessorproj;

/**
 *
 * @author Mark Evans
 */
public class ProccessorProj {
    public static void main(String[] args) {
        // identifies instance intelISeven
        ProcSkel intelISeven = new ProcSkel();
        intelISeven.setGfxMaxMem(64);
        intelISeven.setProcFreq(3.40);
        intelISeven.setCoreCount(4);
        intelISeven.setProcNum("i7-6700");
        intelISeven.setProcGfx("Intel H GFX 530");
        // end of instance intelISeven
        
        // identifies instance intelPentium
        ProcSkel intelPentium = new ProcSkel();
        intelPentium.setGfxMaxMem(384);
        intelPentium.setProcFreq(1.40);
        intelPentium.setCoreCount(2);
        intelPentium.setProcNum("1405V2");
        intelPentium.setProcGfx("None");
        // end of instance intelPentium
        
        // identifies instance intelCeleron
        ProcSkel intelCeleron = new ProcSkel();
        intelCeleron.setGfxMaxMem(16);
        intelCeleron.setProcFreq(1.40);
        intelCeleron.setCoreCount(2);
        intelCeleron.setProcNum("1047UE");
        intelCeleron.setProcGfx("Intel HD GFX 3rd Gen Intel");
        // end of instance intel Celeron
        
        // identifies instance MattProc
        ProcSkel MattProc = new ProcSkel();
        MattProc.setGfxMaxMem(32);
        MattProc.setProcFreq(4.20);
        MattProc.setCoreCount(4);
        MattProc.setProcNum("i7-8650U");
        MattProc.setProcGfx("Intel UHD GFX 620");
        // end of instance MattProc
        System.out.println(MattProc.getCoreCount());
        
        // identifies instance reqSpec
        ProcSkel reqSpec = new ProcSkel();
        reqSpec.setReqCore(2);
        reqSpec.setReqFreq(2.5);
        reqSpec.setReqMem(10);
        reqSpec.setReqProcType("Intel");
        requiredSpecs(reqSpec);
    } // end main method
    

    public static void requiredSpecs(ProcSkel args){
        System.out.println("Recommended Memory: " + args.getReqMem());
        System.out.println("Recommended Processor Frequency: " + args.getReqFreq());
        System.out.println("Recommended Core Count: "  + args.getReqCore());
        System.out.println("Recommended Processor Type: " + args.getReqProcType());
        
    } // close req method
    
} // end class
