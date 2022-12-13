# coding: utf-8

"""
    Meghalaya Board of School Education, Tura, Meghalaya

    Meghalaya Board of School Education (MBOSE) with Marksheets of Class Xth and Class XIIth (Arts , Science, Commerce and Vocational), is availablke on DigiLocker for the students of 2015-2019.

    The version of the OpenAPI document: 3.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List
from typing_extensions import Annotated
from openapi_client.models.consent_artifact_schema_consent_permission_date_range import ConsentArtifactSchemaConsentPermissionDateRange
from openapi_client.models.consent_artifact_schema_consent_permission_frequency import ConsentArtifactSchemaConsentPermissionFrequency
from typing import Optional, Set
from typing_extensions import Self

class ConsentArtifactSchemaConsentPermission(BaseModel):
    """
    ConsentArtifactSchemaConsentPermission
    """ # noqa: E501
    access: Annotated[str, Field(min_length=1, strict=True)]
    date_range: ConsentArtifactSchemaConsentPermissionDateRange = Field(alias="dateRange")
    frequency: ConsentArtifactSchemaConsentPermissionFrequency
    __properties: ClassVar[List[str]] = ["access", "dateRange", "frequency"]

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
        """Create an instance of ConsentArtifactSchemaConsentPermission from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of date_range
        if self.date_range:
            _dict['dateRange'] = self.date_range.to_dict()
        # override the default output from pydantic by calling `to_dict()` of frequency
        if self.frequency:
            _dict['frequency'] = self.frequency.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ConsentArtifactSchemaConsentPermission from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "access": obj.get("access"),
            "dateRange": ConsentArtifactSchemaConsentPermissionDateRange.from_dict(obj["dateRange"]) if obj.get("dateRange") is not None else None,
            "frequency": ConsentArtifactSchemaConsentPermissionFrequency.from_dict(obj["frequency"]) if obj.get("frequency") is not None else None
        })
        return _obj


