package LatPraktikum5;

/**
 *
 * @author NURUL ARIFIN 19MI0016
 * 
 */
        
public class Mahasiswa implements Comparable{
    private String nrp;
    private String nama;
    private Double ipk;
    public Mahasiswa(String nrp, String nama, Double ipk){
        this.nrp = nrp;
        this.nama = nama;
        this.ipk = ipk;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNrp(){
        return nrp;
    }
    public void setNrp(String nrp){
        this.nrp = nrp;
    }
    public Double getIpk(){
        return ipk;
    }
    public void setIpk(Double ipk){
        this.ipk = ipk;
    }
    @Override
    public String toString(){
        return "Mahasiswa{" + "nrp=" + nrp + " nama=" + nama + " ipk=" + ipk + '}';
    }
    public int compareTo(Object o){
        Mahasiswa m2 = (Mahasiswa) o;
        return this.nrp.compareTo(m2.nrp);
    }
}
