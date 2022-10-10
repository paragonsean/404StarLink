# coding: utf-8

"""
    Punjab State eGovernance Society, Punjab

    eDistrict Punjab (http://edistrict.punjabgovt.gov.in) is the online service delivery portal for Punjab State Govt. Certain documents issued by it (e.g. Residence, SC/ST, OBC Certificates etc) can be pulled into citizens' DigiLocker accounts.

    The version of the OpenAPI document: 3.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List
from typing_extensions import Annotated
from openapi_client.models.consent_artifact_schema_consent_data import ConsentArtifactSchemaConsentData
from openapi_client.models.consent_artifact_schema_consent_permission import ConsentArtifactSchemaConsentPermission
from openapi_client.models.consent_artifact_schema_consent_purpose import ConsentArtifactSchemaConsentPurpose
from openapi_client.models.consent_artifact_schema_consent_user import ConsentArtifactSchemaConsentUser
from typing import Optional, Set
from typing_extensions import Self

class ConsentArtifactSchemaConsent(BaseModel):
    """
    ConsentArtifactSchemaConsent
    """ # noqa: E501
    consent_id: Annotated[str, Field(min_length=1, strict=True)] = Field(description="A unique consent id in UUID format.", alias="consentId")
    data: ConsentArtifactSchemaConsentData
    data_consumer: ConsentArtifactSchemaConsentData = Field(alias="dataConsumer")
    data_provider: ConsentArtifactSchemaConsentData = Field(alias="dataProvider")
    permission: ConsentArtifactSchemaConsentPermission
    purpose: ConsentArtifactSchemaConsentPurpose
    timestamp: datetime = Field(description="Date time format in UTC, includes miliseconds YYYY-MM-DDThh:mm:ss.vZ")
    user: ConsentArtifactSchemaConsentUser
    __properties: ClassVar[List[str]] = ["consentId", "data", "dataConsumer", "dataProvider", "permission", "purpose", "timestamp", "user"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of ConsentArtifactSchemaConsent from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of data
        if self.data:
            _dict['data'] = self.data.to_dict()
        # override the default output from pydantic by calling `to_dict()` of data_consumer
        if self.data_consumer:
            _dict['dataConsumer'] = self.data_consumer.to_dict()
        # override the default output from pydantic by calling `to_dict()` of data_provider
        if self.data_provider:
            _dict['dataProvider'] = self.data_provider.to_dict()
        # override the default output from pydantic by calling `to_dict()` of permission
        if self.permission:
            _dict['permission'] = self.permission.to_dict()
        # override the default output from pydantic by calling `to_dict()` of purpose
        if self.purpose:
            _dict['purpose'] = self.purpose.to_dict()
        # override the default output from pydantic by calling `to_dict()` of user
        if self.user:
            _dict['user'] = self.user.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ConsentArtifactSchemaConsent from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "consentId": obj.get("consentId"),
            "data": ConsentArtifactSchemaConsentData.from_dict(obj["data"]) if obj.get("data") is not None else None,
            "dataConsumer": ConsentArtifactSchemaConsentData.from_dict(obj["dataConsumer"]) if obj.get("dataConsumer") is not None else None,
            "dataProvider": ConsentArtifactSchemaConsentData.from_dict(obj["dataProvider"]) if obj.get("dataProvider") is not None else None,
            "permission": ConsentArtifactSchemaConsentPermission.from_dict(obj["permission"]) if obj.get("permission") is not None else None,
            "purpose": ConsentArtifactSchemaConsentPurpose.from_dict(obj["purpose"]) if obj.get("purpose") is not None else None,
            "timestamp": obj.get("timestamp"),
            "user": ConsentArtifactSchemaConsentUser.from_dict(obj["user"]) if obj.get("user") is not None else None
        })
        return _obj


