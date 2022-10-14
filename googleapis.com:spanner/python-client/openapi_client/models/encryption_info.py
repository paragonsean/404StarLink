# coding: utf-8

"""
    Cloud Spanner API

    Cloud Spanner is a managed, mission-critical, globally consistent and scalable relational database service.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.status import Status
from typing import Optional, Set
from typing_extensions import Self

class EncryptionInfo(BaseModel):
    """
    Encryption information for a Cloud Spanner database or backup.
    """ # noqa: E501
    encryption_status: Optional[Status] = Field(default=None, alias="encryptionStatus")
    encryption_type: Optional[StrictStr] = Field(default=None, description="Output only. The type of encryption.", alias="encryptionType")
    kms_key_version: Optional[StrictStr] = Field(default=None, description="Output only. A Cloud KMS key version that is being used to protect the database or backup.", alias="kmsKeyVersion")
    __properties: ClassVar[List[str]] = ["encryptionStatus", "encryptionType", "kmsKeyVersion"]

    @field_validator('encryption_type')
    def encryption_type_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['TYPE_UNSPECIFIED', 'GOOGLE_DEFAULT_ENCRYPTION', 'CUSTOMER_MANAGED_ENCRYPTION']):
            raise ValueError("must be one of enum values ('TYPE_UNSPECIFIED', 'GOOGLE_DEFAULT_ENCRYPTION', 'CUSTOMER_MANAGED_ENCRYPTION')")
        return value

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
        """Create an instance of EncryptionInfo from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        """
        excluded_fields: Set[str] = set([
            "encryption_type",
            "kms_key_version",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of encryption_status
        if self.encryption_status:
            _dict['encryptionStatus'] = self.encryption_status.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of EncryptionInfo from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "encryptionStatus": Status.from_dict(obj["encryptionStatus"]) if obj.get("encryptionStatus") is not None else None,
            "encryptionType": obj.get("encryptionType"),
            "kmsKeyVersion": obj.get("kmsKeyVersion")
        })
        return _obj


