package GOF.Lab1.OopRevision;

import GOF.Lab1.OopRevision.Computer;

public class Laptop extends Computer {
int ram;
float processor;

    public  Laptop (int ram,float processor)
    {

        this.processor=processor;
        this.ram=ram;


    }
    @Override
    public void machineName() {
        System.out.println(" this a laptop");
    }

    @Override
    public void memorySize() {

        System.out.println("Memory Size is "+ram+"gb");
    }

    @Override
    public void processorSpecs() {
        System.out.println("processor is "+processor+"ghz");

    }


}
