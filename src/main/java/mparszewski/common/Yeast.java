package mparszewski.common;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Yeast {

    /**
     * Accession number for the SWISS-PROT database
     */
    private String sequenceName;

    /**
     * McGeoch's method for signal sequence recognition.
     */
    private float mcg;

    /**
     * von Heijne's method for signal sequence recognition.
     */
    private float gvh;

    /**
     * Score of the ALOM membrane spanning region prediction program.
     */
    private float alm;

    /**
     * Score of discriminant analysis of the amino acid content of
     * the N-terminal region (20 residues long) of mitochondrial and
     * non-mitochondrial proteins.
     */
    private float mit;

    /**
     * Presence of "HDEL" substring (thought to act as a signal for
     * retention in the endoplasmic reticulum lumen). Binary attribute.
     */
    private float erl;

    /**
     * Peroxisomal targeting signal in the C-terminus.
     */
    private float pox;

    /**
     * Score of discriminant analysis of the amino acid content of
     * vacuolar and extracellular proteins.
     */
    private float vac;

    /**
     * Score of discriminant analysis of nuclear localization signals
     * of nuclear and non-nuclear proteins.
     */
    private float nuc;

    /**
     * The class is the localization site. Please see Nakai &
     * Kanehisa referenced above for more details.
     */
    private String classDistribution;
}
