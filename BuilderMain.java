
public class BuilderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Computer gamingPC = new Computer.Builder()
                 .setCPU("Intel i9")
                 .setRAM("32GB")
                 .setStorage("1TB SSD")
                 .setGraphicsCard("NVIDIA RTX 3080")
                 .build();


Computer officePC = new Computer.Builder()
                 .setCPU("Intel i5")
                 .setRAM("16GB")
                 .setStorage("512GB SSD")
                 .build();

System.out.println("Gaming PC: CPU=" + gamingPC.getCPU() + ", RAM=" + gamingPC.getRAM() +
            ", Storage=" + gamingPC.getStorage() + ", Graphics Card=" + gamingPC.getGraphicsCard());

System.out.println("Office PC: CPU=" + officePC.getCPU() + ", RAM=" + officePC.getRAM() +
            ", Storage=" + officePC.getStorage() + ", Graphics Card=" + officePC.getGraphicsCard());

	}

}
