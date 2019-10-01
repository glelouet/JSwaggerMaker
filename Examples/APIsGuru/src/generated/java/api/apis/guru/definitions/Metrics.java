package api.apis.guru.definitions;

public class Metrics {
    /**
     * Number of APIs
     */
    public long numAPIs;
    /**
     * Total number of endpoints inside all specifications
     */
    public long numEndpoints;
    /**
     * Number of API specifications including different versions of the same API
     */
    public long numSpecs;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Metrics othersame = ((Metrics) other);
        if (numAPIs!= othersame.numAPIs) {
            return false;
        }
        if (numEndpoints!= othersame.numEndpoints) {
            return false;
        }
        if (numSpecs!= othersame.numSpecs) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((Long.hashCode(numAPIs)+ Long.hashCode(numEndpoints))+ Long.hashCode(numSpecs));
    }
}
