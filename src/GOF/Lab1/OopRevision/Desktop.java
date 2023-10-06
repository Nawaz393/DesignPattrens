package GOF.Lab1.OopRevision;

import GOF.Lab1.OopRevision.Computer;

public class Desktop extends Computer {

    float processor;
    int ram;

    public  Desktop (float processor ,int ram){
        this.processor=processor;
        this.ram=ram;
    }
    @Override
    public void machineName() {
        System.out.println("this is desktop");
    }

    @Override
    public void memorySize() {

        System.out.println("memory size is " +ram+"gb");
    }

    @Override
    public void processorSpecs() {

        System.out.println("size of processor is "+processor+"gb");
    }
}
