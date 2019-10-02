package esi.evetech.net.responses;

import esi.evetech.net.responses.getdogmadynamicitemstypeiditemid.GetDogmaDynamicItemsTypeIdItemIdDogmaAttributes;
import esi.evetech.net.responses.getdogmadynamicitemstypeiditemid.GetDogmaDynamicItemsTypeIdItemIdDogmaEffects;

public class GetDogmaDynamicItemsTypeIdItemId {
    /**
     * The ID of the character who created the item
     */
    public int created_by;
    /**
     * dogma_attributes array
     */
    public GetDogmaDynamicItemsTypeIdItemIdDogmaAttributes[] dogma_attributes;
    /**
     * dogma_effects array
     */
    public GetDogmaDynamicItemsTypeIdItemIdDogmaEffects[] dogma_effects;
    /**
     * The type ID of the mutator used to generate the dynamic item.
     */
    public int mutator_type_id;
    /**
     * The type ID of the source item the mutator was applied to create the dynamic item.
     */
    public int source_type_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetDogmaDynamicItemsTypeIdItemId othersame = ((GetDogmaDynamicItemsTypeIdItemId) other);
        if (created_by!= othersame.created_by) {
            return false;
        }
        if ((dogma_attributes!= othersame.dogma_attributes)&&((dogma_attributes == null)||(!dogma_attributes.equals(othersame.dogma_attributes)))) {
            return false;
        }
        if ((dogma_effects!= othersame.dogma_effects)&&((dogma_effects == null)||(!dogma_effects.equals(othersame.dogma_effects)))) {
            return false;
        }
        if (mutator_type_id!= othersame.mutator_type_id) {
            return false;
        }
        if (source_type_id!= othersame.source_type_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((created_by +((dogma_attributes == null)? 0 :dogma_attributes.hashCode()))+((dogma_effects == null)? 0 :dogma_effects.hashCode()))+ mutator_type_id)+ source_type_id);
    }
}
