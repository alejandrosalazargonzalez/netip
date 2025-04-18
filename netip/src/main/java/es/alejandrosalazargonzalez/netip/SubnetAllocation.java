package es.alejandrosalazargonzalez.netip;

/**
 * Clase para almacenar la asignación de una subred en el modo VLSM.
 * 
 * @author: alejandrosalazargonzalez
 * @version: 1.0.0
 */
public class SubnetAllocation {
    int id;
    int hostsRequired;
    int prefix;
    long networkAddress;
    long broadcastAddress;
    long blockSize;

    /**
     * Constructor de la clase SubnetAllocation.
     * @param id
     * @param hostsRequired
     * @param prefix
     * @param networkAddress
     */
    public SubnetAllocation(int id, int hostsRequired, int prefix, long networkAddress) {
        this.id = id;
        this.hostsRequired = hostsRequired;
        this.prefix = prefix;
        this.blockSize = 1L << (32 - prefix);
        this.networkAddress = networkAddress;
        this.broadcastAddress = networkAddress + blockSize - 1;
    }
}
