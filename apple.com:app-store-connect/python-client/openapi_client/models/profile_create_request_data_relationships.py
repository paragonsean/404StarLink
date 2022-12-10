# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.bundle_id_capability_create_request_data_relationships_bundle_id import BundleIdCapabilityCreateRequestDataRelationshipsBundleId
from openapi_client.models.profile_create_request_data_relationships_certificates import ProfileCreateRequestDataRelationshipsCertificates
from openapi_client.models.profile_create_request_data_relationships_devices import ProfileCreateRequestDataRelationshipsDevices
from typing import Optional, Set
from typing_extensions import Self

class ProfileCreateRequestDataRelationships(BaseModel):
    """
    ProfileCreateRequestDataRelationships
    """ # noqa: E501
    bundle_id: BundleIdCapabilityCreateRequestDataRelationshipsBundleId = Field(alias="bundleId")
    certificates: ProfileCreateRequestDataRelationshipsCertificates
    devices: Optional[ProfileCreateRequestDataRelationshipsDevices] = None
    __properties: ClassVar[List[str]] = ["bundleId", "certificates", "devices"]

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
        """Create an instance of ProfileCreateRequestDataRelationships from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of bundle_id
        if self.bundle_id:
            _dict['bundleId'] = self.bundle_id.to_dict()
        # override the default output from pydantic by calling `to_dict()` of certificates
        if self.certificates:
            _dict['certificates'] = self.certificates.to_dict()
        # override the default output from pydantic by calling `to_dict()` of devices
        if self.devices:
            _dict['devices'] = self.devices.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ProfileCreateRequestDataRelationships from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "bundleId": BundleIdCapabilityCreateRequestDataRelationshipsBundleId.from_dict(obj["bundleId"]) if obj.get("bundleId") is not None else None,
            "certificates": ProfileCreateRequestDataRelationshipsCertificates.from_dict(obj["certificates"]) if obj.get("certificates") is not None else None,
            "devices": ProfileCreateRequestDataRelationshipsDevices.from_dict(obj["devices"]) if obj.get("devices") is not None else None
        })
        return _obj


