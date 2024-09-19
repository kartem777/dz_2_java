public class Computer {
    private String brand;
    private int year;
    private Processor processor;

    public Computer(String brand, int year) {
        this.brand = brand;
        this.year = year;
        this.processor = new Processor();
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void getUpgradeMethod(int cores){
        processor.upgrade(cores);
    }

    public int getCoresMethod(){
        return processor.getCores();
    }
    public void start() {
        class PowerSupply {
            public void powerOn() {
                System.out.println("On");
            }
        }

        PowerSupply powerSupply = new PowerSupply();
        powerSupply.powerOn();
    }


    private class Processor {
        private int cores;

        public Processor() {
            this.cores = 4;
        }

        public void upgrade(int cores) {
            this.cores = cores;
        }

        public int getCores() {
            return cores;
        }
    }

    public static class Monitor {
        private String resolution;

        public Monitor(String resolution) {
            this.resolution = resolution;
        }

        public String getResolution() {
            return resolution;
        }

        public void setResolution(String resolution) {
            this.resolution = resolution;
        }

        @Override
        public String toString() {
            return "Monitor with resolution: " + resolution;
        }
    }
}
