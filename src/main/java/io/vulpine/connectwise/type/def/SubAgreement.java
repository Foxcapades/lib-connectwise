package io.vulpine.connectwise.type.def;

import io.vulpine.connectwise.type.def.gen.HasAgreementId;
import io.vulpine.connectwise.type.def.gen.HasId;
import io.vulpine.connectwise.type.def.gen.HasLastUpdate;
import io.vulpine.connectwise.type.def.gen.HasUpdatedBy;

interface SubAgreement extends HasAgreementId, HasId, HasLastUpdate, HasUpdatedBy, XmlSerializable
{
}
