# coding: utf-8

"""
    Migration Center API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: v1alpha1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class UploadFileInfo(BaseModel):
    """
    A resource that contains a URI to which a data file can be uploaded.
    """ # noqa: E501
    headers: Optional[Dict[str, StrictStr]] = Field(default=None, description="Output only. The headers that were used to sign the URL.")
    signed_uri: Optional[StrictStr] = Field(default=None, description="Output only. Upload URI for the file.", alias="signedUri")
    uri: Optional[StrictStr] = Field(default=None, description="Output only. Upload URI for the file.")
    uri_expiration_time: Optional[StrictStr] = Field(default=None, description="Output only. Expiration time of the upload URI.", alias="uriExpirationTime")
    __properties: ClassVar[List[str]] = ["headers", "signedUri", "uri", "uriExpirationTime"]

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
        """Create an instance of UploadFileInfo from a JSON string"""
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
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        """
        excluded_fields: Set[str] = set([
            "headers",
            "signed_uri",
            "uri",
            "uri_expiration_time",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of UploadFileInfo from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "headers": obj.get("headers"),
            "signedUri": obj.get("signedUri"),
            "uri": obj.get("uri"),
            "uriExpirationTime": obj.get("uriExpirationTime")
        })
        return _obj


