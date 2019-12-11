/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proccessorproj;
import java.util.Scanner;

/**
 *
 * @author Mark Evans
 */
public class ProccessorProj {
    public static void main(String[] args) {
        
        int userResponse;
        boolean meetSpec;
        
        Scanner userInput = new Scanner(System.in);

            
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
        
        // identifies instance reqSpec
        ProcSkel reqSpec = new ProcSkel();
        reqSpec.setReqCore(2);
        reqSpec.setReqFreq(2.5);
        reqSpec.setReqMem(100);
        reqSpec.setReqProcType("Intel");
        requiredSpecs(reqSpec);
        
        System.out.println("Pick 1-4 and decide which option works for Emyrion.");
        userResponse = userInput.nextInt();
        if (userResponse == 1) {
            intelISeven.displayProcInfo();
            meetSpec = specCompare(intelISeven, reqSpec);
        } // close if statement for intelISeven
        if (userResponse == 2) {
            intelPentium.displayProcInfo();
            meetSpec = specCompare(intelPentium, reqSpec);
        } // close if statement for intelPentium
        if(userResponse ==3) {
            intelCeleron.displayProcInfo();
            meetSpec = specCompare(intelCeleron, reqSpec);
        } // close if statement for intelCeleron
        if(userResponse == 4) {
            MattProc.displayProcInfo();
            meetSpec = specCompare(MattProc, reqSpec);
        } // close if statement for MattProc
    } // end main method
    
    public static boolean specCompare(ProcSkel ps, ProcSkel required) {
        boolean finalDecision = true;
        if(ps.getGfxMaxMem() >= required.getReqMem()) {
            System.out.println("Your processor's memory meets the minimum requirements!");
        }else{ // close required memory comparison
            System.out.println("Your processor's memory does not meet the minimum requirements!");
            finalDecision = false;
        } // close else statement for required memory comparison
        if(ps.getProcFreq() >= required.getReqFreq()) {
            System.out.println("Your processor's frequency meets the minimum requirements!");
    }else{ // close required processor frequency comparison (GHz)
            System.out.println("Your processor's frequency does not meet the minimum requirements!");
            finalDecision = false;
        } // close else statement for required frequency comparison (GHz)
        if(ps.getCoreCount() >= required.getReqCore()) {
            System.out.println("Your processor's core count meets the minimum requirements!");
        }else{ // close required processor core count comparison
            System.out.println("Your processor's core count does not meet the minimum requirements!");
            finalDecision = false;
        } // close else statement for required core count comparison
        return finalDecision;
    } // close specCompare

    public static void requiredSpecs(ProcSkel args){
        System.out.println("Recommended Memory: " + args.getReqMem());
        System.out.println("Recommended Processor Frequency: " + args.getReqFreq());
        System.out.println("Recommended Core Count: "  + args.getReqCore());
        System.out.println("Recommended Processor Type: " + args.getReqProcType());
        
    } // close req method
    public static void intelIsEvenDisplay (ProcSkel args) {
        System.out.println("Intel i7 Memory: " + args.getGfxMaxMem());
        System.out.println("Intel i7 Frequency: " + args.getProcFreq());
        System.out.println("Intel i7 Core Count: " + args.getCoreCount());
        System.out.println("Intel i7 Number: " + args.getProcNum());
        System.out.println("Intel i7 Processor GFX: " + args.getProcGfx());
    } // close intelISevenDisplay method
    
    public static void intelPentiumDisplay (ProcSkel args) {
         System.out.println("Intel Pentium Memory: " + args.getGfxMaxMem());
        System.out.println("Intel Pentium Frequency: " + args.getProcFreq());
        System.out.println("Intel Pentium Core Count: " + args.getCoreCount());
        System.out.println("Intel Pentium Number: " + args.getProcNum());
        System.out.println("Intel Pentium Processor GFX: " + args.getProcGfx());     
    } // close intelPentiumDisplay method
    
    public static void intelCeleronDisplay (ProcSkel args) {
        System.out.println("Intel Celeron Memory: " + args.getGfxMaxMem());
        System.out.println("Intel Celeron Frequency: " + args.getProcFreq());
        System.out.println("Intel Celeron Core Count: " + args.getCoreCount());
        System.out.println("Intel Celeron Number: " + args.getProcNum());
        System.out.println("Intel i7 Processor GFX: " + args.getProcGfx());       
    } // close intelCeleronDisplay method
    
    public static void intelMattProcDisplay (ProcSkel args) {
        System.out.println("Intel MattProc Memory: " + args.getGfxMaxMem());
        System.out.println("Intel MattProc Frequency: " + args.getProcFreq());
        System.out.println("Intel MattProc Core Count: " + args.getCoreCount());
        System.out.println("Intel MattProc Number: " + args.getProcNum());
        System.out.println("Intel MattProc Processor GFX: " + args.getProcGfx());       
    } // close intelMattProcDisplay method
    
} // end class
