package br.com.caiopaulucci.padroesdeprojetos.facade;
public class ComputadorFacade {
	private Cpu cpu = null;
	private Memoria memoria = null;
	private HardDrive hardDrive = null;
	
	private int BOOT_SECTOR = 1;
	private int SECTOR_SIZE = 1024;
	private int BOOT_ADDRESS = 0;
	

	public ComputadorFacade(Cpu cpu,
					Memoria memoria,
					HardDrive hardDrive) {
		this.cpu = cpu;
		this.memoria = memoria;
		this.hardDrive = hardDrive;
	}

	public void ligarComputador() {
		cpu.start();
		String hdBootInfo = hardDrive.read(BOOT_SECTOR, SECTOR_SIZE);
		memoria.load(BOOT_ADDRESS, hdBootInfo);
		cpu.execute();
		memoria.free(BOOT_ADDRESS, hdBootInfo);
	}
}