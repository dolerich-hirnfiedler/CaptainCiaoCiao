package captainciaociao.kapitel_16._1_regular_streams_with_termianle_and_inter_ops;

public enum RareEarth {
    // 16.1.6 Doppelte Inseln mit Metallen der Seltenen Erden entfernen (Java 9) ***
    SCANDIUM("Scandium"), YTTRIUM("Yttrium"), LANTHAN("Lanthan"), CER("Cer"), PRAESEODYM(
            "Praeseodym"), NEODYM("Neodym"), PROMETHIUM("Promethium"), SAMARIUM(
                    "Samarium"), EUROPIUM("Europium"), GADOLINIUM("Gadolinium"), TERBIUM(
                            "Terbium"), DYSPROSIUM("Dystrosium"), HOLMIUM("Holmium"), ERBIUM(
                                    "Erbium"), THULIUM("Thulium"), YTTERBIUM(
                                            "Ytterbium"), LUTETIUM("Lutetium");

    private final String name;

    /**
     * @param name
     */
    private RareEarth(String name) {
        this.name = name;
    }

}
